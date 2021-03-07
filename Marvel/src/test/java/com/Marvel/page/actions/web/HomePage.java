package com.Marvel.page.actions.web;

//import static com.propper.reporter.ExtentReporter.info;
import static com.Marvel.utils.selenium.WebUtils.click;
import static com.Marvel.utils.selenium.WebUtils.waitForElementPresence;

import java.util.ArrayList;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/** This class contains all actions/operations that will be performed on Home page in Desktop web view.
 * 
 * @author Jaikant.lnu
 *
 */
public class HomePage {

	private static final Logger LOGGER= LoggerFactory.getLogger(HomePage.class);

	private WebDriver driver;



	@FindBy(how = How.XPATH, using="//input[@id='email']")
	@CacheLookup
	WebElement txtemail;

	

	@FindBy(xpath="//input[@id='pass']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(name="send")
	@CacheLookup
	WebElement btnLogin;



	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void providerlogin() {
		LOGGER.info("After login After login By default parts search should open");
		// TODO Auto-generated method stub
		WebElement ele = driver.findElement(By.xpath("(//a[contains(.,'Login')])[1]"));
		ele.click();
	}

	public void setemail(String email) {
		txtemail.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}


	public void clickSubmit() {
		btnLogin.click();
	}
	public void partnumber() throws InterruptedException {
		Thread.sleep(9000);
		LOGGER.info("Entering model number");
		WebElement ele1 = driver.findElement(By.xpath("//input[contains(@name,'serial')]"));
		String select = Keys.chord(Keys.CONTROL, "a");
		ele1.sendKeys(select);
		ele1.sendKeys("42242833-ACCY");
		ele1.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
	}



	public void addtocart() throws InterruptedException {
		Thread.sleep(10000);
		LOGGER.info("add product into cart");
		WebElement ele = driver.findElement(By.xpath("//input[contains(@type,'button')]"));
		ele.click();
		Thread.sleep(10000);

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(2000);
		WebElement cancel = driver.findElement(By.xpath("//span[contains(.,'View Cart')]"));
		cancel.click();

	}





	public void checkout() throws InterruptedException {
		LOGGER.info("Go to checkout");
		Thread.sleep(10000);

		WebElement element = driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']"));
		Actions actions = new Actions(driver);

		element.click();
		System.out.println("click on checkout button");

	}




	public void Shipping_method() throws InterruptedException {
		LOGGER.info("Select shipping method");
		Thread.sleep(10000);

		WebElement ele= driver.findElement(By.xpath("//input[contains(@aria-labelledby,'label_method_03_ups label_carrier_03_ups')]"));
		ele.click();
		System.out.println("click on shipping method");

	}
	public void Next_button() throws InterruptedException {
		LOGGER.info("Click on next button");
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//span[contains(.,'Next')]"));
		element.click();
		System.out.println("click on next button");

	}
	public void radio_button() throws InterruptedException {
		Thread.sleep(50000);
		LOGGER.info("Enter cart detail");
		Thread.sleep(10000);
		WebElement ele5= driver.findElement(By.xpath("//input[contains(@name,'payment[method]')]"));
		ele5.click();
		Thread.sleep(10000);
		WebElement ele= driver.findElement(By.xpath("//input[@type='number'][contains(@id,'number')]"));
		ele.sendKeys("54677889798");
		Thread.sleep(10000);
		WebElement month= driver.findElement(By.xpath("//select[@name='payment[cc_exp_month]'][contains(@id,'expiration')]"));
		Select sel=new Select(month);
		sel.selectByValue("2");
		Thread.sleep(5000);
		WebElement year= driver.findElement(By.xpath("//select[@name='payment[cc_exp_year]'][contains(@id,'yr')]"));
		Select sel2=new Select(year);
		sel2.selectByValue("2022");
		WebElement cvv= driver.findElement(By.xpath("//input[contains(@class,'input-text cvv')]"));
		cvv.sendKeys("443");
		Thread.sleep(5000);
//        WebElement order= driver.findElement(By.xpath("(//span[contains(@class,'action action-toggle')])[1]"));
//        order.click();
//        Thread.sleep(5000);
		WebElement text= driver.findElement(By.xpath("//textarea[contains(@class,'input-text order-comment order-comment-input')]"));
		text.sendKeys("Testing request from upbott team");
		System.out.println("Entered cart detail");

	}

	public void Place_order() throws InterruptedException {
		LOGGER.info("\"The order should be placed with message \n" +
				"'Your order number is: Order_number.\n" +
				"We'll email you an order confirmation with details and tracking info.'\"");
		Thread.sleep(10000);
		WebElement ele= driver.findElement(By.xpath("//span[contains(.,'Place Order')]"));
		ele.click();
		System.out.println("order place successfully");



	}

}
