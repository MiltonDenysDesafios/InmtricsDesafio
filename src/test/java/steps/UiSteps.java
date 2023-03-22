package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UiPage;

public class UiSteps {

    @Given("que acesso a home do site da Inmetrics")
    public void que_acesso_a_home_do_site_da_inmetrics() {

    }
    @When("desço até a sessão confira nossas vagas")
    public void desço_até_a_sessão_confira_nossas_vagas() {
        UiPage.clicarCarreiras();
        UiPage.clicarConhecaNossasVagas();
    }
    @Then("validar que ao clicar no link o usuário é encaminhado para a tela de visualização das vagas")
    public void validar_que_ao_clicar_no_link_o_usuário_é_encaminhado_para_a_tela_de_visualização_das_vagas() {
        UiPage.validarPaginaGupy();
    }
}
