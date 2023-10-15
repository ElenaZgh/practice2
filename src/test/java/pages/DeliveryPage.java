package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeliveryPage {

  public DeliveryPage(){
      PageFactory.initElements(Driver.getDriver(), this);
  }
  @FindBy(xpath = "//h6[text() = 'Pickup from the warehouse']")
  public WebElement pickupFromWarehouse;
 }
