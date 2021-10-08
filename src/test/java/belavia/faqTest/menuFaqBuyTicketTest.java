package belavia.faqTest;

import belavia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BaseMenuPage;
import steps.MenuStep;

public class menuFaqBuyTicketTest extends BaseTest {
    BaseMenuPage baseMenuPage = new BaseMenuPage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void menuFaqTestBuyTicket() {
        String expect = "Children’s ticket issuance on the site is possible only in the same booking with an adult passenger.";
        menuStep.menuFAQstep();
        baseMenuPage.getCanNotBuyTicket().click();
        Assert.assertEquals(baseMenuPage.getCanNotBuyTicketAnswer().getText(),expect);
    }

}
