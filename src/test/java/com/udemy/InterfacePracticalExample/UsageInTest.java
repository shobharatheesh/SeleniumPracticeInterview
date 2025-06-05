package com.udemy.InterfacePracticalExample;

public class UsageInTest {

    public static void main(String[] args)
    {

        IBrowserActions browser = new BrowserManager();

        browser.launchBrowser();
        browser.closeBrowser();


    }
}
