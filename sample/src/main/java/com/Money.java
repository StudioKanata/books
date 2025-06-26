package com;

import java.util.Currency;

public class Money {

    public final int amount;

    public final Currency currency;

    /**
     * Constructs a Money instance with the specified amount and currency.
     *
     * @param amount   the amount of money
     * @param currency the currency of the money
     * @throws IllegalArgumentException if the amount is negative
     * @throws NullPointerException if the currency is null
     */
    public Money(int amount, Currency currency) {
        // this.amount = amount;
        // this.currency = currency;
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        
        if (currency == null) {
            throw new NullPointerException(null);
        }
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Adds the specified amount to this Money instance.
     *
     * @param other the amount to add
     */
    public Money add(final Money other) {
        if (!currency.equals(other.currency)) {
            throw new IllegalArgumentException("Cannot add money with different currencies");
        }

        final int added = amount + other.amount;
        
        return new Money(added, currency);
    }

}
