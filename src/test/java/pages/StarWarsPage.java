package pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.junit.Assert;
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
    public static void contarDiretor(String diretor){

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
                            //count how many times director is display as director and show on console
                            int countA = Collections.frequency(response, diretor);
                            System.out.println(diretor+" worked as director of star wars movies " + countA + " times");
    }
    public static void contarProdutor(String produtor){

        ArrayList<String> response = new ArrayList<String>();
        int numberOfItemIds = 0;
        response =
                RestAssured.
                        given()
                        .contentType("application/json")
                        .when()
                        .get("/films")
                        .then()
                        .extract()
                        .path("results.producer");

        //loop through the list to count how many times producer is display as director and show on console
        for (int i=0; i < response.size();i++){
            if(response.contains(produtor)){
                numberOfItemIds++;
            }
        }
        System.out.println(produtor+" worked as producer of star wars movies " + numberOfItemIds + " times");
    }
    public static void getMovie(String movie){

    }

}
