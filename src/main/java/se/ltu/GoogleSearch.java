package se.ltu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.*;

public class GoogleSearch {

    void search() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        //To accept cookies b/c my firefox has all the privacy plugins
        if(driver.findElement(By.id("L2AGLb")) != null);
            driver.findElement(By.id("L2AGLb")).click();
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Software Testing\n");
        element.submit();
        Thread.sleep(2000);
        driver.quit();

    }
}