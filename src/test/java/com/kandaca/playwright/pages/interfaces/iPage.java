package com.kandaca.playwright.pages.interfaces;

public interface iPage<P>{
    void openPage();

    void verifyTitleDisplayed();

    P openByUrl();

    P waitForUrl(String... params);

    String getCurrentUrl();

    P waitForLoading();
}
