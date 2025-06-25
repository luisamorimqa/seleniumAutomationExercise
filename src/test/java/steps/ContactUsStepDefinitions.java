package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactUsPage;
import pages.HomePage;
import pages.LoginPage;

import static runner.RunBase.getDriver;
import static support.Commands.*;

public class ContactUsStepDefinitions {

    Faker faker = new Faker();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ContactUsPage contactusPage = new ContactUsPage();

    @Dado("^que eu esteja na tela Contact us$")
    public void que_eu_esteja_na_tela_Contact_us() {
        loginPage.getPage();
        loginPage.fillLoginEmailAddressField(getRegisteredEmail());
        loginPage.fillLoginPasswordField(getValidPassword());
        loginPage.clickLoginButton();
        homePage.clickContactUsButton();
    }

    @Dado("^preencho o campo nome$")
    public void preencho_o_campo_nome() {
        contactusPage.checkContactUsPage();
        contactusPage.fillName(faker.name().fullName());
    }

    @Dado("^preencho o campo email$")
    public void preencho_o_campo_email() {
        contactusPage.fillEmail(faker.internet().emailAddress());
    }

    @Dado("^preencho o campo subject$")
    public void preencho_o_campo_subject() {
        contactusPage.fillSubject(faker.pokemon().name());
    }

    @Dado("^preencho o campo message$")
    public void preencho_o_campo_message() {
        contactusPage.fillMessage(faker.harryPotter().book());
    }

    @Dado("^seleciono o arquivo$")
    public void seleciono_o_arquivo() {
        contactusPage.selectFile();
    }

    @Quando("^clico no botão submit$")
    public void clico_no_botão_submit() {
        contactusPage.clickSubmitButton();
    }

    @Quando("^confirmo o alerta$")
    public void confirmo_o_alerta() {
        alertAccept();
    }

    @Então("^a mensagem de sucesso \"([^\"]*)\" deve ser exibida$")
    public void a_mensagem_de_sucesso_deve_ser_exibida(String value) {
        contactusPage.checkSuccessfulMessage(value);
    }
}