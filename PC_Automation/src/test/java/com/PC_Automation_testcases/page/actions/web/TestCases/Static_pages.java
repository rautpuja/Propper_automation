package com.PC_Automation_testcases.page.actions.web.TestCases;

import com.PC_Automation_testcases.page.actions.web.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Static_pages {

        private static final Logger logger= LoggerFactory.getLogger(HomePage.class);

        private WebDriver driver;



        @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[12]/a[1]")
        @CacheLookup
        WebElement U_chill_footer;

        @FindBy(how = How.XPATH, using="//a[contains(text(),'About Us')]")
        @CacheLookup
        WebElement About_us_footer;

        @FindBy(how = How.XPATH, using="//a[contains(text(),'Request a Brochure')]")
        @CacheLookup
        WebElement Request_a_brochure;

        @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]")
        @CacheLookup
        WebElement U_line_lifestyle_blog_footer;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'Built-In to Stand Out')]")
        @CacheLookup
        WebElement build_into_stand_out_footer;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'Modular Refrigeration')]")
        @CacheLookup
        WebElement Modular_refrigeration_footer;


        @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[6]")
        @CacheLookup
        WebElement Propper_preservation;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'Trade & Media')]")
        @CacheLookup
        WebElement Trade_and_media;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'Continuing Education')]")
        @CacheLookup
        WebElement Continuing_Education;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'Press Releases')]")
        @CacheLookup
        WebElement Press_Releases;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'Careers')]")
        @CacheLookup
        WebElement Career;

        @FindBy(how = How.XPATH, using = "//label[contains(text(),'Serial Number')]")
        @CacheLookup
        WebElement Searial_Number;

        @FindBy(how = How.XPATH, using="//input[@placeholder='1714862050527']")
        @CacheLookup
        WebElement Serialnumber;

        @FindBy(how = How.XPATH, using="//button[@id='el_search']")
        @CacheLookup
        WebElement search;



        @FindBy(how = How.XPATH, using="//header/div[2]/div[3]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]/span[1]")
        @CacheLookup
        WebElement Parts_and_accessories;

        @FindBy(how = How.XPATH, using="//span[contains(text(),'View Cart')]")
        @CacheLookup
        WebElement viewcart;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'Find a Dealer')]")
        @CacheLookup
        WebElement Find_a_Dealer;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'Find a Servicer')]")
        @CacheLookup
        WebElement Find_a_servicer;


        @FindBy(how = How.XPATH, using="//body/div[1]/footer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[3]")
        @CacheLookup
        WebElement Product_registration;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'Parts & Accessories')]")
        @CacheLookup
        WebElement Parts_and_accessories1;



        @FindBy(how = How.XPATH, using="//a[contains(text(),'Manuals & Guides')]")
        @CacheLookup
        WebElement Manuals_and_guides;




        @FindBy(how = How.XPATH, using="//a[contains(text(),'Provider Login')]")
        @CacheLookup
        WebElement Provider_login;




        @FindBy(how = How.XPATH, using="//a[contains(text(),'Shipping & Returns')]")
        @CacheLookup
        WebElement Shipping_and_returns;



        @FindBy(how = How.XPATH, using="//a[contains(text(),'Privacy Policy')]")
        @CacheLookup
        WebElement Privacy_policy;

        @FindBy(how = How.XPATH, using="//a[contains(text(),'Terms & Conditions')]")
        @CacheLookup
        WebElement Terms_and_conditions;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'CA Prop 65')]")
        @CacheLookup
        WebElement CA_prop_65_footer;


        @FindBy(how = How.XPATH, using="//a[contains(text(),'Contact Us')]")
        @CacheLookup
        WebElement Contact_us_footer;


        @FindBy(how = How.XPATH, using="//a[@id='totop']")
        @CacheLookup
        WebElement Top_button;


        @FindBy(how = How.XPATH, using="//a[@title='Remove']")
        @CacheLookup
        WebElement Cross_icon;


        @FindBy(how = How.XPATH, using="//button[@class='action-secondary action-dismiss']")
        @CacheLookup
        WebElement Cancel_button;

        @FindBy(css ="body.cms-uline-homepage.cms-index-index.page-layout-1column.layout-fullwidth.wide._has-modal:nth-child(2) div.modals-wrapper:nth-child(7) aside.modal-popup.confirm._show:nth-child(2) div.modal-inner-wrap:nth-child(2) header.modal-header > button.action-close")
        @CacheLookup
        WebElement Closs_button;


        @FindBy(how = How.XPATH, using="//button[@class='action-primary action-accept']")
        @CacheLookup
        WebElement ok_button;


        public Static_pages(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public void Subscribe() throws InterruptedException {
            logger.info("click on subscribe button");

            //driver.switchTo().alert().dismiss();
            WebDriverWait wait = new WebDriverWait(driver,90);

            WebElement	ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='mageplaza-betterpopup-block']/div[@id='bio_ep']/div[1]/div[1]/img[1]")));
            ele.click();
            Thread.sleep(10000);
            WebElement ele4= driver.findElement(By.xpath("//button[@class='btn-cookie btn-cookie-accept']"));
            ele4.click();

        }
    public void RAQ() throws InterruptedException {
        logger.info("click on subscribe button");
        Thread.sleep(10000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;

        js1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(10000);
        WebElement ele4= driver.findElement(By.xpath("(//a[@href='https://www.platinumcode.us/request-a-quote/'][contains(.,'Quote Request')])[2]"));
        ele4.click();

    }


}
