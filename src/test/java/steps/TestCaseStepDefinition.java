package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import pages.TestCasePage;

public class TestCaseStepDefinition {

    HomePage homePage = new HomePage();
    TestCasePage testCasePage = new TestCasePage();

    @Quando("^clico no botão Test Cases$")
    public void clico_no_botão_Test_Cases() throws Exception {
        homePage.clickTestCaseButton();
    }

    @Então("^devo ser redirecionado para a página de Test Case$")
    public void devo_ser_redirecionado_para_a_página_de_Test_Case() throws Exception {
        testCasePage.checkTestCasePage();
    }
}
