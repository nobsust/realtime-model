package com.github.nobsust.rltb.sample;

import com.github.nobsust.rltb.core.*;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;

/**
 * Created by Sam on 2/21/2017.
 */
public class AccountsApplication extends AbstractVerticle {

    @Override
    public void start() throws Exception {

        // FIELDS
        Field amount = new Field("amount", DataType.INTEGER, null);
        Field date = new Field("date", DataType.DATE, null);

        // CLASSES
        Claz claz = new Claz("expense");
        claz.addIdentifier(amount);
        claz.addIdentifier(date);

        // MODULES
        Module module = new Module("daily");
        module.addIdentifier(claz);

        // APPLICATION
        Application application = new Application("accounts");
        application.addIdentifier(module);

        application.pack();

        EventBus eventBus = vertx.eventBus();
        eventBus.publish("app.persist-ready", "Yay! Someone kicked a ball");

    }

}
