package com.euroTech.step_definitions;

import com.euroTech.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class DashboardStepDefs {
    DashboardPage dashboardPage = new DashboardPage();

    @And("The user should be able to see {string} on the dashboard")
    public void the_user_should_be_able_to_see_on_the_dashboard(String expectedUsername) {
        String actualUsername = dashboardPage.userName.getText();
        Assert.assertEquals("Both username should be same.",expectedUsername,actualUsername);
    }
    @Then("The username should have {int} characters")
    public void the_username_should_have_characters(int expectedNumberOfChar) {
        String actualUsername = dashboardPage.userName.getText();
        int actual = actualUsername.length();
        Assert.assertEquals(expectedNumberOfChar,actual);
    }
    @When("The user navigates to tab {string} and module {string}")
    public void the_user_navigates_to_tab_and_module(String tab, String module) {
        dashboardPage.navigateTabsAndModules(tab, module);
    }
}
