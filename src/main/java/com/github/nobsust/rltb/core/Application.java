package com.github.nobsust.rltb.core;

/**
 * Created by Sam on 2/9/2017.
 */
public class Application extends Identifier implements HasIdentifiers {

    public Application(String applicationId) {
        super(applicationId);
    }

    @Override
    public Identifier getIdentifier(Id id) {
        return this.identifiers.get(id);
    }

    @Override
    public void addIdentifier(Identifier identifier) {
        this.identifiers.put(identifier.getId(), identifier);
    }

}
