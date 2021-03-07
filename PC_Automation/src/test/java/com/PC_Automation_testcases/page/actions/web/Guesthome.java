package com.PC_Automation_testcases.page.actions.web;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import static com.propper.reporter.ExtentReporter.info;


public class Guesthome {
	private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);

	private WebDriver driver;



	public Guesthome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	public void Subscribe() throws InterruptedException {
		LOGGER.info("click on subscribe button");
		//Thread.sleep(50000);
		//driver.switchTo().alert().dismiss();
		WebDriverWait wait = new WebDriverWait(driver,90);

		WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='mageplaza-betterpopup-block']/div[@id='bio_ep']/div[1]/div[1]/img[1]")));
		ele.click();

	}




	public void Addtocart() throws InterruptedException {
		Thread.sleep(9000);
		LOGGER.info("Entering model number");
		Thread.sleep(9000);
		Actions ac=new Actions(driver);
		WebElement ele= driver.findElement(By.xpath("//span[contains(.,'All Products')]"));
		WebElement ele1= driver.findElement(By.xpath("(//a[contains(.,'Admissions & Registration')])[1]"));
		ac.moveToElement(ele).build().perform();
		Thread.sleep(4000);
		ac.moveToElement(ele1).click().build().perform();
		Thread.sleep(10000);
		WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
		ele4.click();
		Thread.sleep(10000);
		WebElement ele2= driver.findElement(By.xpath("//a[.='2.25\"x1.25\" Label Thermal Transfer 1\"C Wnd Out 1135/RL- 12 RL/CS' and not(@title)]"));
		ele2.click();
		Thread.sleep(10000);
		WebElement ele3= driver.findElement(By.xpath("//span[contains(text(),'Add to Quote')]"));
		ele3.click();

	}


//public void search() {
//	search.click();
//	// TODO Auto-generated method stub
//
//}


	public void view_cart() throws InterruptedException {
		Thread.sleep(5000);
		LOGGER.info("add product into cart");
		//WebDriverWait wait2 = new WebDriverWait(driver, 10);
		//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
		WebElement element = driver.findElement(By.xpath("//header/div[1]/div[3]/a[1]"));
		element.click();


	}


	public void viewcart_and_edit() throws InterruptedException {
		Thread.sleep(8000);
		LOGGER.info("View cart");
		Actions ac=new Actions(driver);
		WebElement ele= driver.findElement(By.xpath("//span[contains(.,'View and Edit Quote Request')]"));
		ac.moveToElement(ele).click().build().perform();
	}
//
//
//public void checkout() throws InterruptedException {
//	LOGGER.info("Go to checkout");
//    	Thread.sleep(4000);
//
//	//WebDriverWait wait2 = new WebDriverWait(driver, 10);
//	//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
//	WebElement element = driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']"));
//	Actions actions = new Actions(driver);
//	//actions.moveToElement(element).click().build().perform();
//		element.click();
//
//}


	public void emailbox() throws InterruptedException {
		Thread.sleep(10000);
		LOGGER.info("Entering email");
		WebDriverWait wait = new WebDriverWait(driver,30);

//WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@type,'email')])[2]")));


		WebElement ele= driver.findElement(By.xpath("(//input[contains(@type,'email')])[2]"));
		ele.sendKeys("puja@upbott.com");

	}
	public void Form() throws InterruptedException {
		Thread.sleep(20000);

		LOGGER.info("Application should display \"Thank you for registering! We are currently reviewing your account. You will receive an email including access information within 48 hours.\" and user should  receive 'Welcome to Marvel Refrigeration' email\n");
		String select = Keys.chord(Keys.CONTROL, "a");
//		WebElement button= driver.findElement(By.xpath("(//span[contains(.,'Submit Quote Request')])[2]"));
//		button.click();
//		WebElement shipping= driver.findElement(By.xpath("(//div[contains(@class,'step-title')])[2]"));
//		shipping.click();
		Thread.sleep(10000);
		Actions ac=new Actions(driver);
		WebElement shipping= driver.findElement(By.xpath("//div[@class='step-title title'][contains(.,'Shipping Address')]"));
		ac.moveToElement(shipping).click().build().perform();
		Thread.sleep(5000);
		WebElement name= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[10]"));
		name.sendKeys("Puja");
		WebElement lname= driver.findElement(By.xpath("(//input[contains(@name,'lastname')])[2]"));
		lname.sendKeys("Domke");
		WebElement sname= driver.findElement(By.xpath("(//input[contains(@name,'company')])[1]"));
		sname.sendKeys("upbott");
		WebElement sname1= driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		sname1.sendKeys("Test 123");
		WebElement city= driver.findElement(By.xpath("(//input[contains(@name,'city')])[1]"));
		city.sendKeys("missouri");
		WebElement zip= driver.findElement(By.xpath("(//select[contains(@name,'region_id')])[1]"));
		Select sel=new Select(zip);
		sel.selectByValue("32");
		WebElement pnumber1= driver.findElement(By.xpath("(//input[contains(@name,'postcode')])[1]"));
		pnumber1.sendKeys("test");
		WebElement pnumber= driver.findElement(By.xpath("(//input[contains(@name,'telephone')])[2]"));
		pnumber.sendKeys("9876787678");
//		WebElement button2= driver.findElement(By.xpath("//button[@data-role='opc-add-to-quote']"));
//		button2.click();

	}
	public void Submit_button() throws InterruptedException {

		LOGGER.info("submit button");
		WebDriverWait wait = new WebDriverWait(driver,50);

		WebElement button= driver.findElement(By.xpath("(//span[contains(.,'Submit Quote Request')])[2]"));
		button.click();

	}

}