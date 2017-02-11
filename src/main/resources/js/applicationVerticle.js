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
field.type = 'text';

function pack(app) {

    var id = app.id;
    // modules
    for(var m = 0; m < app.modules.length; m++) {
        var module = app.modules[m];
        id += '.' + module.id;
        // set module id
        module.id = id;

        // classes
        for(var c = 0; c < module.classes.length; c++) {
            var claz = module.classes[c];
            id += '.' + claz.id;
            // set claz id
            claz.id = id;

            for(var f = 0; f < claz.fields.length; f++) {
                var field = claz.fields[f];
                id += '.' + field.id;
                // set field id
                field.id = id;
            }
        }
    }

}

var packedApp = pack(app);

vertx.setPeriodic(3000, function(id) {
    vertx.eventBus().publish("application-feed", app);
});

