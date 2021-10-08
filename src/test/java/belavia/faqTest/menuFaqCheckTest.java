package belavia.faqTest;

import belavia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BaseMenuPage;
import steps.MenuStep;

public class menuFaqCheckTest extends BaseTest {
    BaseMenuPage baseMenuPage = new BaseMenuPage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void menuFaqTestCheck() {
        String expect = "Unfortunately, the tickets issued by another booking system are not displayed on our site.";
        menuStep.menuFAQstep();
        baseMenuPage.getCanNotCheck().click();
        Assert.assertEquals(baseMenuPage.getCanNotCheckAnswer().getText(), expect);
    }

}
