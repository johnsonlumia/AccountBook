package com.renjie;

/**
 * com.renjie.Currency normally used
 * com.renjie.Currency type and exchange rate included
 *
 *
 * @author renjiezhu
 * @version 0.0
 * @since 7/19/17
 */
enum Currency {
    CNY("Chinese Yuan", 1.0),
    USD("US Dollar", 6.8)
    ;

    private String type;
    private double exchangeRate;

//    constructor

    Currency() {
        this.type = "";
        this.exchangeRate = 0.0;
    }

    Currency(String type, double exchangeRate) {
        this.type = type;
        this.exchangeRate = exchangeRate;
    }

    public String getType() {
        return type;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
