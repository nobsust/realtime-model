package com.github.nobsust.rltb.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sam on 2/9/2017.
 */
public class Application extends ParentIdentifier {

    private Map<String, Identifier> subIdentifiers;

    public Application(String applicationId) {
        super(applicationId);
        subIdentifiers = new HashMap<>();
    }

    public Map<String, Identifier> getSubIdentifiers() {
        return subIdentifiers;
    }

    public void pack() {

        String appId = this.id.getValue();
        // modules
        Map<Id, Identifier> modules = this.getIdentifiers();
        for (Map.Entry<Id, Identifier> moduleEntry : modules.entrySet()) {
            Id moduleKey = moduleEntry.getKey();
            Module module = (Module) moduleEntry.getValue();
            String moduleId = appId + "." + moduleKey.getValue();
            subIdentifiers.put(moduleId, module);

            // classes
            Map<Id, Identifier> classes = module.getIdentifiers();
            for (Map.Entry<Id, Identifier> classEntry : classes.entrySet()) {
                Id classKey = classEntry.getKey();
                Claz claz = (Claz) classEntry.getValue();
                String clazId = moduleId + "." + classKey.getValue();
                subIdentifiers.put(clazId, claz);

                // fields
                Map<Id, Identifier> fields = claz.getIdentifiers();
                for (Map.Entry<Id, Identifier> fieldEntry : fields.entrySet()) {
                    Id fieldKey = fieldEntry.getKey();
                    Field field = (Field) fieldEntry.getValue();
                    String fieldId = clazId + "." + fieldKey.getValue();
                    subIdentifiers.put(fieldId, field);
                }
            }
        }

    }

}
