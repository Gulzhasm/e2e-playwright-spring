package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


class TestingWebApplication {


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
