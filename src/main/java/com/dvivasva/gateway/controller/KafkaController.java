package com.dvivasva.gateway.controller;

import com.dvivasva.gateway.entity.RequestBuyBootCoin;
import com.dvivasva.gateway.message.Sender;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buy-bootCoin")
public class KafkaController {

    private final Sender sender;

    @PostMapping("/request")
    public ResponseEntity<String> requestBuy(@RequestBody RequestBuyBootCoin requestBuyBootCoin){
        this.sender.sendRequestBuyBootCoin(requestBuyBootCoin);
        var value= "Sending BootCoin purchase request ->";
        return new ResponseEntity<>(value, HttpStatus.OK);
    }









}
