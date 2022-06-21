package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da qazando$")
    public void acessarSiteQazando() {
        homePage.acessarAplicacao();
    }

    @Quando("^eu preencho meu e-mail$")
    public void euPreenchoMeuEmail() throws InterruptedException {
        homePage.preencheEmail();
    }

    @E("^clico em ganhar cupom$")
    public void clicoEmGanharCupom() {
        homePage.ganharDesconto();
    }

    @Então("^eu vejo o código de desconto$")
    public void verificarCupomDescontoAplicado() {
        homePage.verificarCupomDesconto();
    }
}
