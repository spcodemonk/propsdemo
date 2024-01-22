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
    private CloudPlatformConfigs cloudPlatformConfigs;



    @GetMapping("/cloudPlatformConfigs")
    public CloudPlatformConfigs getCloudPlatformConfigs(){
        System.out.println(cloudPlatformConfigs);
        return cloudPlatformConfigs;
    }
}
