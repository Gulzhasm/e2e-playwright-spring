package playwright.configs;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;

@Configuration
@PropertySource("classpath:application.yml")
@Import(Properties.class)
public class BrowserConfigurationImpl implements BrowserConfiguration {

    @Value("${environment.baseUrl}")
    String baseUrl;


    @Override
    public void configureBrowser() {

    }
}
