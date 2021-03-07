package com.BSP_Testcases.page.actions.web.TestCases;

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

import java.util.List;

public class Search_result_page {

    private static final Logger logger = LoggerFactory.getLogger(Search_result_page.class);

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//i[@class='porto-icon-search']")
    @CacheLookup
    WebElement Search_icon;




    public Search_result_page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void search_pop_up() throws InterruptedException {
        Thread.sleep(9000);
        logger.info("\"Search auto pop up with\n" +
                " '1625 products found' message should display\"");

        WebElement Search_icon= driver.findElement(By.xpath("//input[contains(@name,'q')]"));
         Search_icon.sendKeys("bags");
         Thread.sleep(4000);
        WebElement text= driver.findElement(By.xpath("//div[@class='results-count'][contains(.,'1625 products found')]"));
        System.out.println("Pop up Text is : "+text.getText());


    }

    public void sort_by_filter() throws InterruptedException {
      //  Thread.sleep(4000);
        logger.info("\"By default 'Relevance' filter should get open and below options should get displayed\n" +
                "1.Product Name\n" +
                "2.Price\n" +
                "3.Stylus\n" +
                "2. After selecting filter products should get filtered accordingly\"");
        Thread.sleep(10000);

        WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,'sorter-options')]"));
        Select select = new Select(dropdown);
        java.util.List<WebElement> options = select.getOptions();
        for(WebElement item:options)
        {

            System.out.println("Dropdown values are "+ item.getText());
        }
Select sel=new Select(dropdown);
        sel.selectByValue("price");

    }
    public void acsending_and_descending_arrows() throws InterruptedException {
        //  Thread.sleep(4000);
        logger.info("After click on arrow product should get sorted in ascending or descending arrow");
        Thread.sleep(30000);
        WebElement Assending= driver.findElement(By.xpath("//a[contains(@title,'Set Ascending Direction')]"));
        if(Assending.isDisplayed()) {
            Actions ac = new Actions(driver);


            ac.moveToElement(Assending).click().build().perform();

            System.out.println("click on assending order");
        }
        else {
            Actions ac1 = new Actions(driver);

            WebElement dessending = driver.findElement(By.xpath("//a[contains(@title,'Set Descending Direction')]"));
            ac1.click(dessending).click().build().perform();
            System.out.println("click on descending order");
        }

    }
    public void product_information() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\" Product name with \n" +
                "As low as _ each\n" +
                "Minimum Purchase:  text should displayed\n" +
                "and Add to Wish List button should displayed\n" +
                "\"");
        Thread.sleep(5000);
        WebElement ele3= driver.findElement(By.xpath("(//div[contains(@class,'image')])[1]"));
       System.out.println("product information : "+ele3.getText());


    }

