package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.test_browsers.SharedBrowsers;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage  {


    protected static FileInputStream fis;
    protected static Properties config = new Properties();
    protected static Logger logger = LogManager.getLogger("TestLogger");
    protected final WebDriver driver;

    public BasePage(WebDriver driver){
		this.driver = driver;
        initialiseProperties();
	}

    private void initialiseProperties(){
        try {
            fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/environment_testdata.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            config.load(fis);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
	
	public HomePage loadDefaultPage(){
		driver.navigate().to(config.getProperty("baseUrl"));
		logger.info("Browser loaded successfully");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return PageFactory.initElements(driver, HomePage.class);
	}

}
