var app = {};
app.id = 'hrapp';
app.title = 'HR Management Application';
app.name = 'hr-app';
app.modules = [];

var module = {};
app.modules.push(module);
module.id = 'cvmodule';
module.name = 'cv-module';
module.classes = [];

var claz = {};
module.classes.push(claz);
claz.id = 'applicant';
claz.name = 'Applicant';
claz.fields = [];

var field = {};
claz.fields.push(field);
field.id = 'firstName';
field.name = 'First Name';


vertx.setPeriodic(3000, function(id) {
    vertx.eventBus().publish("application-feed", app);
});

