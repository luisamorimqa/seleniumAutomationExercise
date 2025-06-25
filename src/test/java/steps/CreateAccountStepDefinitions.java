package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import datatest.CreateAccountDataTest;
import dto.UserDTO;
import pages.AccountCreatedPage;
import pages.CreateAccountPage;

public class CreateAccountStepDefinitions {

    UserDTO userDTO = new UserDTO();
    CreateAccountPage createAccountPage = new CreateAccountPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();

    @Dado("^preencho o campo password$")
    public void preencho_o_campo_password() {
        userDTO = CreateAccountDataTest.setValue();
        createAccountPage.fillPasswordField(userDTO.getPassword());
    }

    @Dado("^preencho o campo firstname$")
    public void preencho_o_campo_firstname() {
        createAccountPage.fillFirstname(userDTO.getFirstname());
    }

    @Dado("^preencho o campo lastname$")
    public void preencho_o_campo_lastname() {
        createAccountPage.fillLastName(userDTO.getLastname());
    }

    @Dado("^preencho o campo company$")
    public void preencho_o_campo_company() {
        createAccountPage.fillCompany(userDTO.getCompany());
    }

    @Dado("^preencho o campo address$")
    public void preencho_o_campo_address() {
        createAccountPage.fillAddress(userDTO.getAddress());
    }

    @Dado("^seleciono o país$")
    public void seleciono_o_país() {
        createAccountPage.fillCountry(userDTO.getPaís());
    }

    @Dado("^preencho o campo state$")
    public void preencho_o_campo_state() {
        createAccountPage.fillState(userDTO.getState());
    }

    @Dado("^preencho o campo city$")
    public void preencho_o_campo_city() {
        createAccountPage.fillCity(userDTO.getCity());
    }

    @Dado("^preencho o campo zipcode$")
    public void preencho_o_campo_zipcode() {
        createAccountPage.fillZipCode(userDTO.getZipcode());
    }

    @Dado("^preencho o campo mobilenumber$")
    public void preencho_o_campo_mobilenumber() {
        createAccountPage.fillMobileNumber(userDTO.getMobileNumber());
    }

    @Quando("^clico no botão Create Account$")
    public void clico_no_botão_Create_Account() {
        createAccountPage.clickCreateAccountButton();
    }

    @Então("^a mensagem de conta criada \"([^\"]*)\" deve ser exibida$")
    public void a_mensagem_de_conta_criada_deve_ser_exibida(String value) {
        accountCreatedPage.checkAccountCreatedMessage(value);
    }

    @Então("^a mensagem congratulations \"([^\"]*)\" deve ser exibida$")
    public void a_mensagem_congratulations_deve_ser_exibida(String value) {
        accountCreatedPage.checkCongratulationsMessage(value);
    }

    @Então("^a mensagem advantage \"([^\"]*)\" deve ser exibida$")
    public void a_mensagem_advantage_deve_ser_exibida(String value) {
        accountCreatedPage.checkPrivilegesMessage(value);
    }
}
