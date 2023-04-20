package com.kandaca.playwright.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties( prefix = "environment")
public class AppProperties {
    private String baseUrl;
    private String browser;
}
