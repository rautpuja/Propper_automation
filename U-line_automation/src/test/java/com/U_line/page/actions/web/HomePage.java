package com.U_line.page.actions.web;

//import static com.propper.reporter.ExtentReporter.info;
import static com.U_line.utils.selenium.WebUtils.click;
import static com.U_line.utils.selenium.WebUtils.waitForElementPresence;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/** This class contains all actions/operations that will be performed on Home page in Desktop web view.
 * 
 * @author Jaikant.lnu
 *
 */
public class HomePage {

	private static final Logger logger= LoggerFactory.getLogger(HomePage.class);

	private WebDriver driver;

	@FindBy(how = How.XPATH, using="//a[.='Provider Login' and not(@title)]")
	@CacheLookup
	WebElement providerlogin;

	@FindBy(how = How.XPATH, using="//input[@id='email']")
	@CacheLookup
	WebElement txtemail;

	

	@FindBy(xpath="//input[@id='pass']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(name="send")
	@CacheLookup
	WebElement btnLogin;
	//@FindBy(how = How.XPATH, using = "//a[.='Dealer Login' and not(@title)]")
	//WebElement dealerLoginLink;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='U-1224BEVS-00B']")
	@CacheLookup
	WebElement modelnumber;
	
	@FindBy(how = How.XPATH, using="//button[@id='el_search']")
	@CacheLookup
	WebElement search;
	
	@FindBy(how = How.XPATH, using="//input[@product_id='10165']")
	@CacheLookup
	WebElement addtocart;
	

	@FindBy(how = How.XPATH, using="//span[contains(text(),'View Cart')]")
	@CacheLookup
	WebElement viewcart;
	
	@FindBy(how = How.XPATH, using="//button[@title='Go to Checkout']")
	@CacheLookup
	WebElement checkout;
	@FindBy(how = How.XPATH, using="//span[contains(text(),'Next')]")
	@CacheLookup
	WebElement shipping;


	@FindBy(how = How.XPATH, using="//input[@value='purchaseorder']")
	@CacheLookup
	WebElement MoneyOrder;

	@FindBy(how = How.XPATH, using="//input[@title='Purchase Order Number']")
	@CacheLookup
	WebElement PurcheseOrderNumber;





	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void product() {

		logger.info("click on product");
		// TODO Auto-generated method stub
		providerlogin.click();
	}
	
	public void providerlogin() {
		logger.info("provider login");
		// TODO Auto-generated method stub
		providerlogin.click();
	}

	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}


	public void clickSubmit()
	{
		btnLogin.click();
	}
	public void modelnumber() {
		logger.info("Part search using modelnumber...");
		modelnumber.sendKeys("U-1024BEVS-00B");
		
	}


	public void search() {
		search.click();
		
	}


	public void addtocart() {
		logger.info("add product into cart...");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		addtocart.click();
		
	}


	public void viewcart() throws InterruptedException {
		Thread.sleep(6000);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	    Thread.sleep(2000);
		viewcart.click();
		
	}
	public void checkout() {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		js1.executeScript("window.scrollBy(0,1000)");
		checkout.click();
		
	}
	public void Shipping() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("window.scrollBy(0,1000)");
		shipping.click();

	}

	public void PurchaseOrder() throws InterruptedException {
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("(//input[@name='payment[method]'])[1]"));

		if (element.isDisplayed()) {
			element.click();
			System.out.println("Radio button is selected");

		} else {
			System.out.println("Radio button is not selected");
		}


	}
	public void PurchaseOrderNumber() throws InterruptedException {
		Thread.sleep(6000);
		WebElement ele= driver.findElement(By.xpath("(//textarea[@class='input-text order-comment order-comment-input'])[1]"));
		ele.sendKeys("testing request from upbott team");

	}

	public void PlaceOrder() throws InterruptedException {
		Thread.sleep(10000);
		WebElement ele= driver.findElement(By.xpath("(//textarea[@class='input-text order-comment order-comment-input'])[1]"));
		ele.click();


	}


}
