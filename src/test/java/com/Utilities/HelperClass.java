//package com.Utilities;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class HelperClass {
//    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
//    private String web;
//
//    private HelperClass() {
//        try {
//            File file = new File("src/test/resources/testdata.properties");
//            FileInputStream fileInput = new FileInputStream(file);
//
//            Properties prop = new Properties();
//            prop.load(fileInput);
//
//            this.web = prop.getProperty("browser");
//
//            if (this.web == null) {
//                throw new RuntimeException("The 'browser' property is missing in testdata.properties file.");
//            }
//
//            WebDriver driver = null;
//            if (this.web.equalsIgnoreCase("Chrome")) {
//            	ChromeOptions opt=new ChromeOptions();
//            	opt.addArguments("--headless");
//                driver = new ChromeDriver(opt);
//            } else if (this.web.equalsIgnoreCase("FireFox")) {
//                driver = new FirefoxDriver();
//            } else {
//                throw new RuntimeException("Unsupported browser: " + this.web);
//            }
//
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//            driverThreadLocal.set(driver);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw new RuntimeException("Error reading the testdata.properties file.");
//        }
//    }
//
//    public static WebDriver getDriver() {
//        return driverThreadLocal.get();
//    }
//
//    public static void setupDriver() {
//        if (driverThreadLocal.get() == null) {
//            new HelperClass();
//        }
//    }
//    public static void openPage(String url) {
//        if (driverThreadLocal.get() != null) {
//            driverThreadLocal.get().get("https://demowebshop.tricentis.com/");
//        } else {
//            throw new IllegalStateException("Driver is not initialized. Call setupDriver() before calling openPage().");
//        }
//    }
//
//    public static void teardown() {
//        if (driverThreadLocal.get() != null) {
//            driverThreadLocal.get().quit();
//            driverThreadLocal.remove();
//        }
//    }
//}
package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperClass {
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
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

            WebDriver driver = null;
            if (this.web.equalsIgnoreCase("Chrome")) {
            	ChromeOptions opt=new ChromeOptions();
           	    opt.addArguments("--headless");
            	Map<String, Object> prefs = new HashMap<String, Object>();
            	prefs.put("credentials_enable_service", false);
            	prefs.put("profile.password_manager_enabled", false);

            	opt.setExperimentalOption("prefs", prefs);
                driver = new ChromeDriver(opt);
            } else if (this.web.equalsIgnoreCase("FireFox")) {
                driver = new FirefoxDriver();
            } else {
                throw new RuntimeException("Unsupported browser: " + this.web);
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driverThreadLocal.set(driver);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading the testdata.properties file.");
        }
    }

    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    public static void setupDriver() {
        if (driverThreadLocal.get() == null) {
            new HelperClass();
        }
    }
    public static void openPage(String url) {
        if (driverThreadLocal.get() != null) {
            driverThreadLocal.get().get("https://demowebshop.tricentis.com/");
        } else {
            throw new IllegalStateException("Driver is not initialized. Call setupDriver() before calling openPage().");
        }
    }

    public static void teardown() {
        if (driverThreadLocal.get() != null) {
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }
}
