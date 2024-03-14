package de.frameworkexe.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src\\test\\resources\\features" }, glue = {
        "de.frameworkexe.stepdefinitions", "de.frameworkexe.pages", "de.frameworkexe.hooks",
        "de.frameworkexe.utils" }, plugin = { "pretty", "html:target/report/htmlReports.html",
                "json:target/report/jsonReports.json"},tags="@popups")

public class RunnerTest {

}
