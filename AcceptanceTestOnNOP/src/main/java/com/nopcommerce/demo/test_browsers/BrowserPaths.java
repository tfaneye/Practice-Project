package com.nopcommerce.demo.test_browsers;

/**
 * Created by Tunde on 11/07/2016.
 */
public class BrowserPaths {


    public static String getBrowserPath(String browserName){

        String browserPath = null;
        String systemPath = System.getProperty("user.dir");
        String chromePath = "/Embedded_Drivers/chromedriver";
        String iePath = "\\Embedded_Drivers\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe";
        String phantomjsPath = "/Embedded_Drivers/phantomjs-2.1.1-linux-x86_64/bin/phantomjs";

        if(browserName.toLowerCase().contains("chrome")){
            browserPath = systemPath + chromePath;
        }else if(browserName.toLowerCase().contains("ie")){
            browserPath = systemPath + iePath;
        }else if(browserName.toLowerCase().contains("phantomjs")){
            browserPath = systemPath + phantomjsPath;
        }

        return browserPath;

    }
}
