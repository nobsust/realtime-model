package com.github.nobsust.rltb;

import com.github.nobsust.rltb.db.AppPersister;
import com.github.nobsust.rltb.sample.AccountsApplication;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * Created by Sam on 2/8/2017.
 */
public class Main extends AbstractVerticle {

    @Override
    public void start(Future<Void> startFuture) throws Exception {

        vertx.deployVerticle(new AppPersister());
        vertx.deployVerticle(new AccountsApplication());

        /*vertx.deployVerticle(new AppPersister(), res -> {
            if (res.succeeded()) {
                vertx.deployVerticle(new AccountsApplication());
                startFuture.complete();
            } else {
                startFuture.fail(res.cause());
            }
        });*/

    }

    public void doNothing() {
         /*VertxOptions options = new VertxOptions().setClustered(true).setClusterHost("localhost");
        Vertx.clusteredVertx(options, resultHandler -> {
            Vertx vertx = resultHandler.result();
            vertx.deployVerticle(new ServerVerticle());
            vertx.deployVerticle(new TestFeed());
        });*/

        /*Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new ServerVerticle());
        vertx.deployVerticle(new TestFeed());
        vertx.deployVerticle("js/testFeed.js");
        vertx.deployVerticle("js/dendrogramFeed.js");
        vertx.deployVerticle("js/applicationVerticle.js");*/
    }

}
