package belavia.belaviaOffersTests;

import belavia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BelaviaMenuOffersPage;
import steps.MenuStep;

public class OffersTestTbilisi extends BaseTest {
    BelaviaMenuOffersPage bmop = new BelaviaMenuOffersPage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void offerTbilisiTest() {
        String expect = "Tbilisi";
        menuStep.menuClickOffers();
        bmop.getOffersTbilisi().click();
        Assert.assertEquals(bmop.getConfirmCity().getText(), expect);
    }
}
