package com.monk.propsdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "propsdemo.myapp")
public record ArrayAsAProperty(List<String> myArrayProps) {
}