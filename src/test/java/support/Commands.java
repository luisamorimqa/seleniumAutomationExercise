package support;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

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

    public static void clearAndFillField(By element, String value) {
        System.out.println("###############################################################################");
        try {
            System.out.println("*************** Preenchendo o campo " + element + " ***************");
            waitElementBeClickable(element, 5000);
            getDriver().findElement(element).clear();
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
            System.out.println("*************** Clicando no elemento " + element + " ***************");
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
            System.out.println("*************** Validando texto ***************");
            waitElementBeVisible(element, 5000);
            Assert.assertTrue(getDriver().findElement(element).isDisplayed());
            Assert.assertEquals(text, getDriver().findElement(element).getText());
            System.out.println("*************** Texto validado ***************");
        } catch(Exception exception) {
            System.out.println("*************** Ocorreu um erro ao validar texto do elemento " + element + " ***************");
            System.out.println(exception);
        }
    }

    public static void checkTextContains(By element, String text) {
        System.out.println("###############################################################################");
        try {
            System.out.println("*************** Validando texto ***************");
            waitElementBeVisible(element, 5000);
            Assert.assertTrue(getDriver().findElement(element).isDisplayed());
            Assert.assertTrue(getDriver().findElement(element).getText().contains(text));
            System.out.println("*************** Texto validado ***************");
        } catch(Exception exception) {
            System.out.println("*************** Ocorreu um erro ao validar texto do elemento " + element + " ***************");
            System.out.println(exception);
        }
    }

    public static String getNewEmail() {
        Random random = new Random();
        try {
            return "email" + String.valueOf(random.nextInt(9999)) + "@mail.com";
        } catch (Exception exception) {
            System.out.println("Não foi possível retornar um email");
            return String.valueOf(exception);
        }
    }

    public static String getRegisteredEmail() {
        Properties properties = new Properties();

        try(InputStream input = new FileInputStream("src/test/resources/credentials.properties")) {
            properties.load(input);
            return properties.getProperty("email");
        } catch (Exception exception) {
            return String.valueOf(exception);
        }
    }

    public static String getRegisteredName() {
        Properties properties = new Properties();

        try(InputStream input = new FileInputStream("src/test/resources/credentials.properties")) {
            properties.load(input);
            return properties.getProperty("firstname");
        } catch(Exception exception) {
            return String.valueOf(exception);
        }
    }

    public static String getInvalidPassword() {
        Random random = new Random();
        try {
            return String.valueOf(random.nextInt());
        } catch(Exception exception) {
            return String.valueOf(exception);
        }
    }

    public static String getValidPassword() {
        Properties properties = new Properties();

        try(InputStream input = new FileInputStream("src/test/resources/credentials.properties")) {
            properties.load(input);
            return properties.getProperty("senha");
        } catch (Exception exception) {
            return String.valueOf(exception);
        }
    }

    public static void alertAccept() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    public static void fileUpload(By element) {
        System.out.println("###############################################################################");
        System.out.println("*************** Selecionando arquivo ***************");
        WebElement uploadInput = getDriver().findElement(element);
        String patchFile = "D:\\Projetos\\SeleniumAutomationExercise\\src\\test\\resources\\envio.txt";
        uploadInput.sendKeys(patchFile);
        System.out.println("*************** Arquivo selecionado ***************");
    }

    public static void selectCombo(By element, String value) {
        System.out.println("###############################################################################");
        WebElement webElement = getDriver().findElement(element);
        Select select = new Select(webElement);
        select.selectByVisibleText(value);
    }
}