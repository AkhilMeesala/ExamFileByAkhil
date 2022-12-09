package TestCase;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Automate_Getcommand {

	// WAP to automate the Get Command and write 2 TestCase
	
	ResponseSpecification res;
    RequestSpecification req_spec;
    String str=" ";
    @BeforeClass
    public void setSpecification() {
        res=RestAssured.expect();
        res.statusLine("HTTP/1.1 200 OK");
        res.contentType(ContentType.JSON);
        
    }
    //1
    // valid URL in baseURL
    @Test(priority=1)
    public void Valid_getBanner_URL() {
    	
    	RestAssured.baseURI = "https://arcadia.pisystindia.com/";
    	
    	Response resp = given().header("Authorization",str).when().get("api/getBanner").then().contentType(ContentType.JSON).extract().response();
    	
    	System.out.println("GetBanner output:"+resp.body().asPrettyString());
    	
    	JSONObject obj = new JSONObject(resp.body().asPrettyString());
    	JSONArray arr = obj.getJSONArray("payload");
    	
    }
    //2
    // Invalid URL in baseURL
    @Test(priority=2)
    public void Invalid_getBanner_URL() {
    	
    	RestAssured.baseURI = "https://pisystindia.com/";
    	
    	Response resp = given().header("Authorization",str).when().get("api/getBanner").then().contentType(ContentType.JSON).extract().response();
    	
    	System.out.println("GetBanner output:"+resp.body().asPrettyString());
    	
    	JSONObject obj = new JSONObject(resp.body().asPrettyString());
    	JSONArray arr = obj.getJSONArray("payload");
    	
    }

}
