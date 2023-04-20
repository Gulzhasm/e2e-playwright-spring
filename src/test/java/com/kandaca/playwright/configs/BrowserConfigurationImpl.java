package com.kandaca.playwright.configs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;

@Configuration
@PropertySource("classpath:application.yml")
@Import(Properties.class)
public class BrowserConfigurationImpl implements BrowserConfiguration{

    @Value("${environment.baseUrl}")
    String baseUrl;

    @Test
    public void test(){
        System.out.println(baseUrl);
    }

    @Override
    public void configureBrowser() {

    }
}
