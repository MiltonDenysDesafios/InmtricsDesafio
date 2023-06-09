package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.StarWarsPage;

public class ApiSteps {

    @When("é feito uma chamada get")
    public void é_feito_uma_chamada_get() {
        StarWarsPage.getFilmes();
    }
    @Then("mostrar em quantos filmes aparece {string} como diretor")
    public void contarDiretor(String diretor) {
        StarWarsPage.contarDiretor(diretor);
    }
    @Then("mostrar em quantos filmes aparece {string} como produtor")
    public void contarProdutor(String produtor) {
        StarWarsPage.contarProdutor(produtor);
    }
    @Then("é feito uma chamada get para o filme {string}")
    public void getMovie(String movie) {
        StarWarsPage.getMovieId(movie);
    }
    @Then("validar que é retornado os filmes corretamente")
    public void moviesReturn() {
        StarWarsPage.moviesReturn();
    }
}
