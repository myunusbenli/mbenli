package com.myb.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {//we need curly bracelet to use multiple plugin
                "html:target/cucumber-report.html",         //html report
                "json:target/cucumber.json",                //json report
                "rerun:target/rerun.txt",                   //create failed tests report
                "junit:target/junit/junit-report.xml",
                "pretty"
        },
        features = "src/test/resources/features",           //path from content root
        glue = "com/myb/step_definitions",                //path from source root
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {
}
