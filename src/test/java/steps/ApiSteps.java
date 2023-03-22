package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.ApiSetup;

public class ApiSteps {
    @Given("tenho a url")
    public void tenho_a_url() {

    }
    @When("é feito uma chamada get")
    public void é_feito_uma_chamada_get() {
        //ApiSetup.getFilmes();
    }
    @Then("validar que é retornado os filmes corretamente")
    public void validar_que_é_retornado_os_filmes_corretamente() {

    }
}
