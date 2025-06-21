package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginStepDefinitions {

    @Dado("^que estou na página de login$")
    public void que_estou_na_página_de_login() throws Exception {

    }

    @Quando("^informo um e-mail não cadastrado$")
    public void informo_um_e_mail_não_cadastrado() throws Exception {

    }

    @Quando("^informo a senha incorretamente$")
    public void informo_a_senha_incorretamente() throws Exception {

    }

    @Quando("^clico no botão Login$")
    public void clico_no_botão_Login() throws Exception {

    }

    @Então("^devo ver a mensagem de erro \"([^\"]*)\"$")
    public void devo_ver_a_mensagem_de_erro(String arg1) throws Exception {

    }
}
