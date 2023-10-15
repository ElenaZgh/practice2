package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.AboutStorePage;
import pages.CommonPage;
import pages.DeliveryPage;
import utilities.Driver;

public class VerifyTabsTests {
    WebDriver driver;

    @Test
    public void verifyAboutAndDeliveryTabs(){

        driver = Driver.getDriver();
        driver.get("https://gadgetarium.us/");

        CommonPage commonPage= new CommonPage();
        AboutStorePage aboutStorePage = new AboutStorePage();
        DeliveryPage deliveryPage = new DeliveryPage();

        commonPage.aboutStoreTab.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("about"));
        Assert.assertEquals(aboutStorePage.shopGadgetarium.getText(),"Shop Gadgetarium");


        commonPage.deliveryTab.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("delivery"));
        Assert.assertEquals(deliveryPage.pickupFromWarehouse.getText(),"Pickup from the warehouse");

    }
}
