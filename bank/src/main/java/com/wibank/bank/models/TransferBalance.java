package com.wibank.bank.models;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferBalance {
    private Long from;
    private Long to;
    private BigDecimal amount;


}
