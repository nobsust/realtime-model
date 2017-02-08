package com.github.nobsust.rltb;

import io.vertx.core.AbstractVerticle;

/**
 * Created by Sam on 2/8/2017.
 */
public class TestFeed extends AbstractVerticle {
    @Override
    public void start() throws Exception {
        vertx.setPeriodic(2000, h -> vertx.eventBus().publish("test-feed", "from server...."));
    }
}
