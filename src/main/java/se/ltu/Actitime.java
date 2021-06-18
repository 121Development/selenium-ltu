package se.ltu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Actitime {

    void fillForm() {
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.actitime.com/");
        driver.manage().window().setSize(new Dimension(1936, 1056));
        {
            WebElement element = driver.findElement(By.linkText("Try Free"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("Try Free")).click();
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("first-name")).sendKeys("Petter");
        driver.findElement(By.id("last-name")).sendKeys("Pettersson");
        driver.findElement(By.id("email")).sendKeys("petter@pettersson.com");
        driver.findElement(By.id("company")).click();
        driver.findElement(By.id("company")).sendKeys("Sweden");
        driver.quit();

    }

}