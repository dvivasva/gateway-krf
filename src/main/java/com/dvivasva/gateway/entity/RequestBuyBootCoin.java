package com.dvivasva.gateway.entity;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestBuyBootCoin{
    private double amount;
    private String payMode;
    private String number;
}
