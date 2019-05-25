package step_definitions;
import com.jayway.restassured.specification.RequestSpecification;
import com.jayway.restassured.http.*;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import org.testng.Assert;
import com.jayway.restassured.RestAssured;
import cucumber.api.java.en.*;
import utilities.WebServiceRunner;
import static org.hamcrest.Matchers.*;

public class StepDefinitionsAPI {
    public static RequestSpecification request;
    public static Response response;

    @Given("^ContentType and AcceptType is Json$")
    public RequestSpecification contenttype_and_AcceptType_is_Json() {
        request = RestAssured.given().accept(ContentType.JSON).and().contentType(ContentType.JSON);
        return request;
    }


    @When("^user enters valid (.*) and hits api$")
    public void user_enters_valid_and_hits_api(String authorName) {
        String validParam = "user:";
        response = WebServiceRunner.runGetRequestWithAuthorName(contenttype_and_AcceptType_is_Json(), authorName, validParam);
    }


    @Then("^status code should be (\\d+)$")
    public void status_code_should_be(int statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode);
        System.out.println("Service status: " + response.getStatusCode());
    }


    @Then("^user verifies the (.*) exists and the (.*) exists$")
    public void user_verifies_the_exists_and_the_exists(String repo1, String repo2) {
        response.then().assertThat().body("items.name", hasItem(repo1));
        response.then().assertThat().body("items.name", hasItem(repo2));
    }


    @Then("^user verifies the (.*) of repositories$")
    public void user_verifies_the_of_repositories(String authorName) {
        response.then().assertThat().body("items.owner.login", hasItem(authorName));
    }


    @Then("^user verifies that invalid (.*) and invalid (.*) do not exist$")
    public void user_verifies_that_invalid_and_invalid_do_not_exist(String repo1, String repo2) {

        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();
        Assert.assertEquals(bodyAsString.contains(repo1), false, "Response body doesn't contain: "+repo1);
        Assert.assertEquals(bodyAsString.contains(repo2), false, "Response body doesn't contain: "+repo2);

    }







}
