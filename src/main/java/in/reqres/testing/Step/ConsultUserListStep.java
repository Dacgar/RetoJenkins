package in.reqres.testing.Step;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ConsultUserListStep {
    private Response response;

    @Step
    public void getUserList(int page) {
        response = SerenityRest.when().get("/api/users?page=" + page);
    }

    @Step
    public void verifyResponseStatus(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }
}
