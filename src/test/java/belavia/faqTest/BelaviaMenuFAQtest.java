package belavia.faqTest;

import belavia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BaseMenuPage;

import steps.MenuStep;

public class BelaviaMenuFAQtest extends BaseTest {
    BaseMenuPage baseMenuPage = new BaseMenuPage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void menuFaqTest() {
        String expect = "This information is confidential, you can only get it by the official request of the Ministry of Internal Affairs. ";
        menuStep.menuFAQstep();
        baseMenuPage.getCanBelaviaProvideInformation().click();
        Assert.assertEquals(baseMenuPage.getCanBelaviaProvideInformationAnswer().getText(), expect);
    }
}