public void filter_option() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("\"Filter options should be\n" +
                "1.BRAND\n" +
                "2.CATEGORIES\n" +
                "3.COLOR\n" +
                "4.Minimum Purchase Number\n" +
                "5.PRICE\n" +
                "6.Manufacturer\"");


    WebElement filter= driver.findElement(By.xpath("//div[contains(@class,'ma-layer wyomind-bg-secondary')]"));
   System.out.println("Filter options are: "+filter.getText());

}
    public void Checkbox_from_filter() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("Filter option should get selected and product should get displayed as per filter option");
        WebElement Search_icon= driver.findElement(By.xpath("//span[contains(.,'Alternative Apparel')]"));
       Search_icon.click();



    }
    public void Clear_all_link() throws InterruptedException {
        Thread.sleep(30000);
        logger.info("After click on Clear all Selected link filter option should get cleared");

        WebElement Clear_all_link= driver.findElement(By.xpath("//a[contains(@class,'ma-layer-clear-all clear')]"));
    Clear_all_link.click();




    }
    public void clear_all_searchaut_popup_login() throws InterruptedException {
        Thread.sleep(10000);
        logger.info("It should redirect to respective page\n after login");

        Actions ac=new Actions(driver);
        WebElement Search_icon= driver.findElement(By.xpath("(//a[@href='#'])[2]"));
        ac.moveToElement(Search_icon).click().build().perform();

    }

      public void Cross_icon() throws InterruptedException {

        logger.info("Pop up should get closed");
    Thread.sleep(10000);
          Actions ac=new Actions(driver);
    WebElement cross= driver.findElement(By.xpath("//a[contains(@class,'close wyomind-primary-color')]"));
          ac.moveToElement(cross).click().build().perform();

    }

    public void Product_name_link() throws InterruptedException {
        logger.info("Application should redirect to PDP page");

        Thread.sleep(10000);
        WebElement Search_icon= driver.findElement(By.xpath("//input[contains(@name,'q')]"));
        String select = Keys.chord(Keys.CONTROL, "a");
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("bags");
        Thread.sleep(4000);
        WebElement product_name= driver.findElement(By.xpath("(//a[contains(@class,'product-item-link')])[1]"));
        product_name.click();

    }

    public void search_result_page() throws InterruptedException {
        logger.info("It should get redirected to the search result page and all respective products  should display on it");
        Thread.sleep(20000);
        WebElement Search_icon= driver.findElement(By.xpath("//input[contains(@name,'q')]"));
        String select = Keys.chord(Keys.CONTROL, "a");
        Search_icon.sendKeys(select);
        Search_icon.sendKeys("BACKPACKS");
        Thread.sleep(5000);
       Search_icon.sendKeys(Keys.ENTER);



    }
    public void search_result_page_breadcrumb() throws InterruptedException {
        logger.info("\"It should display the breadcrumb properly starting with Home >\n" +
                "Click on breadcrumb it should redirect to respective page\"");
        Thread.sleep(20000);
        WebElement Search_icon= driver.findElement(By.xpath("//div[contains(@class,'breadcrumbs')]"));
       System.out.println("Breadcrumb is : "+Search_icon.getText());



    }
    public void main_category_name() throws InterruptedException {
        logger.info("Application should display correct category name in the breadcrumb");
        Thread.sleep(20000);
        WebElement Search_icon= driver.findElement(By.xpath("//strong[contains(.,'Promotional Backpacks')]"));
        System.out.println("Breadcrumb is : "+Search_icon.getText());



    }
    public void Read_more_link() throws InterruptedException {
        logger.info("It should redirect at bottom of pagination and should display a paragraph");
        Thread.sleep(20000);
        WebElement read= driver.findElement(By.xpath("//strong[contains(.,'READ MORE')]"));
       read.click();



    }

    public void sorter_option() throws InterruptedException {
        logger.info("Product sorting  should be according to relevance(by default selected)");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//select[contains(@id,'sorter')])[2]"));
        Select s = new Select(ele2);
        List<WebElement> op = s.getOptions();
        int size = op.size();
        for (int i = 0; i < size; i++) {
            String options = op.get(i).getText();
            System.out.println(options);
        }

    }
    public void sorter_option_selection() throws InterruptedException {
        logger.info("\"It should dispaly four options\n" +
                "1.relevance\n" +
                "2.product name\n" +
                "3.price\n" +
                "4.stylus\n" +
                "It should display result according to selection of option\"");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//select[contains(@id,'sorter')])[2]"));
        Select sel=new Select(ele2);
        sel.selectByValue("price");
    }
    public void product_image() throws InterruptedException {
        logger.info("Product image, product name should be clear and distinct");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//div[@class='product-item-info'])[1]"));
        System.out.println("Product detail : " + ele2.getText());
    }

    public void product_image_link() throws InterruptedException {
        logger.info("It should get redirect to respective page");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele2 = driver.findElement(By.xpath("(//a[contains(@class,'product-item-link')])[1]"));
        ac.moveToElement(ele2).click().build().perform();
        Thread.sleep(10000);
        driver.navigate().back();
        // WebUtils.navigateToURL(APPLICATION_URL);
    }

    public void wishlist_link() throws InterruptedException {
        logger.info("It should display a success message 'product_name has been added to your Wish List. Click here to continue shopping.' and added to wish list");
        Thread.sleep(10000);
        WebElement ele2 = driver.findElement(By.xpath("(//span[contains(.,'Add to Wish List')])[2]"));
        ele2.click();

    }

    public void filter_option_SRP() throws InterruptedException {
        logger.info("\"When filter options are selected it should display respective products\n" +
                "Filter should present in left hand side of all poducts\"");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele2 = driver.findElement(By.xpath("(//span[@class='title '][contains(.,'5')])[1]"));
        ac.moveToElement(ele2).click().build().perform();

    }

    public void clear_all_option() throws InterruptedException {
        logger.info("Application should clear selected filter");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele2 = driver.findElement(By.xpath("(//a[@class='eln-layer-clear-all clear'])[1]"));
        ac.moveToElement(ele2).click().build().perform();

    }

    public void minimize_filter() throws InterruptedException {
        logger.info("It should the close the filter dropdown . By default fiilter dropdown should open");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement ele2 = driver.findElement(By.xpath("//div[@class='filter-options-title'][contains(.,'Minimum Purchase Number')]"));
        ac.moveToElement(ele2).click().build().perform();


    }
    public void maximize_filter() throws InterruptedException {
        logger.info("It should the open the filter dropdown ");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//div[@class='filter-options-title'][contains(.,'Minimum Purchase Number')]"));
        ac.moveToElement(ele2).click().build().perform();

    }

    public void showmore_option() throws InterruptedException {
        logger.info("It should display more options of the filter ");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//div[contains(@data-target,'filter-brand_ids')]"));
        ac.moveToElement(ele2).click().build().perform();

    }

    public void showless_option() throws InterruptedException {
        logger.info("It should display more options of the filter ");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//div[contains(@class,'show-more expand')]"));
        ac.moveToElement(ele2).click().build().perform();


    }

    public void show_filter() throws InterruptedException {
        logger.info("Show button should align properly  ");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//select[contains(@data-role,'limiter')]"));
        System.out.println(" Filter is : "+ele2.getText());

    }
    public void show_filter_select() throws InterruptedException {
        logger.info("By default 30 should be selected and results should be according to the selection. It should sort the results as per 30,60,90 items selected");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//select[contains(@data-role,'limiter')]"));
        Select sel=new Select(ele2);
        sel.selectByValue("60");

    }
    public void pagination() throws InterruptedException {
        logger.info("It should display numbers ending with Next arrow icon");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//a[@class='action  next page']"));
        ac.moveToElement(ele2).click().build().perform();

    }
    public void pagination_button() throws InterruptedException {
        logger.info("It should redirect to respective page");
        Thread.sleep(10000);
        Actions ac=new Actions(driver);
        WebElement	ele2= driver.findElement(By.xpath("//a[@href='#'][contains(@id,'30')][contains(.,'3')]"));
        ac.moveToElement(ele2).click().build().perform();

    }
}