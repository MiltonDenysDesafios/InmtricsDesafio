package pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import resources.ApiSetup;
import java.util.ArrayList;
import java.util.Collections;


public class StarWarsPage extends ApiSetup {

    private static String actualTitle;
    private static int actualEpisodeId;

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
                            System.out.println(diretor+" trabalhou como diretor de filmes de guerra nas estrelas " + countA + " vezes");
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
        System.out.println(produtor+" trabalhou como produtor de filmes de guerra nas estrelas " + numberOfItemIds + " vezes");
    }
    public static void getMovieId(String movie){

                 Response response = RestAssured.
                        given()
                        .contentType("application/json")
                        .when()
                        .get("/films/?title="+movie)
                        .then()
                        .statusCode(200)
                        .extract()
                         .response();

                 JsonPath jsonPath = response.jsonPath();
                 actualTitle = jsonPath.getString("results.find { it.title == '" + movie +"' }.title");
                 actualEpisodeId = jsonPath.getInt("results.find { it.title == '" + movie +"' }.episode_id");

    }
    public static void moviesReturn(){
        System.out.println("Episode ID do filme " + actualTitle + " é " + actualEpisodeId);
    }

}
