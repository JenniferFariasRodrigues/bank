package com.bank2.integration;

/**
 * Created by Par Renyard on 5/12/21.
 */
public class Bank2AccountBalance {

    private Double balance;
    private String currency;

    public Bank2AccountBalance(Double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public Double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }
}
