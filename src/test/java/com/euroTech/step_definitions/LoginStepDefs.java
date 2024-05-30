package com.euroTech.step_definitions;

import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.ConfigurationReader;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
        @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
      //  System.out.println("basarili bir sekilde siteye giris yapildi");
        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("The user enters valid credentials for Selim")
    public void the_user_enters_valid_credentials_for_selim() {
        //System.out.println("Mustafa bilgilerini girdi");
        loginPage.login();
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
       // System.out.println("basarili bir sekilde siteye giris yapildi");
        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals("https://www.krafttechexlab.com/index",currentUrl);
    }
    @When("The user enters valid credentials for Rosa")
    public void the_user_enters_valid_credentials_for_rosa() {
        System.out.println("Rosa bilgilerini girdi");
    }
    @When("The user enters valid credentials for Mike")
    public void the_user_enters_valid_credentials_for_mike() {
        System.out.println("Mike bilgilerini girdi");
    }
    @When("The user enters valid credentials email: {string} and password: {string}")
    public void the_user_enters_valid_credentials_email_and_password(String email, String password) {
        loginPage.login(email,password);
    }
}
