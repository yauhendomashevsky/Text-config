package belavia.faqTest;

import belavia.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BaseMenuPage;
import steps.MenuStep;

public class menuFaqAnimalsTest extends BaseTest {
    BaseMenuPage baseMenuPage = new BaseMenuPage();
    MenuStep menuStep = new MenuStep();

    @Test
    private void menuFaqTestAnimals() {
        String expect = "Some rules are prescribed for carriage of animals:";
        menuStep.menuFAQstep();
        baseMenuPage.getConditionsOfAnimalCarriage().click();
        Assert.assertEquals(baseMenuPage.getConditionsOfAnimalCarriageAnswer().getText(), expect);
    }

}
