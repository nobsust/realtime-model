package com.github.nobsust.rltb.db;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.MessageConsumer;

/**
 * Created by Sam on 2/21/2017.
 */
public class AppPersister extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        EventBus eventBus = vertx.eventBus();

        MessageConsumer<String> consumer = eventBus.consumer("app.persist-ready");
        consumer.handler(message -> {
            System.out.println("I have received a message: " + message.body());
        });

    }
}
