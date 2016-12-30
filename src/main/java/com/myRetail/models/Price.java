package com.myRetail.models;

import javax.persistence.Entity;

/**
 * Created by fjorgeDevelopers on 12/28/16.
 */
@Entity
public class Price {
    private String value;
    private String currency_code;
    public Price(String value, String currency_code){
        this.value = value;
        this.currency_code = currency_code;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public String getValue() {

        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
