package com.kandaca.playwright.pages;

import com.kandaca.playwright.pages.interfaces.iPage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public abstract class BasePage<P extends BasePage<P>> implements iPage<P> {
    protected String title;
    protected String path;
    protected Class<P> pClass;

    public BasePage(String title, String path, Class<P> pClass){
        this.title = title;
        this.path = path;
        this.pClass = pClass;
    }

    @Override
    public void openPage() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setHeadless(false)
                            .setChannel("chrome")
            );
            Page page = browser.newPage();
            page.navigate("http://google.com");
        }
    }

    @Override
    public void verifyTitleDisplayed() {

    }

    @Override
    public P openByUrl() {
        return null;
    }

    @Override
    public P waitForUrl(String... params) {
        return null;
    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public P waitForLoading() {
        return null;
    }
}
