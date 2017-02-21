package com.github.nobsust.rltb.core;

/**
 * Created by Sam on 2/21/2017.
 */
public class Claz extends Identifier implements HasIdentifiers {

    public Claz(String classId) {
        super(classId);
    }

    @Override
    public Identifier getIdentifier(Id id) {
        return null;
    }

    @Override
    public void addIdentifier(Identifier identifier) {

    }
}
