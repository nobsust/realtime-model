package com.github.nobsust.rltb.util;

import com.github.nobsust.rltb.core.Application;
import com.github.nobsust.rltb.core.HasIdentifiers;
import com.github.nobsust.rltb.core.Module;

/**
 * Created by Sam on 2/21/2017.
 */
public class Runner {

    public static void main(String args) {

        // --- ACCOUNTS application

        HasIdentifiers application = new Application("accounts");
        application.addIdentifier(new Module("daily"));

    }

}
