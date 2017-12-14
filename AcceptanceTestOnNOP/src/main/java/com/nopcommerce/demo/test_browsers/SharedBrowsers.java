package com.nopcommerce.demo.test_browsers;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.nopcommerce.demo.pages.BasePage;
import com.nopcommerce.demo.utils.Screenshot;
import cucumber.api.Scenario;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SharedBrowsers {

	protected static WebDriver driver;
	protected static FileInputStream fis;
	protected static Properties config = new Properties();
	protected static Logger logger = LogManager.getLogger("TestLogger");
	
	
	public SharedBrowsers initialiseBrowsers() throws Exception {
	
		if(driver == null) {
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
			if (config.getProperty("browser").equalsIgnoreCase("FireFox")) {
				driver = new FirefoxDriver();
			} else if (config.getProperty("browser").toLowerCase().contains("chrome")) {
				System.setProperty("webdriver.chrome.driver", BrowserPaths.getBrowserPath(config.getProperty("browser")));
				driver = new ChromeDriver();
			} else if (config.getProperty("browser").toLowerCase().contains("ie")) {
				System.setProperty("webdriver.ie.driver", BrowserPaths.getBrowserPath(config.getProperty("browser")));
				driver = new InternetExplorerDriver();
			}else if(config.getProperty("browser").equals("ghosthtml")) {
            	if (config.getProperty("ghostBroswer").equals("chrome")) {
                	driver = new HtmlUnitDriver(BrowserVersion.CHROME);
                	((HtmlUnitDriver) driver).setJavascriptEnabled(true);
                	logger.info("Executed test on the HTML Headless Chrome Browser");
				} else if (config.getProperty("ghostBroswer").equals("firefox")) {
                	driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
                	((HtmlUnitDriver) driver).setJavascriptEnabled(true);
                	logger.info("Executed test on the HTML Headless Firefox Browser");
            	} else if (config.getProperty("ghostBroswer").equals("ie8")) {
                	driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_8);
                	((HtmlUnitDriver) driver).setJavascriptEnabled(true);
                	logger.info("Executed test on the HTML Headless IE 8 Browser");
            	} else if (config.getProperty("ghostBroswer").equals("ie11")) {
               		driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_11);
                	((HtmlUnitDriver) driver).setJavascriptEnabled(true);
                	logger.info("Executed test on the HTML Headless IE 11 Browser");
            	}
        	}else if(config.getProperty("browser").equals("ghostphantomjs")){
            	DesiredCapabilities capabilities = new DesiredCapabilities();
           		capabilities.setJavascriptEnabled(true);
            	capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, BrowserPaths.getBrowserPath("phantomjs"));
            	driver = new PhantomJSDriver(capabilities);
            	logger.info("Executed test on the PhantomJS Headless Browser");
			} else {
				logger.error("There is no such browser in this application");
				throw new Exception("There is no such browser");
			}
		}
		return new SharedBrowsers();
	}
	
	public void setUpBrowsers() {
		try {
			driver.manage().deleteAllCookies();
			logger.info("All browser cookies are cleared");		
			driver.manage().window().maximize();
			logger.info("Browser has been maximized");
		}catch(Exception e) {
			logger.error("Error occurred while setting up browser: "+e);
		}
	}

	public void tearDownBrowserSetUp(){
		try {
			if(driver != null) {
				driver.close();
				logger.info("Browser has successfully closed");
			}
		}catch(Exception e) {
			logger.error("Browser failed to close with error message: ", e);
		}
	}

    public void screenCapture(Scenario scenario){
        scenario.write("The Scenario name is "+scenario.getName()+" and the status is "+scenario.getStatus());
        if (scenario.isFailed()){
            Screenshot sc = new Screenshot(driver);
            sc.snap(scenario.getName());
            logger.error("Scenario failed! Browser: "  + " Taking screenshot...");
            scenario.write("Current Page URL is: " + driver.getCurrentUrl());
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                logger.error(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
    }
}
