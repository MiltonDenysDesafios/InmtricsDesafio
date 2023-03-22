package resources;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;


public class ApiSetup implements Constants{


    public static void setup(){
        RestAssured.baseURI = APP_BASE_URL;
        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
        reqBuilder.setContentType(APP_CONTENT_TYPE);
        RestAssured.requestSpecification = reqBuilder.build();

    }



//    public static void getFilmes(){
//        RestAssured.given()
//                    .when()
//                        .contentType(ContentType.JSON)
//                        .get("https://swapi.dev/api/films/")
//                    .then()
//                        .statusCode(200)
//                        .log().all();
//    }
//    public static void getFilmesDiretorGeorgeLucas(){
//        RestAssured.given()
//                .when()
//                    .get("https://swapi.dev/api/films/")
//                .then()
//                    .statusCode(200)
//                .body("find{director}")
//    }
}
