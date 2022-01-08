package com.cybertec.library.step_definitions;

import com.cybertec.library.pages.LandingPage;
import com.cybertec.library.pages.LoginPage;
import com.cybertec.library.utilities.ConfigurationReader;
import com.cybertec.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    LandingPage landingPage = new LandingPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        //  String username = ConfigurationReader.getProperty("lib60_user");
        //  String password = ConfigurationReader.getProperty("lib60_pass");

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("lib60_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("lib60_pass"));
        loginPage.singInButton.click();

    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expected = "dashboard";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains(expected));

        String actual = Driver.getDriver().getCurrentUrl();
        System.out.println("actual = " + actual);
        ;

        Assert.assertTrue(actual.contains(expected));
        Driver.closeDriver();
    }


    @When("I login as a student")
    public void iLoginAsAStudent() {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("stud24_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("stud24_pass"));
        loginPage.singInButton.click();
    }

    @Then("books should be displayed")
    public void booksShouldBeDisplayed() {

        String expected = "books";

        wait.until(ExpectedConditions.urlContains(expected));

        String actual = Driver.getDriver().getCurrentUrl();
        System.out.println("actual = " + actual);
        ;

        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();

    }

    @When("I enter username {string}")
    public void i_enter_username(String string1) {
        String username = string1;
        loginPage.usernameInput.sendKeys(username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String string2) {
        String password = string2;
        loginPage.passwordInput.sendKeys(password);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.singInButton.click();
    }

    @Then("there should be {int} users")
    public void there_should_be_users(Integer int1) {
        int expectedUserNumber = int1;
        wait.until(ExpectedConditions.visibilityOf(landingPage.userCont));
        String expected = String.valueOf(expectedUserNumber);
        String actual = landingPage.userCont.getText();

        Assert.assertEquals("Actual user number is not expected", actual, expected);
    }


}

