package com.github.nobsust.rltb;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

/**
 * Created by Sam on 2/8/2017.
 */
public class Main extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        /*VertxOptions options = new VertxOptions().setClustered(true).setClusterHost("localhost");
        Vertx.clusteredVertx(options, resultHandler -> {
            Vertx vertx = resultHandler.result();
            vertx.deployVerticle(new ServerVerticle());
            vertx.deployVerticle(new TestFeed());
        });*/

        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new ServerVerticle());
        vertx.deployVerticle(new TestFeed());
        vertx.deployVerticle("js/testFeed.js");
        vertx.deployVerticle("js/dendrogramFeed.js");
    }
}
