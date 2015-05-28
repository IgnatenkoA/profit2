package oasd.asas.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

public class MainSteps {

    WebDriver browser = new FirefoxDriver();
  /* WebDriver browser = new ChromeDriver();*/

    @Given("Starting from the Maine page")
    public void StartMain() {
        browser.get("http://gioia-profiterole.rhcloud.com/");
    }

    @When("Press about link to this page About")
    public void ForwardToAbout() {
        PageObjectMain page = new PageObjectMain(browser);
        page.goAbout();
    }

    @Then("link to this page About")
    public void ChecLincToAbout() throws Exception {
        PageObjectAbout pageAbout = new PageObjectAbout(browser);
        java.lang.String A = "О нас";
        assertEquals(pageAbout.aboute.getText(), A);
    }

    @When("Press about link to this page Recipirs")
    public void ForwardToRecipirs() {
        browser.get("http://gioia-profiterole.rhcloud.com/");
        PageObjectMain page = new PageObjectMain(browser);
        page.goResipies();
    }

    @Then("link to this page Recipirs")
    public void ForvardToRecipirs() throws Exception {
        java.lang.String A = "Рецепты";
        PageObjectRecipes pageRecipirs = new PageObjectRecipes(browser);
        assertEquals(pageRecipirs.Res.getText(), A);
        browser.close();
    }

/*    @When("Enter the search word in the search box")
    public void EnterWordAndSearch (){
        browser.get("http://gioia-profiterole.rhcloud.com/");
        PageObjectMain page = new PageObjectMain(browser);
        page.search();
    }

    @Then("Show search Results")
    public void Serching() throws Exception {
        PageObjectSearchResults SerchPage = new PageObjectSearchResults(browser);
        String A = "Пирожки с луком";
        String B = "Результат поиска:";
        *//*assertEquals(SerchPage.Pirojoks.getText(), A);*//*
        assertEquals(SerchPage.HeaderSerchRes.getText(), B);
        browser.close();
    }*/





}
   /*
   public void ForwardToAbout() throws Exception {
        WebDriver browser = new FirefoxDriver();
        browser.get("http://gioia-profiterole.rhcloud.com/");
        PageObjectMain page = new PageObjectMain(browser);
        PageObjectAbout pageAbout = new PageObjectAbout(browser);
        page.goAbout();
        String A = "О нас";
        assertEquals(pageAbout.aboute.getText(), A);
        browser.close();
    }


    public void ForvardToRecipirs() throws Exception {
        WebDriver browser = new FirefoxDriver();
        browser.get("http://gioia-profiterole.rhcloud.com/");
        PageObjectMain page = new PageObjectMain(browser);
        PageObjectRecipes pageRecipirs = new PageObjectRecipes(browser);
        page.goResipies();
        String A = "Рецепты";
        assertEquals(pageRecipirs.Res.getText(), A);
        browser.close();
    }

    public void CreateBreakfast() throws Exception {
        WebDriver browser = new FirefoxDriver();
        browser.get("http://gioia-profiterole.rhcloud.com/menu");
        PageObjectMenu pageMenu = new PageObjectMenu(browser);
        pageMenu.addDishInBreakfast();
        String A = "Итого";
        assertEquals(pageMenu.InTotal.getText(), A);
        browser.close();
    }

    public void ShowAllRecipes() throws Exception {
        WebDriver browser = new FirefoxDriver();
        browser.get("http://gioia-profiterole.rhcloud.com/allOfRecipes");
        PageObjectRecipes pageRecipies = new PageObjectRecipes(browser);
        pageRecipies.goJapanianMenu();
        assertEquals(pageRecipies.Pirojoks.getText(), A);

        browser.close();
    }

    public void Serching() throws Exception {
        WebDriver browser = new FirefoxDriver();
        browser.get("http://gioia-profiterole.rhcloud.com/");
        PageObjectMain page = new PageObjectMain(browser);
        PageObjectSearchResults SerchPage = new PageObjectSearchResults(browser);
        page.search();
        String A = "Пирожки с луком";
        String B = "Результаты поиска";
        assertEquals(SerchPage.Pirojoks.getText(), A);
        assertEquals(SerchPage.SerchRes.getText(), B);
        browser.close();
    }
}


*/