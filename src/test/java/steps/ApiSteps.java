package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.StarWarsPage;

public class ApiSteps {
    @Given("tenho a url")
    public void tenho_a_url() {

    }
    @When("é feito uma chamada get")
    public void é_feito_uma_chamada_get() {
        //StarWarsPage.getFilmes();
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
        StarWarsPage.getMovie(movie);
    }
}
