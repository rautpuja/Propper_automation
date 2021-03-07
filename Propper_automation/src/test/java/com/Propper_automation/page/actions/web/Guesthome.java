package com.Propper_automation.page.actions.web;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Guesthome {
	private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);

	private WebDriver driver;



	public Guesthome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	public void PLP_page() throws InterruptedException {
		LOGGER.info("Go to plp page");
		Thread.sleep(30000);
		//driver.switchTo().alert().dismiss();

      Actions ac=new Actions(driver);
		WebElement	ele= driver.findElement(By.xpath("//span[contains(.,'Bags')]"));
		ac.moveToElement(ele).build().perform();
		Thread.sleep(30000);
		WebElement	ele2= driver.findElement(By.xpath("//a[@title='Computer Bags'][contains(.,'Computer Bags')]"));
		ele2.click();


	}
	public void Click_on_product() throws InterruptedException {
		LOGGER.info("click on product");
		Thread.sleep(30000);
		//driver.switchTo().alert().dismiss();

		Actions ac=new Actions(driver);
		WebElement	ele= driver.findElement(By.xpath("//a[@class='product-item-link'][contains(.,'Blake Backpack Bag')]"));

		ac.moveToElement(ele).click().build().perform();

	}
	public void Select_qty_and_colour() throws InterruptedException {
		LOGGER.info("Select qty and product");
		Thread.sleep(30000);
		String select = Keys.chord(Keys.CONTROL, "a");

		Actions ac=new Actions(driver);
		WebElement	ele= driver.findElement(By.xpath("//input[@name='qty']"));

	ele.sendKeys(select);
	ele.sendKeys("50");
		Thread.sleep(30000);
		WebElement	ele2= driver.findElement(By.xpath("//select[contains(@class,' product-custom-option admin__control-select')]"));
	Select sel=new Select(ele2);
	sel.selectByValue("48927");
	}

}