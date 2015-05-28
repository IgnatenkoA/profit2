package oasd.Profitroly.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectSearchResults {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/h2")
    public WebElement HeaderSerchRes;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/p")
    public WebElement Pirojoks;

    public PageObjectSearchResults(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
