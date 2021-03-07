package com.U_line.page.actions.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import static com.propper.reporter.ExtentReporter.info;

import java.util.ArrayList;

public class Guesthome {
	private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);

	private WebDriver driver;
	@FindBy(how = How.XPATH, using="//a[.='Parts & Accessories' and not(@title)]")
	WebElement partandaccessories;
	
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
	@FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[3]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
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


public void openpartsandaccessories() {
	//info("Opening Part and accessories page ..........");
	partandaccessories.click();
	driver.getTitle();
}




public void modelnumber() {
	modelnumber.sendKeys("U-1024BEVS-00B");
	
}


public void search() {
	search.click();
	// TODO Auto-generated method stub
	
}


public void addtocart() throws InterruptedException {
	Thread.sleep(5000);
	//WebDriverWait wait2 = new WebDriverWait(driver, 10);
	//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
	WebElement element = driver.findElement(By.xpath("//input[@product_id='10165']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();
	//addtocart.click();
	
	
}


public void viewcart() throws InterruptedException {
	Thread.sleep(8000);
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs2.get(0));
	Thread.sleep(4000);
	viewcart.click();
	
	
}


public void checkout() throws InterruptedException {
    	Thread.sleep(4000);

	//WebDriverWait wait2 = new WebDriverWait(driver, 10);
	//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkmo']")));
	WebElement element = driver.findElement(By.xpath("//button[@title='Go to Checkout']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();
		//checkout.click();
	
}
	public void form() throws InterruptedException {
		Thread.sleep(4000);
		WebElement email= driver.findElement(By.xpath("(//input[contains(@class,'input-text')])[2]"));
		email.sendKeys("puja@upbott.com");
		WebElement fn= driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
		fn.sendKeys("puja");
		WebElement ln= driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
		ln.sendKeys("domke");
		WebElement sa= driver.findElement(By.xpath("//input[contains(@name,'street[0]')]"));
		sa.sendKeys("test 123");
		WebElement company= driver.findElement(By.xpath("//input[contains(@name,'company')]"));
		company.sendKeys("upbott");
		WebElement city= driver.findElement(By.xpath("//input[contains(@name,'city')]"));
		city.sendKeys("missouri");
		WebElement region= driver.findElement(By.xpath("//select[contains(@name,'region_id')]"));
		Select sel=new Select(region);
		sel.selectByValue("36");
		WebElement zc= driver.findElement(By.xpath("//input[contains(@name,'postcode')]"));
		zc.sendKeys("63011");
		WebElement pn= driver.findElement(By.xpath("//input[contains(@name,'telephone')]"));
		pn.sendKeys("8987676564");


	}
	public void FirstName() throws InterruptedException {
		Thread.sleep(5000);
		FirstName.sendKeys("puja");

	}
	public void LastName() throws InterruptedException {
		Thread.sleep(4000);
		LastName.sendKeys("Domke");

	}
	public void streetaddress() throws InterruptedException {
		Thread.sleep(4000);
		streetaddress.sendKeys("test 1234");

	}
	public void Companyname() throws InterruptedException {
		Thread.sleep(4000);
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


	public void Next() throws InterruptedException {
		Thread.sleep(6000);
		WebElement Next= driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		Next.click();
		Thread.sleep(6000);

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