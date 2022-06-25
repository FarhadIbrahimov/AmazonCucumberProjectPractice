package StepDefinitions;

import Pages.AmazonMainPage;
import Pages.AmazonSecondPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.PropertiesReader;

public class AmazonMainPageSteps {
    WebDriver driver = Driver.getDriver();
    AmazonMainPage amazonMainPage = new AmazonMainPage();
    AmazonSecondPage amazonSecondPage = new AmazonSecondPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("the user navigates to amazon web page")
    public void the_user_navigates_to_www_amazon_com() {

        driver.navigate().to(PropertiesReader.URL.getProperty("amazon"));

    }

    @When("user types {string} in  amazon search box")
    public void userTypesInAmazonSearchBox(String string) {
        amazonMainPage.searchBox.sendKeys(string);
    }

    @And("user clicks on search Button")
    public void userClicksOnSearchButton() {
        amazonMainPage.searchButton.click();
    }

    @And("user navigates to the second page")
    public void navigates_to_the_second_page() {
        amazonMainPage.nextButton.click();
    }

    @And("user selects the {int} item")
    public void selects_the_item(int int1) {
        amazonSecondPage.items.get(int1 - 1).click();
    }

    @Then("user will see {string} button and able to add it to cart")
    public void the_user_would_be_able_to_see_message(String str) {


        try {
            amazonSecondPage.closeButton.click();
            amazonSecondPage.NoThanksButton.click();
        } catch (Exception e) {


                System.out.println("No pop-ups for this item");
            }

        amazonSecondPage.addToCart.click();
            Assert.assertEquals(str, amazonSecondPage.addToCart.getText());
        }
    }








