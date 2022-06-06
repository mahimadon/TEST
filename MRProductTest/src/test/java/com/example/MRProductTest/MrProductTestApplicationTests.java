package com.example.MRProductTest;


import org.junit.jupiter.api.Test;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import io.restassured.RestAssured;
import io.restassured.response.Response;

class MrProductTestApplicationTests {
	
	
	public static final int PORT = 8080;
	public static final String HOST = "localhost";
	public static WireMockServer server = new WireMockServer(PORT);
	
	public static void setUp(String URI) {
		
		server.start();
		ResponseDefinitionBuilder builder = new ResponseDefinitionBuilder();
		builder.withStatus(202);
		
		WireMock.configureFor(HOST, PORT);
		WireMock.stubFor(
					WireMock.get(URI)
					.willReturn(builder)
				);
	}
	
	public static void tearDown() {
		if(null != server) {
			server.shutdown();
		}
	}

	@Test
	void TestGetAllProductsEndPoint() {
		setUp("/product/getAllProducts");
		RestAssured.given()
		.when()
		.get("http://localhost:8080/product/getAllProducts")
		.then()
		.assertThat()
		.statusCode(202);
		tearDown();
	}
	
	@Test
	void TestGetProductEndPoint() {
		setUp("/product/getProductById/101");
		RestAssured.given()
		.when()
		.get("http://localhost:8080/product/getProductById/101")
		.then()
		.assertThat()
		.statusCode(202);
		tearDown();
	}
	
	@Test
	void TestBookProductGetEndPoint() {
		setUp("/product/bookProductById/201");
		RestAssured.given()
        .contentType("application/json")
		.when()
		.get("http://localhost:8080/product/bookProductById/201")
		.then()
		.assertThat()
		.statusCode(202)
		.extract()
		.asString()
		.equalsIgnoreCase("Successfully booked the Product");
		tearDown();
	}
	
}

