package oasd.Profitroly.Pages;

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectMenu {

    WebDriver driver;

    @FindBy(xpath = "//button[@value='#breakfast']")
    private WebElement Breakfast;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[1]")
    private WebElement Ukrainian;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[2]/div/div[1]/div[1]")
    private WebElement MyBreakfast;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[22]/div[3]/label")
    private WebElement Sandwich;

    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[2]/button")
    private WebElement BattonWin;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/h4")
    public WebElement InTotal;


    public PageObjectMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void addDishInBreakfast (){
        System.out.println(driver.getTitle());
        Breakfast.click();
        Ukrainian.click();
        // добавить ожидание?
        Actions dragAndDrop = new Actions(driver);
        Action action = dragAndDrop.dragAndDrop(Sandwich, MyBreakfast).build();
        dragAndDrop.perform();
        BattonWin.click();
    }
    }