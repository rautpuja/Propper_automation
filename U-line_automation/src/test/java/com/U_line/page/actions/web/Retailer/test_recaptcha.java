//package com.U_line.page.actions.web.Retailer;
//
////import jdk.javadoc.internal.doclets.formats.html.markup.Links;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//
//public class test_recaptcha {
//
//    private static String[] links = null;
//    private static int linksCount = 0;
//
//    public static void main(String[] args) throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\UPBOTT\\propper-automation\\U-Line\\src\\test\\resources\\drivers\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://u-line.upbott.com/");
//
//        Thread.sleep(4000);
//        String parent = driver.getWindowHandle();
//
//        Set<String> s = driver.getWindowHandles();
//
//        homePageActions.Social_media_icon_FB();
//        homePageActions.Social_media_icon_Twitter();
//        homePageActions.Social_media_icon_You_tube();
//        homePageActions.Social_media_icon_Linkedin();
//        homePageActions.Social_media_icon_Pinrest();
//        homePageActions.Social_media_icon_Insta();
//        homePageActions.Social_media_icon_Houzz();
//
//
//// Now iterate using Iterator
//        Iterator<String> I1 = s.iterator();
//
//        while (I1.hasNext()) {
//
//            String child_window = I1.next();
//
//
//            if (!parent.equals(child_window)) {
//                driver.switchTo().window(child_window);
//
//                System.out.println(driver.switchTo().window(child_window).getTitle());
//
//                driver.close();
//            }
//
//        }
////switch to the parent window
//        driver.switchTo().window(parent);
//
//    }
//}
