package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHomePage {

    /*
    Page object Model
    it is a concept means centralizing all the web elements locators and their actions
    so that we can reuse the locators and action on the web element to make the
    framework easy to maintain. 
     */
    WebDriver driver;

    // constructor
    public googleHomePage(WebDriver dr){

        driver = dr;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "APjFqb")
    WebElement searchBar;

    @FindBy(name = "btnK")
    WebElement searchButton;

    @FindBy(className = "YmvwI")
    WebElement allTab;

    public void enterProductName( String productName ){
        searchBar.sendKeys(productName);
    }

    public void clickingOnSearchButton(){
        searchButton.click();
    }

    public boolean isAllTabDisplayed(){

        return allTab.isDisplayed();
    }



}
