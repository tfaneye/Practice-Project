package com.nopcommerce.demo;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Tunde on 18/07/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        monochrome = true,
        plugin = {"pretty",
        "html:target/test-report/report-html",
        "json:target/test-report/report-json.json",
        "junit:target/test-report/report-xml.xml"},
        features = {"src/test/resources"}
        ,snippets = SnippetType.CAMELCASE
        //,tags = {"@Feature_001,@Feature_002,@Feature_003,@Feature_004"}
        )
public class RunnerCukesTest {}
