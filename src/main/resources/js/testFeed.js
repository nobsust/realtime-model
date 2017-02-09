var userList = [
    {id: 1, name: "Nimal"},
    {id: 2, name: "Kamal"},
    {id: 2, name: "Upul"}
    ];
vertx.setPeriodic(2000, function(id) {
    vertx.eventBus().publish("test-feed", userList);
});