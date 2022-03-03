package com.dvivasva.gateway.message;


import com.dvivasva.gateway.utils.Topic;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class Receiver {

    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);


    @KafkaListener(topics = Topic.RESPONSE_PAYMENT, groupId = "group_id_gateway")
    public void consumeFormPayment(String param) {
        logger.info("Has been published an insert payment from service payment-krf : " + param);
    }



}
