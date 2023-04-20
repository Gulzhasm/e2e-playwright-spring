package playwright.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties( prefix = "environment")
public class AppProperties {
    private String baseUrl;
    private String browser;
}
