package belavia;

import com.codeborne.selenide.impl.Waiter;
import com.google.gson.annotations.Until;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BasePage;
import steps.MenuStep;

public class BelaviaMenuOffersTest extends BaseTest{
    BasePage basePage = new BasePage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void pathDirection() {
        String expectString = "Tashkent";
        menuStep.menuClickOffers();
        basePage.getMenuOffersTashkent().click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(basePage.getMinsTashkentRoute().getText(), expectString);
    }
}
