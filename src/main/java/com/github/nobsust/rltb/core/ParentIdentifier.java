package com.github.nobsust.rltb.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sam on 2/21/2017.
 */
public abstract class ParentIdentifier implements Identifier {

    protected Id id = null;

    private Map<Id, Identifier> identifiers = new HashMap<>();

    public ParentIdentifier(String identifierId) {
        id = new Id(identifierId);
    }

    @Override
    public Id getId() {
        return this.id;
    }

    @Override
    public void setId(Id id) {
        this.id = id;
    }

    public Map<Id, Identifier> getIdentifiers() {
        return identifiers;
    }

    public Identifier getIdentifier(Id id) {
        return identifiers.get(id);
    }

    public void addIdentifier(Identifier identifier) {
        identifiers.put(identifier.getId(), identifier);
    }

}
