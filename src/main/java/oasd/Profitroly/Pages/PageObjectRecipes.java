package oasd.Profitroly.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectRecipes {

    WebDriver driver;

    @FindBy(linkText = "Рецепты")
    public WebElement Res;

    @FindBy(xpath = "//*[@id='cuisine']/div[contains(.,'Японская')]")
    private WebElement Japanian;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/a")
    private WebElement Snacks;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div[3]")
    public WebElement Pirojoks;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[2]/div[4]/div[1]/h3")
    public WebElement HeaderPirojoks;

    public PageObjectRecipes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void goJapanianMenu() {
        System.out.println(driver.getTitle());
        Japanian.click();
        Snacks.click();
        Pirojoks.click();
    }

}
