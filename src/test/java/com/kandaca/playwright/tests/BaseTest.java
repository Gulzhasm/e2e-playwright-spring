package com.kandaca.playwright.tests;



import org.springframework.beans.factory.annotation.Autowired;
import playwright.pages.HomePage;

public class BaseTest {

    @Autowired
    protected HomePage homePage;
}
