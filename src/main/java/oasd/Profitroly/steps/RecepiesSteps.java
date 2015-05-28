package oasd.Profitroly.steps;


import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RecepiesSteps {

    WebDriver browser = new FirefoxDriver();
  /* WebDriver browser = new ChromeDriver();*/

    @Given("Starting from the page Recipes")
    public void StartRecipies () {
        WebDriver browser = new FirefoxDriver();
        browser.get("http://gioia-profiterole.rhcloud.com/allOfRecipes");
    }

    @When("open Japan cuisine and clic Pirojoks")
    public void OpenJapanCuisine () {
        PageObjectRecipes pageRecipies = new PageObjectRecipes(browser);
        pageRecipies.goJapanianMenu();
    }

    @Then("Show Pirojoks Recipe")
    public void ShowAllRecipes() throws Exception {
        PageObjectRecipes pageRecipies = new PageObjectRecipes(browser);
        String A = "Пирожки с луком";
        assertEquals(pageRecipies.HeaderPirojoks.getText(), A);
    }
}
