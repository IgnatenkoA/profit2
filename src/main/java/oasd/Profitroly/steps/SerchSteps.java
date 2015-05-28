package oasd.Profitroly.steps;

import oasd.Profitroly.Pages.PageObjectSearchResults;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;



public class SerchSteps {
    WebDriver browser = new FirefoxDriver();
  /* WebDriver browser = new ChromeDriver();*/


    @Given("Starting from the Maine page")
    public void StartMain() {
        browser.get("http://gioia-profiterole.rhcloud.com/");
    }

    @When("Enter the search word in the search box")
    public void EnterWordAndSearch (){
        browser.get("http://gioia-profiterole.rhcloud.com/");
        PageObjectMain page = new PageObjectMain(browser);
        page.search();
    }

    @Then("Show search Results")
    public void Serching() throws Exception {
        PageObjectSearchResults SerchPage = new PageObjectSearchResults(browser);
        String B = "Результат поиска:";
        assertEquals(SerchPage.HeaderSerchRes.getText(), B);
        browser.close();
    }
}
