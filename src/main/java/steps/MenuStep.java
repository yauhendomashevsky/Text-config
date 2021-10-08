package steps;

import pages.belavia.BasePage;

public class MenuStep {

    BasePage basePage = new BasePage();

    public void menuClickOffers() {
        basePage.getMainMenuSelected().click();
        basePage.getMenuOffers().click();
    }

    public void menuArrivaAndDepartureStep() {
        basePage.getMainMenuSelected().click();
        basePage.getMenuArrivalAndDeparture().click();
    }

    public void menuFAQstep() {
        basePage.getMainMenuSelected().click();
        basePage.getMenuFAQ().click();
    }

    public void menuCheckStep() {
        basePage.getMainMenuSelected().click();
        basePage.getMenuInformationCheck().click();
    }
}
