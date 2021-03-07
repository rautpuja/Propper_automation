package com.PC_Automation_testcases.core;

import com.PC_Automation_testcases.utils.appium.MobUtils;
import com.PC_Automation_testcases.utils.common.Config;
import com.PC_Automation_testcases.utils.selenium.DriverPool;
import com.PC_Automation_testcases.utils.selenium.WebUtils;
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
				driver.manage().deleteAllCookies();
				WebUtils.navigateToURL(APPLICATION_URL);
				String u = "abhi@upbott.com";
				String p ="VictimCramsLogosGibes";
				// adding username, password with URL
				String str = "https://" + u + ":" + p + "@" +
						"c882714cd9.nxcli.net";
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
//
//	@AfterClass
//	public void suiteTearDown() {
//		// write excel file and file name is SaveTestNGResultToExcel.xls
//		Set<String> keyset = TestNGResults.keySet();
//		int rownum = 0;
//		for (String key : keyset) {
//			Row row = sheet.createRow(rownum++);
//			Object[] objArr = TestNGResults.get(key);
//			int cellnum = 0;
//			for (Object obj : objArr) {
//				Table.Cell cell = row.createCell(cellnum++);
//				if (obj instanceof Date)
//					cell.setCellValue((Date) obj);
//				else if (obj instanceof Boolean)
//					cell.setCellValue((Boolean) obj);
//				else if (obj instanceof String)
//					cell.setCellValue((String) obj);
//				else if (obj instanceof Double)
//					cell.setCellValue((Double) obj);
//			}
//		}
//		try {
//			FileOutputStream out = new FileOutputStream(new File(
//					"U-line Magento Upgrade Retailer Test Cases.xls"));
//			workbook.write(out);
//			out.close();
//			System.out
//					.println("Successfully saved Selenium WebDriver TestNG result to Excel File!!!");
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}


	}