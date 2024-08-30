package com.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertEquals;

public class SeleniumTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up the ChromeDriver path
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleHomePageTitle() {
        // Navigate to Google
        driver.get("https://www.google.com");

        // Assert the title
        String title = driver.getTitle();
        assertEquals("Google", title);
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
