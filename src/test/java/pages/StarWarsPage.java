package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import resources.ApiSetup;

public class StarWarsPage extends ApiSetup {

    public static void getFilmes(){
        RestAssured.given()
                    .when()
                        .get("/films")
                    .then()
                        .statusCode(200);
    }
    public static void contarDiretorGeorgeLucas(){
                RestAssured.given()
                .when()
                    .get("/films")
                .then()
                .body("results.director", Matchers.hasItem("George Lucas"));
    }
}
