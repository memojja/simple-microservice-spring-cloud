package com.example.demo;

import java.io.Serializable;

/**
 * Created by memojja on 24/07/2017.
 */

public class Account implements Serializable{

    private static final long serialVersionUID = 1L;
    private Long amount;
    private String number;
    private String name;

    public Account(){

    }

    public Account(Long amount, String number, String name) {
        this.amount = amount;
        this.number = number;
        this.name = name;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
