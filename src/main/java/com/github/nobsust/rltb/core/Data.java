package com.github.nobsust.rltb.core;

/**
 * Created by Sam on 2/21/2017.
 */
public class Data {

    private DataType type;
    private String value;

    public Data(DataType type, String value) {
        this.type = type;
        this.value = value;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
