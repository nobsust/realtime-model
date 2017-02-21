package com.github.nobsust.rltb.core;

/**
 * Created by Sam on 2/21/2017.
 */
public class Field extends Identifier implements HasIdentifiers {

    public Field(String fieldId) {
        super(fieldId);
    }

    @Override
    public Identifier getIdentifier(Id id) {
        return null;
    }

    @Override
    public void addIdentifier(Identifier identifier) {

    }
}
