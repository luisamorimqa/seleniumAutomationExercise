package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import datatest.LogoutDataTest;
import dto.UserDTO;
import pages.HomePage;
import pages.LoginPage;

public class LogoutStepDefinitions {

    UserDTO userDTO;
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Dado("^que esteja logado no sistema$")
    public void que_esteja_logado_no_sistema() {
        userDTO = LogoutDataTest.setValue();
        loginPage.getPage();
        loginPage.fillLoginEmailAddressField(userDTO.getEmail());
        loginPage.fillLoginPasswordField(userDTO.getPassword());
        loginPage.clickLoginButton();
    }

    @Quando("^clico no botão Logout$")
    public void clico_no_botão_Logout() {
        homePage.clickLogoutButton();
    }

    @Então("^devo ser redirecionado para a página de login$")
    public void devo_ser_redirecionado_para_a_página_de_login() {
        loginPage.checkLoginPage();
    }
}
