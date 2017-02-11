var eb = new EventBus("http://localhost:8080/eventbus/application-feed/");
eb.onopen = function () {
    eb.registerHandler("application-feed", function (err, msg) {
        var str = "<code>" + JSON.stringify(msg.body) + "</code><br>";
        $('#status').prepend(str);
    });
}
