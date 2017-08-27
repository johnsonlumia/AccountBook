package com.renjie;

/**
 * com.renjie.Usage
 *
 *
 * @author renjiezhu
 * @version 0.0
 * @since 7/19/17
 */

import java.util.ArrayList;

class Event {

    /*
     * field
     */
    private User payer = new User();

    private ArrayList<User> payees = new ArrayList<User>();

    private Usage usage = null;

    private double amount = 0.0d;

    private Currency currency = null;

    private String description = "";

    /*
     * getters and setters
     */

    public User getPayer() {
        return payer;
    }

    public void setPayer(User payer) {
        this.payer = payer;
    }

    public ArrayList<User> getPayees() {
        return payees;
    }

    public void setPayees(ArrayList<User> payees) {
        this.payees = payees;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    Event() {
        setAmount(2.0);
        User temp = new User("name", 100.0);
        setPayer(temp);
        setCurrency(Currency.USD);
        setDescription("com.renjie.test description");

    }

    @Override
    public String toString() {
        return payer.toString() + "\n"
                + getDescription() + "\n" +getAmount()+ getCurrency();
    }
}