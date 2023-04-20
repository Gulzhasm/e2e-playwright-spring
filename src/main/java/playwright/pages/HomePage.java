package playwright.pages;

import io.qameta.allure.Step;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage<HomePage> {

    private static final String TITLE = "Google";
    private static final String PATH = "https://www.google.com/";

    public HomePage() {
        super(TITLE, PATH, HomePage.class);
    }

    @Step("open google home page")
    public void openGoogleHomePage(){
        openPage();
    }

}
