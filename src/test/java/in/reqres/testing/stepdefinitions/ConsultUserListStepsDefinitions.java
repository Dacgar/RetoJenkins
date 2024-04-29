package in.reqres.testing.stepdefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.reqres.testing.Step.ConsultUserListStep;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class ConsultUserListStepsDefinitions {
	
    @Steps
    ConsultUserListStep consultUserStep;
	
	private RequestSpecification request;
    private Response response;

	@Given("^I want consult user list of information to service \"([^\"]*)\"$")
	public void iWantConsultUserListOfInformationToService(String baseUrl) {
		String url = baseUrl + "?page=2";
		//System.out.println("url: " + url);
		request = RestAssured.given().baseUri(url);
	}

	@When("^I execute service request$")
	public void iExecuteServiceRequest() {
	    response = request.get();
	    //String responseBody = response.getBody().prettyPrint();
	    //Serenity.recordReportData().withTitle("API Response").andContents(responseBody);
	    //int statusCode = response.getStatusCode();
        //System.out.println("Response status code: " + statusCode);
	}

	@Then("^I validate the code status will \"([^\"]*)\"$")
	public void iValidateTheCodeStatusWill(int expectedStatusCode) {
		  // Verificar que el código de estado de la respuesta coincida con el esperado
	    int actualStatusCode = response.getStatusCode();
	    //System.out.println("Response status code2: " + expectedStatusCode);
	    Assert.assertEquals("Unexpected status code", expectedStatusCode, actualStatusCode);
	}
}
