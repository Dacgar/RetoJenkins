package in.reqres.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/in/reqres/testing/features",
glue="in.reqres.testing.stepdefinitions",
snippets=SnippetType.CAMELCASE,
tags = "@ConsultListUser")
public class ConsultUserListRunner {

}
