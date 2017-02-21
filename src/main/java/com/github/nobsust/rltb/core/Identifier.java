package com.github.nobsust.rltb.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sam on 2/21/2017.
 */
public abstract class Identifier {

    protected Id id = null;

    protected Map<Id, Identifier> identifiers = new HashMap<>();

    public Identifier(String identifierId) {
        this.id = new Id(identifierId);
    }

    public Id getId() {
        return this.id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Map<Id, Identifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Map<Id, Identifier> identifiers) {
        this.identifiers = identifiers;
    }
}
