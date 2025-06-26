package com.example;

import java.util.Currency;

import com.Money;

public class Main {
    public static void main(String[] args) {

        Currency currency = java.util.Currency.getInstance("USD");
        Money money =  new Money(100, currency);
        money.add(new Money(300, currency));
        System.out.println("Money created with amount: " + money.amount + " and currency: " + money.currency);

    }
}