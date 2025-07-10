package pages;

import org.openqa.selenium.By;

import static support.Commands.checkText;
import static support.Commands.checkVisibility;

public class TestCasePage extends BasePage {

    public void checkTestCasePage() {
        checkVisibility(By.xpath("//*[@id='form']/div/div[1]/div/h2/b"), 10);
        checkText(By.xpath("//*[@id='form']/div/div[1]/div/h2/b"), "TEST CASES");
        checkVisibility(By.xpath("//*[@id='form']/div/div[2]/h5/span"), 10);
        checkText(By.xpath("//*[@id='form']/div/div[2]/h5/span"), "Below is the list " +
                "of test Cases for you to practice the Automation. " +
                "Click on the scenario for detailed Test Steps:");
    }
}
