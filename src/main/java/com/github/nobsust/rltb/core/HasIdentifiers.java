package com.github.nobsust.rltb.core;

/**
 * Created by Sam on 2/21/2017.
 */
public interface HasIdentifiers {

    Identifier getIdentifier(Id id);

    void addIdentifier(Identifier identifier);

}