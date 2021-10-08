package belavia.faqTest;

import belavia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BaseMenuPage;
import steps.MenuStep;

public class menuFaqRequestTest extends BaseTest {
    BaseMenuPage baseMenuPage = new BaseMenuPage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void menuFaqTestRequest() {
        String expect = "Itinerary receipt.";
        menuStep.menuFAQstep();
        baseMenuPage.getRequestOnAnInvoiceForTicket().click();
        Assert.assertEquals(baseMenuPage.getRequestOnAnInvoiceForTicketAnswer().getText(),expect);
    }
}
