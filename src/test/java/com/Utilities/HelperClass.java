package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperClass {
    private static WebDriver driver;
    private static HelperClass help;
    private String web;
    private HelperClass() {
        try {
            
            File file = new File("src/test/resources/testdata.properties");
            FileInputStream fileInput = new FileInputStream(file);

            Properties prop = new Properties();
            prop.load(fileInput);

            this.web = prop.getProperty("browser");

            if (this.web == null) {
                throw new RuntimeException("The 'browser' property is missing in testdata.properties file.");
            }

            if (this.web.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (this.web.equalsIgnoreCase("FireFox")) {
                driver = new FirefoxDriver();
            } else {
                throw new RuntimeException("Unsupported browser: " + this.web);
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading the testdata.properties file.");
        }
    }

    public static void setupDriver() {
        if (help == null) {
            help = new HelperClass();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void openPage(String url) {
        driver.get("https://demowebshop.tricentis.com/");
    }

    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
        help = null;
    }
}