var appSchema = {};
appSchema.id = 'hrapp';
appSchema.title = 'HR Management Application';
appSchema.name = 'hr-app';
appSchema.modules = [];

var module = {};
appSchema.modules.push(module);
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
field.value = '';

function packSchema(schema) {

    var _modules = [], _classes = [], _fields = [];
    var

    var id = schema.id;
    // modules
    for(var m = 0; m < schema.modules.length; m++) {
        var module = schema.modules[m];
        id += '.' + module.id;
        // set module id
        module.id = id;
        _modules.push(id);

        // classes
        for(var c = 0; c < module.classes.length; c++) {
            var claz = module.classes[c];
            id += '.' + claz.id;
            // set claz id
            claz.id = id;
            _classes.push(id);

            for(var f = 0; f < claz.fields.length; f++) {
                var field = claz.fields[f];
                id += '.' + field.id;
                // set field id
                field.id = id;
                _fields.push(id);
            }
        }
    }

    return {
        id: schema.id,
        modules: _modules,
        classes: _classes,
        fields: _fields
    }

}

schema = packSchema(appSchema);

//----------------------------------------------------------------------------------------------------------------------
// DATA MODEL
function buildDataModel(appSchema) {

    for()

}

function buildModel(schema) {
    var model = {};

}






vertx.setPeriodic(3000, function(id) {
    vertx.eventBus().publish("application-feed", { schema: schema});
});

