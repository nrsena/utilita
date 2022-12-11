package com.utilita.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "src/test/resources",
        features = "@target/rerun.txt"
)

public class FailedRunner {
}
