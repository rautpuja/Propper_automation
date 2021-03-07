package com.U_line.page.actions.web.Servicer;

import com.U_line.utils.common.Config;
import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class My_Claim_Page {

    private static final Logger logger = LoggerFactory.getLogger(My_Claim_Page.class);
    private static final String APPLICATION_URL = Config.getProperty("appURL");
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


    @FindBy(how = How.XPATH, using="//a[contains(text(),'My Claims')]")
    @CacheLookup
    WebElement My_Claims;

    @FindBy(how = How.XPATH, using="//tbody/tr[5]/td[1]")
    @CacheLookup
    WebElement Invoice;
    @FindBy(how = How.XPATH, using="//body/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")
    @CacheLookup
    WebElement Search;

    public My_Claim_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void providerlogin() {
        logger.info("After login After login By default parts search should open");
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
    public void My_Claims() throws InterruptedException {
        logger.info("Page should redirect to My Claims Page");
        Thread.sleep(4000);
        My_Claims.click();
    }

    public void Invoice() throws InterruptedException {
        logger.info("It should give the pop up");
        Thread.sleep(70000);
        WebElement ele= driver.findElement(By.xpath("//tbody/tr[5]/td[1]"));
        ele.click();
        Thread.sleep(4000);
    }
        public void Invoice_pop_up() throws InterruptedException {
            logger.info("It should give the pop up");
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public void Search() throws InterruptedException {
        logger.info("Search Result page should display with correct result and should be able to search by  invoice,sku,serial number,claim status,date paid,amount paid,check number notes");
        Thread.sleep(4000);
        Search.sendKeys("05264908");
}
    public void Search_blank() throws InterruptedException {
        logger.info("The 'search by keyword' should not work");
        Thread.sleep(4000);
        Search.sendKeys(Keys.ENTER);
    }

    public void Search_invalid() throws InterruptedException {
        logger.info("It should display message as \"No matching records found\"");
        Thread.sleep(4000);
        Search.sendKeys("123");
    }

    public void Filter() throws InterruptedException {
        logger.info("By deafult 10 should be selected and results should be according to the selection. It should sort the results as per 10,25,50,100 items selected. It should be present in the top right of my claims table section.");
        Thread.sleep(4000);
       WebElement ele= driver.findElement(By.xpath("//select[@name='my-claims-table_length']"));
        Select sel=new Select(ele);
        sel.selectByValue("25");
    }

    public void Ascending() throws InterruptedException {
        logger.info("It should sort results in descending order and vice versa");
        Thread.sleep(4000);
        WebElement ele= driver.findElement(By.xpath("//th[contains(text(),'Invoice #')]"));
       ele.click();
    }

    public void Previous_button() throws InterruptedException {
        logger.info("It should go back");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement ele= driver.findElement(By.xpath("//a[@id='my-claims-table_previous']"));
        ele.click();
    }

    public void Next_button() throws InterruptedException {
        logger.info("It should go to ahead ");
        Thread.sleep(4000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        WebElement ele= driver.findElement(By.xpath("//a[@id='my-claims-table_next']"));
       ele.click();
    }




}
