package com.zeroBank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumber2.json",
                "html:target/cucumber-report.html"
        },
        features = {
                "src/test/resources/features"
        },
        glue = "com/zeroBank/step_definitions",
        dryRun = false,
        tags = "@account",
        publish = true
)

public class CukesRunner2 {

}
