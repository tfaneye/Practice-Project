package com.nopcommerce.demo.hooks;

import com.nopcommerce.demo.test_browsers.SharedBrowsers;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Tunde on 14/10/2016.
 */
public class StepHooks {

    private final SharedBrowsers sharedBrowsers;

    public StepHooks(SharedBrowsers sharedBrowsers){
        this.sharedBrowsers = sharedBrowsers;
    }

    @Before()
    public void setUpTest1() throws Exception {
        sharedBrowsers
                .initialiseBrowsers()
                .setUpBrowsers();
    }

    /*@Before(value = "@Feature_002",order = 2)
    public void setUpTest2() throws Exception {
        sharedBrowsers
                .initialiseBrowsers()
                .setUpBrowsers();
    }

    @Before(value = "@Feature_003",order = 3)
    public void setUpTest3() throws Exception {
        sharedBrowsers
                .initialiseBrowsers()
                .setUpBrowsers();
    }

    @Before(value = "@Feature_004",order = 4)
    public void setUpTest4() throws Exception {
        sharedBrowsers
                .initialiseBrowsers()
                .setUpBrowsers();
    }
*/
    @After()
    public void cleanUpTest1(Scenario scenario){
        sharedBrowsers.screenCapture(scenario);
       // sharedBrowsers.tearDownBrowserSetUp();
    }

    /*@After(value = "@Feature_002",order = 2)
    public void cleanUpTest2(Scenario scenario){
        sharedBrowsers.screenCapture(scenario);
        sharedBrowsers.tearDownBrowserSetUp();
    }

    @After(value = "@Feature_003",order = 3)
    public void cleanUpTest3(Scenario scenario){
        sharedBrowsers.screenCapture(scenario);
        sharedBrowsers.tearDownBrowserSetUp();
    }

    @After(value = "@Feature_004",order = 4)
    public void cleanUpTest4(Scenario scenario){
        sharedBrowsers.screenCapture(scenario);
        sharedBrowsers.tearDownBrowserSetUp();
    }
*/
}
