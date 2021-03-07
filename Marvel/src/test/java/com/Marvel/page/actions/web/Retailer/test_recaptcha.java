package com.Marvel.page.actions.web.Retailer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_recaptcha {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\UPBOTT\\propper-automation\\U-Line\\src\\test\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://u-line.upbott.com/contactus");

        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");

        new WebDriverWait(driver, 50).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='recaptcha-anchor']"))).click();

        Thread.sleep(4000);

        driver.switchTo().frame(driver.findElement(By.xpath("//button[@id='recaptcha-verify-button']")));


        driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();

    }
}
