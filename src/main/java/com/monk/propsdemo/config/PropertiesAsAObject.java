package com.monk.propsdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "propsdemo.model")
public record PropertiesAsAObject(String first, String second){}