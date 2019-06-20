package com.itexico.testing.testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/features"}, 
		glue= {"com.itexico.testing.steps"})
public class LoginRunner {}