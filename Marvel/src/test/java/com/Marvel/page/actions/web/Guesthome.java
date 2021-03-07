package com.Marvel.page.actions.web;

import com.Marvel.reporter.ExtentReporter;
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
//import static com.propper.reporter.ExtentReporter.info;

import java.util.ArrayList;

public class Guesthome {
	private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);

	private WebDriver driver;
	@FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[4]/a[1]")
	WebElement partandaccessories;
	
	@FindBy(how = How.XPATH, using="//span[@class='ui-helper-hidden-accessible']")
	@CacheLookup
	WebElement modelnumber;
	
	@FindBy(how = How.XPATH, using="//input[@name='serial']")
	@CacheLookup
	WebElement search;
	
	@FindBy(how = How.XPATH, using="///input[@class='btn btn_add_to_cart button primary action']")
	@CacheLookup
	WebElement addtocart;
	

	@FindBy(how = How.XPATH, using="//span[contains(text(),'View Cart')]")
	@CacheLookup
	WebElement viewcart;
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),'Go to Checkout')]")
	@CacheLookup
	WebElement checkout;
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

	@FindBy(how = How.XPATH, using="//span[contains(text(),'Next')]")
	@CacheLookup
	WebElement Next;

	@FindBy(how = How.XPATH, using="//input[@value='purchaseorder']")
	@CacheLookup
	WebElement MoneyOrder;

	@FindBy(how = How.XPATH, using="//input[@title='Purchase Order Number']")
	@CacheLookup
	WebElement PurcheseOrderNumber;

	@FindBy(how = How.XPATH, using="//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/button[1]")
	@CacheLookup
	WebElement PlaceOrder;

    public Guesthome(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

	}


public void openpartsandaccessories() throws InterruptedException {
	LOGGER.info("Opening Part and accessories page ..........");
	Thread.sleep(20000);
	JavascriptExecutor js1 = (JavascriptExecutor) driver;

	js1.executeScript("window.scrollBy(0,1000)");
	WebElement ele= driver.findElement(By.xpath("//body/div[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[4]/a[1]"));
	ele.click();
	driver.getTitle();
}




public void modelnumber() throws InterruptedException {
    	Thread.sleep(9000);
    	LOGGER.info("Entering model number");
    	WebElement ele= driver.findElement(By.xpath("//input[@name='serial']"));
	ele.sendKeys("42242728-ACCY");
	ele.sendKeys(Keys.ENTER);
	
}


public void search() {
	search.click();
	// TODO Auto-generated method stub
	
}


public void addtocart() throws InterruptedException {
	Thread.sleep(5000);
	LOGGER.info("add product into cart");
	//WebDriverWait wait2 = new WebDriverWait(driver, 10);
	//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
	WebElement element = driver.findElement(By.xpath("//input[@class='btn btn_add_to_cart button primary action']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();
	//addtocart.click();
	
	
}


public void viewcart() throws InterruptedException {
	Thread.sleep(8000);
	LOGGER.info("View cart");
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs2.get(0));
	Thread.sleep(4000);
	viewcart.click();
	
	
}


public void checkout() throws InterruptedException {
	LOGGER.info("Go to checkout");
    	Thread.sleep(4000);

	//WebDriverWait wait2 = new WebDriverWait(driver, 10);
	//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
	WebElement element = driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']"));
	Actions actions = new Actions(driver);
	//actions.moveToElement(element).click().build().perform();
		element.click();
	
}


	public void emailbox() throws InterruptedException {
		//Thread.sleep(10000);
		LOGGER.info("Entering email");
		WebDriverWait wait = new WebDriverWait(driver,30);

WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));


		//WebElement ele= driver.findElement(By.cssSelector("#customer-email"));
		ele.sendKeys("puja@upbott.com");

	}
	public void FirstName() throws InterruptedException {
		Thread.sleep(5000);
		LOGGER.info("Entering First name");
		FirstName.sendKeys("puja");

	}
	public void LastName() throws InterruptedException {
		Thread.sleep(4000);
		LOGGER.info("Entering Lastname");
		LastName.sendKeys("Domke");

	}
	public void streetaddress() throws InterruptedException {
		Thread.sleep(4000);
		LOGGER.info("Entering street address");
		streetaddress.sendKeys("test 1234");

	}
	public void Companyname() throws InterruptedException {
		Thread.sleep(4000);
		LOGGER.info("Entering company name");
		Companyname.sendKeys("Upbott");

	}
	public void City() throws InterruptedException {
		Thread.sleep(4000);
		City.sendKeys("missouri");

	}
	public void State() throws InterruptedException {
		Thread.sleep(4000);
		WebElement ele =driver.findElement(By.xpath("//select[@name='region_id']"));
		ele.click();
		Select state = new Select(ele);
		state.selectByValue("36");


	}
	public void zipcode() throws InterruptedException {
		Thread.sleep(4000);
		zipcode.sendKeys("63011");

	}
	public void phonenumber() throws InterruptedException {
		Thread.sleep(4000);
		phonenumber.sendKeys("63011");

	}

	public void Next() throws InterruptedException {
		Thread.sleep(10000);
		Next.click();
		Thread.sleep(10000);

	}

	public void PurchaseOrder() throws InterruptedException {
		Thread.sleep(13000);
		WebElement element = driver.findElement(By.xpath("//input[@value='purchaseorder']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();


	}

	public void Shipping_method() throws InterruptedException {
		LOGGER.info("Select shipping method");
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
		element.click();


	}
	public void Next_button() throws InterruptedException {
		LOGGER.info("Click on next button");
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//button[@class='button action continue primary']"));
		element.click();


	}
	public void radio_button() throws InterruptedException {
		Thread.sleep(50000);
		LOGGER.info("Enter cart detail");
	//	WebDriverWait wait = new WebDriverWait(driver,70);

	//	WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='payment[method]']")));


		//WebElement ele= driver.findElement(By.cssSelector("#customer-email"));

		WebElement ele1= driver.findElement(By.xpath("//input[@name='payment[method]']"));
		ele1.click();
		Thread.sleep(20000);
		WebElement ele2=driver.findElement(By.xpath("//input[@id='cybersource_cc_number']"));
		ele2.sendKeys("5555555555554444");
		WebElement ele6= driver.findElement(By.xpath("//select[@id='cybersource_expiration']"));
		Select sel=new Select(ele6);
		sel.selectByVisibleText("08 - August");

		WebElement ele3= driver.findElement(By.xpath("//select[@id='cybersource_expiration_yr']"));
		Select sel1=new Select(ele3);
		sel1.selectByVisibleText("2026");


		WebElement ele4=driver.findElement(By.xpath("//input[@id='cybersource_cc_cid']"));
		ele4.sendKeys("234");


		WebElement ele5=driver.findElement(By.xpath("//body/div[2]/main[1]/div[2]/div[1]/div[3]/div[4]/ol[1]/li[4]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/textarea[1]"));
		ele5.sendKeys("testing");

	}

	public void PurchaseOrderNumber() throws InterruptedException {
		Thread.sleep(6000);
		PurcheseOrderNumber.sendKeys("9876567");

	}

	public void PlaceOrder() throws InterruptedException {
		Thread.sleep(8000);
		PlaceOrder.click();

	}
}