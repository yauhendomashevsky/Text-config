package belavia;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BaseMenuPage;
import pages.belavia.BasePage;
import steps.MenuStep;

public class BelaviaMenuCheckInTest extends BaseTest{
    BasePage basePage = new BasePage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void menuCheckInTest() {
        String expect = "Check-in";
        menuStep.menuCheckStep();
        Assert.assertEquals(basePage.getMenuChckin().getText(), expect);
    }
}
