package com.github.nobsust.rltb.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sam on 2/9/2017.
 */
public class Application implements Identifier {

    private String id;

    // modules
    private Map<Id, Identifier> modules;

    public Application(String id) {

        modules = new HashMap<>();

    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
