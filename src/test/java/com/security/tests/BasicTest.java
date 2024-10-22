package com.security.tests;

import com.security.utils.Navigation;

public class BasicTest {

    public static void main(String[] args) {
        Navigation navigation = new Navigation();

        // Launch the browser
        navigation.openBrowser();

        // Navigate to a website
        navigation.navigateTo("https://www.google.com");

        // Close the browser
        navigation.closeBrowser();
    }
}
