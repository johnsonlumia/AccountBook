package com.renjie;

/**
 * com.renjie.Usage
 *
 *
 * @author renjiezhu
 * @version 0.0
 * @since 7/19/17
 */


enum Usage {

    INCOME("income"),
    FOOD("food"),
    DRINK("drink"),
    SUPPLIES("supplies"),
    TRANSPORTATION("transportation"),
    ;

    private String name;

    Usage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
