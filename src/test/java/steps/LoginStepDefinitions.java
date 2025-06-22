package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import pages.LoginPage;

import static support.Commands.*;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Dado("^que estou na página de login$")
    public void que_estou_na_página_de_login() {
        loginPage.getPage();
        loginPage.checkLoginPage();
    }

    @Quando("^informo um e-mail cadastrado$")
    public void informo_um_e_mail_cadastrado() {
        loginPage.fillLoginEmailAddressField(getValidEmail());
    }

    @Quando("^informo a senha válida$")
    public void informo_a_senha_válida() {
        loginPage.fillLoginPasswordField(getValidPassword());
    }

    @Quando("^clico no botão Login$")
    public void clico_no_botão_Login() {
        loginPage.clickLoginButton();
    }

    @Então("^devo ver a mensagem \"([^\"]*)\"$")
    public void devo_ver_a_mensagem(String value) {
        homePage.checkHomePage();
        homePage.checkLoggedMessage(value);
    }

    @Quando("^informo a senha incorretamente$")
    public void informo_a_senha_incorretamente() {
        loginPage.fillLoginPasswordField(getInvalidPassword());
    }

    @Então("^devo ver a mensagem de erro \"([^\"]*)\"$")
    public void devo_ver_a_mensagem_de_erro(String value) {
        loginPage.checkAlertMessageLogin(value);
    }

    @Quando("^informo um e-mail não cadastrado$")
    public void informo_um_e_mail_não_cadastrado() {
        loginPage.fillLoginEmailAddressField(getValidEmail());
    }
}
