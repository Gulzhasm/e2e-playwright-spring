package com.kandaca.playwright.tests;

import com.kandaca.playwright.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GoogleTest {

    @Autowired
    protected HomePage homePage;

    @Test
    void googleTest() {
        homePage.openPage();
    }
}
