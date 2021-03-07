package com.BSP_Testcases.page.actions.web;

//import static com.propper.reporter.ExtentReporter.info;
import static com.BSP_Testcases.utils.selenium.WebUtils.click;
import static com.BSP_Testcases.utils.selenium.WebUtils.waitForElementPresence;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;


/** This class contains all actions/operations that will be performed on Home page in Desktop web view.
 * 
 * @author Jaikant.lnu
 *
 */
public class HomePage {

	private static final Logger LOGGER= LoggerFactory.getLogger(HomePage.class);

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

	@FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/button[1]")
	@CacheLookup
	WebElement PlaceOrder;

	@FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[3]/div[4]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement emailbox;
	@FindBy(how = How.XPATH, using="//input[@name='firstname']")
	@CacheLookup
	WebElement FirstName;
	@FindBy(how = How.XPATH, using="//input[@name='lastname']")
	@CacheLookup
	WebElement LastName;

	@FindBy(how = How.XPATH, using="//input[@name='street[0]']")
	@CacheLookup
	WebElement streetaddress;

	@FindBy(how = How.XPATH, using="//input[@name='company']")
	@CacheLookup
	WebElement Companyname;

	@FindBy(how = How.XPATH, using="//input[@name='city']")
	@CacheLookup
	WebElement City;

	@FindBy(how = How.XPATH, using="//select[@name='region_id']")
	@CacheLookup
	WebElement state;

	@FindBy(how = How.XPATH, using="//input[@name='postcode']")
	@CacheLookup
	WebElement zipcode;

	@FindBy(how = How.XPATH, using="//input[@name='telephone']")
	@CacheLookup
	WebElement phonenumber;


	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void Subscribe() throws InterruptedException {
		LOGGER.info("Click on subscribe pop up ..........");
		Thread.sleep(20000);
		//driver.switchTo().alert().dismiss();
		WebElement ele= driver.findElement(By.xpath("//body/div[@id='mageplaza-betterpopup-block']/div[@id='bio_ep']/div[1]/div[1]/img[1]"));
		ele.click();
		WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
		ele4.click();
		Thread.sleep(10000);

	}




	public void Addtocart() throws InterruptedException {
		Thread.sleep(9000);
		LOGGER.info("Add product into cart");
		Thread.sleep(9000);
		Actions ac=new Actions(driver);
		WebElement ele= driver.findElement(By.xpath("//span[contains(.,'All Products')]"));
		WebElement ele1= driver.findElement(By.xpath("(//a[contains(.,'Admissions & Registration')])[1]"));
		ac.moveToElement(ele).build().perform();
		Thread.sleep(4000);
		ac.moveToElement(ele1).click().build().perform();
		Thread.sleep(4000);
//		WebElement ele3= driver.findElement(By.xpath("//a[.='2.25\"x1.25\" Label Thermal Transfer 1\"C Wnd Out 1135/RL- 12 RL/CS' and not(@title)]"));
//		ele3.click();
//		Thread.sleep(10000);
		WebElement ele12= driver.findElement(By.xpath("(//span[contains(.,'Add to Cart')])[2]"));
		ele12.click();

	}


//public void search() {
//	search.click();
//	// TODO Auto-generated method stub
//
//}


	public void view_cart() throws InterruptedException {
		Thread.sleep(5000);
		LOGGER.info("View cart ");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//span[contains(.,'View Cart')]"));
		element.click();


	}


	public void Checkout() throws InterruptedException {
		Thread.sleep(8000);
		LOGGER.info("Go to checkout page");
		WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Proceed to Checkout')]"));

		ele.click();
	}
//
//
public void radio_button() throws InterruptedException {
	LOGGER.info("Select shipping method and click on next button");
    	Thread.sleep(10000);

	WebElement element = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));

		element.click();
	Thread.sleep(10000);

	WebElement element1 = driver.findElement(By.xpath("//span[contains(.,'Next')]"));

	element1.click();


}

	public void Place_order() throws InterruptedException {
		Thread.sleep(8000);
		LOGGER.info("Select invoice radio button and place the order");
		WebElement ele= driver.findElement(By.xpath("//input[@value='purchaseorder']"));

		ele.click();
		WebElement ele1= driver.findElement(By.xpath("//input[@name='payment[po_number]']"));
ele1.sendKeys("6787889");
		WebElement ele2= driver.findElement(By.xpath("(//textarea[contains(@class,'input-text order-comment order-comment-input')])[1]"));
		ele2.sendKeys("Testing request from upbott team");
//		WebElement ele3= driver.findElement(By.xpath("(//span[contains(.,'Place Order')])[1]"));
//
//		ele3.click();
	}

	public void Login_button() throws InterruptedException {

		LOGGER.info("Click on login");
		Thread.sleep(10000);
		WebElement ele= driver.findElement(By.xpath("//a[contains(@class,'link login')]"));
		ele.click();

	}
	public void username_password(String email, String pwd) throws InterruptedException {

		LOGGER.info("Enter username and password");
		Thread.sleep(10000);
		WebElement ele= driver.findElement(By.xpath("//input[@name='login[username]']"));
		ele.sendKeys(email);
		WebElement ele2= driver.findElement(By.xpath("//input[@name='login[password]']"));
		ele2.sendKeys(pwd);

		WebElement ele5= driver.findElement(By.xpath("//button[@class='action login primary']"));
		ele5.click();

	}





}
