package belavia.faqTest;

import belavia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BaseMenuPage;
import steps.MenuStep;

public class menuFaqVisaTest extends BaseTest {
    BaseMenuPage baseMenuPage = new BaseMenuPage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void menuFaqTestVisa() {
        String expect = "According to the information, obtained from National airport Minsk border guard service:";
        menuStep.menuFAQstep();
        baseMenuPage.getIsTheTransitVisaNeeded().click();
        Assert.assertEquals(baseMenuPage.getIsTheTransitVisaNeededAnswer().getText(), expect);
    }

}
