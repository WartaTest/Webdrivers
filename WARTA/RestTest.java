package Viacom.Base.JSON;

import org.eclipse.jetty.server.Response;
import org.junit.BeforeClass;

public class RestTest {
	
	public class RestAssuredTest {
	    public final static String response = "response";
	    public static final String jsonAsString = response;
	    @BeforeClass
	    public void setupURL()
	    {
	        // here we setup the default URL and API base path to use throughout the tests
	        RestAssured.baseURI = "https://api.stackexchange.com/2.2/search?order=desc&sort=activity&intitle=perl&site=stackoverflow";
	        RestAssured.basePath = "/api/myapi/";
	    }
	    @BeforeClass
	    public void callRidesAPI()
	    {
	        // call the rides API, the full address is "http://yourwebsiteaddress.com/api/yourapi/rides",
	        // but we set the default above, so just need "/rides"
	        response =
	            when().
	                get("/items").
	            then().
	                contentType(ContentType.JSON).  // check that the content type return from the API is JSON
	            extract().response(); // extract the response
	        // We convert the JSON response to a string, and save it in a variable called 'jsonAsString'
	        jsonAsString = response.toString();
	    }
	}

}
