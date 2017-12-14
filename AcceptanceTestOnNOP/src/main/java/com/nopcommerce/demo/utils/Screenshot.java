package com.nopcommerce.demo.utils;

import com.nopcommerce.demo.pages.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Tunde on 12/07/2016.
 */
public class Screenshot extends BasePage {

    public Screenshot(WebDriver driver) {
        super(driver);
    }

    public void snap(String name){

        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int sec = calendar.get(Calendar.SECOND);
        int min = calendar.get(Calendar.MINUTE);
        int date = calendar.get(Calendar.DATE);
        int day = calendar.get(Calendar.HOUR_OF_DAY);
        int month = calendar.get(Calendar.MONTH);

        String timeStamp = year+"-"+date+"-"+(month+1)+"-"+day+"-"+min+"-"+sec;
        String systemPath = System.getProperty("user.dir");
        String fullPath = systemPath+"\\src\\main\\resources\\test_report_output\\screenshots\\"+name + timeStamp+".png";

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(fullPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
