package restassured;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.RequestSpecification;

public class CreateEmployeeFromJsonFile {

	public void createEmployeeFromJsonFile() {
		
		File jsonfile = new File("postData.json");
		given()
		.baseUri("http://localhost:8000/")
		.header("Content-Type","application/json")
		.body(jsonfile)
		.when()
		.post("/employees")
		.prettyPrint();
	}
	
	public static void main(String[] args) {
		CreateEmployeeFromJsonFile testrun = new CreateEmployeeFromJsonFile();
		testrun.createEmployeeFromJsonFile();
	}

}
