package com.Marvel.core;

import com.Marvel.utils.appium.MobUtils;
import com.Marvel.utils.common.Config;
import com.Marvel.utils.selenium.DriverPool;
import com.Marvel.utils.selenium.WebUtils;
//import com.google.common.collect.Table;
//import com.sun.rowset.internal.Row;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.annotations.*;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Date;
//import java.util.Set;

public class BaseConfiguration {

	private static final Logger LOGGER = LoggerFactory.getLogger(BaseConfiguration.class);

	public static WebDriver driver;
	private ITestContext context;
	private static final String APPLICATION_URL = Config.getProperty("appURL");
	public static final String username = Config.getProperty("Username");
	public static final String password = Config.getProperty("password");

	@Parameters({"browser", "nodeURL", "deviceOrientation"})
	@BeforeClass
	public void setup(@Optional("CHROME") String browser, @Optional("") String nodeURL, @Optional("LANDSCAPE") String deviceOrientation, ITestContext ctx) {
		try {
			if (browser.contains("mobile")) {
				driver = (AndroidDriver<WebElement>) DriverPool.getDriver(browser, nodeURL);
				WebUtils.setDriver(driver);
				MobUtils.setDeviceOrientation(deviceOrientation);
				WebUtils.navigateToURL(APPLICATION_URL);
			} else {
				driver = DriverPool.getDriver(browser, nodeURL);
				WebUtils.setDriver(driver);
				driver.manage().window().maximize();
				WebUtils.navigateToURL(APPLICATION_URL);
					String u = "devuser";
				String p ="nvfsqxnT4ojko0Yo";
				// adding username, password with URL
				String str = "https://" + u + ":" + p + "@" +
						"dev.marvelrefrigeration.com/";
				driver.get(str);
			}
		} catch (Exception e) {
			LOGGER.error("Error occured {} ", e.getMessage());
			throw new WebDriverException(e.getMessage());

		}


		this.context = DriverPool.setupContext(driver, ctx, browser, nodeURL);
	}


	@AfterSuite
	public void tearDown() {
		//driver.quit();
	}



	}