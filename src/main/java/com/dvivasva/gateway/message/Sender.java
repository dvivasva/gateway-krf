package com.dvivasva.gateway.message;

import com.dvivasva.gateway.entity.RequestBuyBootCoin;
import com.dvivasva.gateway.utils.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class Sender {
    private static final Logger logger= LoggerFactory.getLogger(Sender.class);


    private KafkaTemplate<String, RequestBuyBootCoin> kafkaTemplate;

    public Sender(KafkaTemplate<String, RequestBuyBootCoin> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public String sendRequestBuyBootCoin(RequestBuyBootCoin value) {
        kafkaTemplate.send(Topic.REQUEST_BUY,value);
        logger.info("Messages successfully pushed on topic: " + Topic.REQUEST_BUY);
        return "Sending BootCoin purchase request ->";
    }

}
