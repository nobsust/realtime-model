package com.github.nobsust.rltb;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;
import io.vertx.ext.web.handler.sockjs.BridgeEvent;
import io.vertx.ext.web.handler.sockjs.BridgeOptions;
import io.vertx.ext.web.handler.sockjs.PermittedOptions;
import io.vertx.ext.web.handler.sockjs.SockJSHandler;

/**
 * Created by Sam on 2/8/2017.
 */
public class ServerVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);

        // test feed
        BridgeOptions testFeedoptions = new BridgeOptions().addOutboundPermitted(new PermittedOptions().setAddress("test-feed"));
        router.route("/eventbus/test-feed/*").handler(SockJSHandler.create(vertx).bridge(testFeedoptions, event -> {
            if (event.type() == BridgeEvent.Type.SOCKET_CREATED) {
                System.out.println("test feed socket was created");
            }
            event.complete(true);
        }));

        // dendrogram feed
        BridgeOptions dendrogramFeedOptions = new BridgeOptions().addOutboundPermitted(new PermittedOptions().setAddress("dendrogram-feed"));
        router.route("/eventbus/dendrogram-feed/*").handler(SockJSHandler.create(vertx).bridge(dendrogramFeedOptions, event -> {
            if (event.type() == BridgeEvent.Type.SOCKET_CREATED) {
                System.out.println("dendrogram feed socket was created");
            }
            event.complete(true);
        }));

        router.route().handler(StaticHandler.create());

        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
}
