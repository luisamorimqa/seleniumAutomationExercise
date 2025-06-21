package support;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

public class Commands extends RunCucumber {

    public static void waitElementBeClickable(By element, Integer time) {
        WebDriverWait wait = new WebDriverWait(getDriver(), time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitElementBeVisible(By element, Integer time) {
        WebDriverWait wait = new WebDriverWait(getDriver(), time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void checkVisibility(By element, Integer time) {
        WebDriverWait wait = new WebDriverWait(getDriver(), time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));

        Assert.assertTrue(getDriver().findElement(element).isDisplayed());
    }

    public static void fillField(By element, String value) {
        System.out.println("###############################################################################");
        try {
            System.out.println("*************** Preenchendo o campo " + element + " ***************");
            waitElementBeClickable(element, 5000);
            getDriver().findElement(element).sendKeys(value);
            System.out.println("*************** Campo preenchido ***************");
        } catch(Exception exception) {
            System.out.println("*************** Ocorreu um erro ao preencher o elemento " + element + " ***************");
            System.out.println(exception);
        }
    }

    public static void clickElement(By element) {
        System.out.println("###############################################################################");
        try {
            waitElementBeClickable(element, 5000);
            getDriver().findElement(element).click();
            System.out.println("*************** Clique realizado ***************");
        } catch(Exception exception) {
            System.out.println("*************** Ocorreu um erro ao clicar no elemento " + element + " ***************");
            System.out.println(exception);
        }
    }

    public static void checkText(By element, String text) {
        System.out.println("###############################################################################");
        try {
            waitElementBeVisible(element, 5000);
            Assert.assertTrue(getDriver().findElement(element).isDisplayed());
            Assert.assertEquals(text, getDriver().findElement(element).getText());
        } catch(Exception exception) {
            System.out.println("*************** Ocorreu um erro ao validar texto do elemento " + element + " ***************");
            System.out.println(exception);
        }
    }

    public static void checkContainsText(By element, String text) {
        System.out.println("###############################################################################");
        try {
            waitElementBeVisible(element, 5000);
            Assert.assertTrue(getDriver().findElement(element).isDisplayed());
            Assert.assertTrue(getDriver().findElement(element).getText().contains(text));
        } catch(Exception exception) {
            System.out.println("*************** Ocorreu um erro ao validar texto do elemento " + element + " ***************");
            System.out.println(exception);
        }
    }
}