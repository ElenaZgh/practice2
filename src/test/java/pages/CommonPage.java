package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage {
    public CommonPage(){ // create constructor
        PageFactory.initElements(Driver.getDriver(),this); // will initialise all webElements
    }
    @FindBy(linkText = "About Store")
    public WebElement aboutStoreTab;
    @FindBy(linkText = "Delivery")
    public WebElement deliveryTab;


}
