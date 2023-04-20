package com.kandaca.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TestingWebApplication {

	@Test
	void contextLoads() {
		Assert.assertTrue(true);
	}

	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(
					new BrowserType.LaunchOptions()
							.setHeadless(false)
							.setChannel("chrome")
			);
			Page page = browser.newPage();
			page.navigate("http://google.com");
			System.out.println(page.title());
		}
	}
}
