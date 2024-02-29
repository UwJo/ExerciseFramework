package de.frameworkexe.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features={"src\\test\\java\\de\\frameworkexe\\Features"},
glue={"de.frameworkexe.Stepdefinitions","de.frameworkexe.Pages","de.frameworkexe.hooks","de.frameworkexe.utils"},
plugin={"pretty","html:target/report/htmlReports.html","json:target/report/jsonReports.json"})

public class RunnerTest {
    
}
