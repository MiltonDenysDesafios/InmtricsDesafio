package pages;


import org.junit.Assert;
import org.openqa.selenium.By;

public class UiPage extends BasePage {

    public static void clicarCarreiras(){
        try {
            click(By.linkText("Carreiras"));
        } catch (Exception e) {
            System.err.println("clicarCarreiras");

        }
    }
    public static void clicarConhecaNossasVagas(){
        try {
            scrollToElement(By.linkText("CONHEÇA NOSSAS VAGAS"));
            click(By.linkText("CONHEÇA NOSSAS VAGAS"));
        } catch (Exception e) {
            System.err.println("clicarConhecaNossasVagas");
        }
    }
    public static void validarPaginaGupy(){
        try {
            switchToNextWindow();
            scrollToElement(By.xpath("//h2[contains(text(),'Conheça nossas vagas')]"));
            boolean buttonName = alertMessageContains(By.xpath("//h2[contains(text(),'Conheça nossas vagas')]"), "CONHEÇA NOSSAS VAGAS");
            Assert.assertTrue(buttonName);
        } catch (Exception e) {
            System.err.println("validarPaginaGupy");
        }
    }
}
