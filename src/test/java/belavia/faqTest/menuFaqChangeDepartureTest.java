package belavia.faqTest;

import belavia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BaseMenuPage;
import steps.MenuStep;

public class menuFaqChangeDepartureTest extends BaseTest {
    BaseMenuPage baseMenuPage = new BaseMenuPage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void menuFaqTestChangeDeparture() {
        String expect = "To change the date of departure, you must open \"Ticket change via the Internet\". Read the terms of change of tickets via the Internet , complete the application form and send to the e-mail address specified . Your request will be processed within an hour, after which you will receive an invoice for payment. After receipt of payment the new ticket will be issued for you and directed to your e-mail.";
        menuStep.menuFAQstep();
        baseMenuPage.getHowToChangeTheDepartureDate().click();
        Assert.assertEquals(baseMenuPage.getHowToChangeTheDepartureDateAnswer().getText(), expect);
    }

}
