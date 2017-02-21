package com.github.nobsust.rltb.util;

import com.github.nobsust.rltb.core.*;

import java.util.Map;

/**
 * Created by Sam on 2/21/2017.
 */
public class Runner {

    public static void main(String[] args) {

        Field amount = new Field("amount", DataType.INTEGER, null);
        Field date = new Field("date", DataType.DATE, null);

        Claz claz = new Claz("expense");
        claz.addIdentifier(amount);
        claz.addIdentifier(date);

        Module module = new Module("daily");
        module.addIdentifier(claz);

        Application application = new Application("accounts");
        application.addIdentifier(module);

        application.pack();

        Map<String, Identifier> identifiers = application.getSubIdentifiers();

    }

}
