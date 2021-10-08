package belavia;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.belavia.BasePage;
import pages.belavia.DatePickerFlight;

public class BookFlightsTest extends BaseTest{
    DatePickerFlight datePickerFlight = new DatePickerFlight();
    BasePage basePage = new BasePage();

    @Test
    public void flightWay() {
        String newTitle = "BELAVIA - Belarusian Airlines - Shopping";
        basePage.getFromBookFlightButton().click();
        basePage.getFromBookFlight().sendKeys("Minsk (MSQ), BY");
        basePage.getToBookFlightArea().sendKeys("Sochi (AER), Russian Federation");
        basePage.getFlightCalendar().click();
        datePickerFlight.selectDate("October", "14");
        datePickerFlight.selectDate("November", "15");
        basePage.getAdultButton().click();
        basePage.getAdultsPlus().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        basePage.getFiendFlight().click();
        Assert.assertEquals(driver.getTitle(), newTitle);
    }
}
