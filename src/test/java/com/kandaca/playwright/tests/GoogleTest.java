package com.kandaca.playwright.tests;

import org.junit.jupiter.api.Test;
import playwright.pages.HomePage;

public class GoogleTest {
protected HomePage homePage = new HomePage();

    @Test
    void googleTest() {
        homePage.openPage();
    }
}
