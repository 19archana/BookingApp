package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Eclipse Workspace\\Cucumber_prjt\\src\\test\\java\\com\\app\\featureair", 
glue = "com.app.stepdefinition")

public class CheapAirRunner {



}
