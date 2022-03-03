package com.dvivasva.gateway.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private String id;
    private double amount;
    private String payMode;
    private String numberPhoneOrAccount;
}
