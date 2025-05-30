package com.nopcommerce.tests.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverFactory {
    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private String browser;
    private Logger log;

    public BrowserDriverFactory(String browser, Logger log) {
        this.browser = browser.toLowerCase();
        this.log = log;
    }

    public WebDriver createDriver() {
        log.info("Creación del driver " + browser);

        switch (browser) {
            case "chrome":
                driver.set(new ChromeDriver());
            case "firefox":
                driver.set(new FirefoxDriver());
            case "edge":
                driver.set(new EdgeDriver());
            default:
                driver.set(new ChromeDriver());
        }
        return driver.get();
    }
}
