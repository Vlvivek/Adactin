package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vlviv\\eclipse pro\\"
		+ "Adactin\\FeatureFile\\Adactin.feature",glue = "org.project",
		dryRun = false)
public class RunnerClass {

}
