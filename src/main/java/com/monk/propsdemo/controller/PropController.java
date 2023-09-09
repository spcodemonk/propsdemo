package com.monk.propsdemo.controller;

import com.monk.propsdemo.config.ArrayAsAProperty;
import com.monk.propsdemo.config.CloudPlatformConfigs;
import com.monk.propsdemo.config.PropertiesAsAObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author spcodemonk
 */
@RestController
public class PropController {

    @Autowired
    private PropertiesAsAObject propertiesAsAObject;

    @Autowired
    private ArrayAsAProperty arrayAsAProperty;

    @Autowired
    private CloudPlatformConfigs cloudPlatformConfigs;

    @GetMapping("/propertiesAsAObject")
    public PropertiesAsAObject getPropertyObject(){
        System.out.println(propertiesAsAObject.first());
        return propertiesAsAObject;
    }
    @GetMapping("/arrayAsAProperty")
    public ArrayAsAProperty getPropertyArray(){
        System.out.println(arrayAsAProperty);
        return arrayAsAProperty;
    }

    @GetMapping("/cloudPlatformConfigs")
    public CloudPlatformConfigs getCloudPlatformConfigs(){
        System.out.println(cloudPlatformConfigs);
        return cloudPlatformConfigs;
    }
}
