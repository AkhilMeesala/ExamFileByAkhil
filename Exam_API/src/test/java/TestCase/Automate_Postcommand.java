package TestCase;

import java.util.HashMap;
import java.util.LinkedHashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Automate_Postcommand {
	// WAP to automate the Post Command and write 2 TestCase
	
	ResponseSpecification res;
    RequestSpecification req_spec;
    String str=" ";
    @BeforeClass
    public void setSpecification() {
        res=RestAssured.expect();
        res.statusLine("HTTP/1.1 200 OK");
        res.contentType(ContentType.JSON);
        
    }
    
    @Test(priority=1)
    public void Valid_loginUser() {
        HashMap<String,String>params=new HashMap<String,String>();
        params.put("username", "avez.kazi@pisystindia.com");
        params.put("password","Avez@123456");
        RestAssured.baseURI="https://arcadia.pisystindia.com/";
        Response resp=given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
        System.out.println("op is"+resp.asPrettyString());
        LinkedHashMap<String,Object> payload = resp.body().jsonPath().get("payload");
    }
    
    @Test(priority=2)
    public void Invalid_LoginUserName() {
        HashMap<String,String>params=new HashMap<String,String>();
        params.put("username", "kazi@pisystindia.com");
        params.put("password","Avez@123456");
        RestAssured.baseURI="https://arcadia.pisystindia.com/";
        Response resp=given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
        System.out.println("op is"+resp.asPrettyString());
        LinkedHashMap<String,Object> payload = resp.body().jsonPath().get("payload");
    }

}
