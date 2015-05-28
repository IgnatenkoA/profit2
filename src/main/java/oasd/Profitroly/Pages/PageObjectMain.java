package oasd.Profitroly.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.security.Key;


public class PageObjectMain {

    private WebDriver driver;

    @FindBy(linkText = "Создать меню")
    private WebElement creatrMenu;

    @FindBy(linkText = "Рецепты")
    private WebElement recipes;

    @FindBy(xpath =  "/html/body/div/div[1]/div/div/ul[1]/li[3]/a")
    private WebElement about;

    @FindBy(linkText = "Меню на день")
    private WebElement menuForDay;

    @FindBy(linkText = "Все рецепты")
    private WebElement allRecipies;

    @FindBy(name = "searchUnit")
    private WebElement search;


    public PageObjectMain(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goAbout() {
        System.out.println(driver.getTitle());
        about.click();
    }

    public void goMenu() {
        System.out.println(driver.getTitle());
        creatrMenu.click();
        menuForDay.click();
    }

    public void goResipies() {
        System.out.println(driver.getTitle());
        recipes.click();
        allRecipies.click();
    }

    public void search() {
        System.out.println(driver.getTitle());
        search.click();
        search.sendKeys("Пирожки");
       search.sendKeys(Keys.ENTER);
    }
}

