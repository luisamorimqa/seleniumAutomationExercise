package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import datatest.CreateAccountDataTest;
import dto.UserDTO;
import pages.AccountCreatedPage;
import pages.ExcludedAccountPage;
import pages.HomePage;
import pages.LoginPage;
import support.AccountUtils;
import support.SharedData;

public class DeleteAccountStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AccountUtils accountUtils = new AccountUtils();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    ExcludedAccountPage excludedAccountPage = new ExcludedAccountPage();

    @Dado("^que eu tenha uma conta no site$")
    public void que_eu_tenha_uma_conta_no_site() {
        UserDTO userDTO = CreateAccountDataTest.setValue();
        loginPage.doSignup(userDTO.getFirstname(), userDTO.getEmail());
        accountUtils.createAccount(userDTO);
    }

    @Dado("^esteja logado$")
    public void esteja_logado() {
        UserDTO userDTO = SharedData.get("userDTO");
        accountCreatedPage.clickContinueButton();
        homePage.checkLoggedMessage("Logged in as " + userDTO.getFirstname());
    }

    @Quando("^clico no botão deleteAccount$")
    public void clico_no_botão_deleteAccount() {
        homePage.clickDeleteAccountButton();
    }

    @Então("^a tela AccountDeleted deve ser exibida$")
    public void a_tela_AccountDeleted_deve_ser_exibida() {
        excludedAccountPage.checkExcludedAccountPage();
    }
}