package playwright.tests;


import org.testng.annotations.Test;
import playwright.pages.HomePage;

public class GoogleTest {

protected HomePage homePage = new HomePage();

    @Test
    void googleTest() {
        homePage.openPage();
    }
}
