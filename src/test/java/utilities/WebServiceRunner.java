package utilities;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;


public class WebServiceRunner {

    private static Response response;

    public static Response runGetRequestWithAuthorName(RequestSpecification request, String authorName, String param){
        response = request.parameters("q",param+authorName)
                .get(ConfigurationReader.getProperty("git_url"));
        System.out.println(response.asString());
        return response;
    }



}