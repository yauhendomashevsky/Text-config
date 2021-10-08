package belavia.faqTest;

import belavia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BaseMenuPage;
import steps.MenuStep;

public class menuFaqDeterminesTest extends BaseTest {
    BaseMenuPage baseMenuPage = new BaseMenuPage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void menuFaqTestDetermines() {
        String expect = "The price of tickets depends on their availability on a specific date.";
        menuStep.menuFAQstep();
        baseMenuPage.getWhatDeterminesThePriceOfTicket().click();
        Assert. assertEquals(baseMenuPage.getWhatDeterminesThePriceOfTicketAnswer().getText(), expect);
    }
}
