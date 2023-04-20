package com.kandaca.playwright.tests;


import com.kandaca.playwright.pages.HomePage;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseTest {

    @Autowired
    protected HomePage homePage;
}
