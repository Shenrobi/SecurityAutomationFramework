package com.security.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.nio.file.Paths;

public class Navigation {

    private WebDriver driver;

    public void openBrowser() {
        try {
            driver = new SafariDriver();
            System.out.println("Browser launched successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to launch browser.");
        }
    }

    public void navigateTo(String url) {
        if (driver != null) {
            driver.get(url);
            System.out.println("Navigated to: " + url);
        } else {
            System.out.println("Driver not initialized.");
        }
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        } else {
            System.out.println("Browser not opened, nothing to close.");
        }
    }
}
