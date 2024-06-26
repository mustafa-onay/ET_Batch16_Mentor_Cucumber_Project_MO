package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.ConfigurationReader;
import com.euroTech.utilities.Driver;
import com.euroTech.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
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
    @When("The user should be able to login and verifies success login with follows")
    public void the_user_should_be_able_to_login_and_verifies_success_login_with_follows(List<String> userInfo) {
        loginPage.login(userInfo.get(0), userInfo.get(1));
        String actual = dashboardPage.userName.getText();
        String expected = userInfo.get(2);
        Assert.assertEquals(expected,actual);
    }
    @When("The user should be able to login and verifies success login with following map")
    public void the_user_should_be_able_to_login_and_verifies_success_login_with_following_map(Map<String ,String > mapUserInfo) {
        loginPage.login(mapUserInfo.get("email"), mapUserInfo.get("password"));
        String actual = dashboardPage.userName.getText();
        String expected = mapUserInfo.get("username");
        Assert.assertEquals(expected,actual);
    }

    @When("The user logins with {string} and {string} using excel: {string}, {string}, {int}")
    public void the_user_logins_with_and_using_excel(String email, String password, String path, String sheet_name, int row_number) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelData(path, sheet_name);

        loginPage.login(excelData.get(row_number).get(email),excelData.get(row_number).get(password));
    }

}
