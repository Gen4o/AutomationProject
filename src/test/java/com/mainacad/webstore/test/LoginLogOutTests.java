package com.mainacad.webstore.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

/**
 * Created by Gennadii on 18-May-17.
 */

public class LoginLogOutTests {
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start() {
        if (tlDriver.get() != null) {
            driver = tlDriver.get();
            wait = new WebDriverWait(driver, 10);
            return;
        }

        driver = new ChromeDriver();
        tlDriver.set(driver);
        wait = new WebDriverWait(driver, 10);

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { driver.quit(); driver = null; }));
    }

    @Test
    public void loginToAdminStore(){
        driver.get("http://litecart-2.0.1/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.tagName("button")).click();

    }

    @Test
    public void logOutAdminStore(){
        //driver.get("http://litecart-2.0.1/admin/");
        wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.tagName("i")));

        driver.findElement( By.tagName("i")).click();


    }

    @After
    public void stop(){
        //driver.quit();
       // driver = null;
    }

}
