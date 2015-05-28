package oasd.Profitroly.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectAbout {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div/h2")
    public WebElement aboute;



    public PageObjectAbout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
