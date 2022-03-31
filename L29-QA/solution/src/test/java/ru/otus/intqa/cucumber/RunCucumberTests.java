package ru.otus.intqa.cucumber;


import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;


@Suite
@IncludeEngines( "cucumber" )
@SelectClasspathResource( "ru/otus/intqa/cucumber" )
public class RunCucumberTests {
}
