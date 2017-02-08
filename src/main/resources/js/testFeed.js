vertx.setPeriodic(2000, function(id) {
    vertx.eventBus().publish("test-feed", "from javaScript....")
});