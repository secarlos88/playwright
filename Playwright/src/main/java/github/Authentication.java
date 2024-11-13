package github;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class Authentication {
    protected static Playwright playwright;
    protected static Browser browser;
    protected BrowserContext context;
    protected Page page;


    @BeforeAll
    static void launchBrowser(){
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
    }
    @AfterAll
    static void closeBrowser(){
        playwright.close();
    }
    @AfterEach
    void closeContext(){
        context.close();
    }

    @Test
    public void auth(){
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://github.com/login");

        //sign in
        page.fill("#login_field", "jcpz8808@gmail.com");
        page.fill("#password", "HarryPotter2019+");
        page.click("'Sign in'");
        Assertions.assertEquals(page.url(), "https://github.com/");

        //verify sign in
        page.click("[aria-label=\"Open user navigation menu\"]");


    }
}
