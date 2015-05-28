package oasd.Profitroly.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BreacfastSteps {

    WebDriver browser = new FirefoxDriver();
  /* WebDriver browser = new ChromeDriver();*/

    @Given("Starting from the Menu page")
    public void StartMenu() {
        WebDriver browser = new FirefoxDriver();
        browser.get("http://gioia-profiterole.rhcloud.com/menu");
    }

    @When("add Ukrainian Dishes")
    public void AddDishes() {
        PageObjectMenu pageMenu = new PageObjectMenu(browser);
        pageMenu.addDishInBreakfast();
    }

    @Then("Breakfast is complit")
    public void CreateBreakfast() throws Exception {
        String A = "Итого";
        PageObjectMenu pageMenu = new PageObjectMenu(browser);
        assertEquals(pageMenu.InTotal.getText(), A);
    }

}
