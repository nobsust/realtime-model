package com.github.nobsust.rltb.core;

/**
 * Created by Sam on 2/21/2017.
 */
public class Field extends ParentIdentifier {

    private Data data;

    public Field(String fieldId, DataType type, String value) {
        super(fieldId);
        this.data = new Data(type, value);
    }


}
