package belavia.belaviaOffersTests;

import belavia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BelaviaMenuOffersPage;
import steps.MenuStep;

public class OffersKutaisiTest extends BaseTest {
    BelaviaMenuOffersPage bmop = new BelaviaMenuOffersPage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void offerKutaisiTest() {
        String expect = "Kutaisi";
        menuStep.menuClickOffers();
        bmop.getOffersKutaisi().click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(bmop.getConfirmCity().getText(), expect);
    }
}
