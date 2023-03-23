package pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import resources.ApiSetup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StarWarsPage extends ApiSetup {

    public static void getFilmes(){
        RestAssured.given()
                    .when()
                        .get("/films")
                    .then()
                        .statusCode(200);
    }
    public static void contarDiretorGeorgeLucas(){

        ArrayList<String> response = new ArrayList<String>();
        response =
                RestAssured.
                        given()
                            .contentType("application/json")
                        .when()
                            .get("/films")
                        .then()
                        .extract()
                            .path("results.director");
                            System.out.println(response);
                            //count how many times George Lucas is display as director and show on console
                            int countA = Collections.frequency(response, "George Lucas");
                            System.out.println("George Lucas worked as director of star wars movies " + countA + " times");
    }
    public static void contarProdutorRickMcCallum(){

        ArrayList<String> response = new ArrayList<String>();
        response =
                RestAssured.
                        given()
                        .contentType("application/json")
                        .when()
                        .get("/films")
                        .then()
                        .extract()
                        .path("results.producer");
        System.out.println(response);
        //count how many times George Lucas is display as director and show on console
        int countA = Collections.frequency(response, "Rick McCallum");
        System.out.println("Rick McCallum worked by itself as producer of star wars movies " + countA + " times");
    }
}
