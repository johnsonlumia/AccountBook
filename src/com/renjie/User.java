package com.renjie;

class User {

    private String name = "";

    private double balance = 0.0d;

    User() {

    }

    User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    protected String getName() {
        return name;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected void modifyBalance(double changeInBalance) {

    }

    @Override
    public String toString() {
        return name + "'s balance: " + balance;
    }
    
}
