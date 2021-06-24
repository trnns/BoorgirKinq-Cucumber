package com.automation.library.step_definitions;

import com.automation.library.utilities.ConfigurationReader;
import com.automation.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {



    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        System.out.println("Going to BK home page");
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("I click the menu button")
    public void i_click_the_menu_button() {


    }

    @Then("menu page should be displayed")
    public void menu_page_should_be_displayed() {

    }

}
