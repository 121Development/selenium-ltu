package se.ltu;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

    public class GridTest {
        public WebDriver driver;
        public String URL, Node;

    public void launchbrowser() throws MalformedURLException, InterruptedException {
        String URL = "http://www.google.com";
        String Node = "http://54.144.249.46:4444/wd/hub";

        System.out.println(">> Setting Chrome options");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless",
                "--disable-gpu",
                "--window-size=1920,1200",
                "--ignore-certificate-errors",
                "--disable-extensions",
                "--no-sandbox",
                "--disable-dev-shm-usage",
                "--ignore-certificate-errors",
                "--ignore-ssl-errors");

        System.out.println(">> Trying to connect");
        WebDriver driver = new RemoteWebDriver(new URL(Node), options);

        System.out.println(">> navigating to: " + URL);
        driver.navigate().to("http://www.google.com");

        System.out.println(">> Remote connected");
        System.out.println(">> Connected to: "+ driver.getCurrentUrl());

        //Wait for 2 seconds before throwing exception
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.name("q")).sendKeys("Software Testing\n");
        System.out.println(">> Found element q and sent keys");

        driver.findElement(By.name("q")).submit();
        System.out.println(">> Submitted keys");

        Thread.sleep(2000);
        System.out.println(">> Search results returned");

        List<WebElement> elements = driver.findElements(By.xpath("//h3"));
        Iterator<WebElement> itr = elements.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().getText());
        }

        driver.quit();
        System.out.println(">> Driver quit");
        }
}
