package belavia;

import com.codeborne.selenide.impl.Waiter;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.belavia.BasePage;
import pages.belavia.DatePicker;
import steps.LoginStep;

import java.time.LocalDate;

public class lufthanceControleSelection extends BaseTest {

    BasePage basePage = new BasePage();
    Waiter waiter = new Waiter();
    LoginStep loginStep = new LoginStep();
    DatePicker datePicker = new DatePicker();

    @Test()
    private void HotelCheck(){
        LocalDate date = LocalDate.now();
        System.out.println(StringUtils.capitalize(date.plusDays(2).getMonth().name()));
        String checkIn = "15.10.2021";
        String checkOut = "1.11.2021";
        String a = null;

        Actions actions = new Actions(driver);
        basePage.getSelectLanguageButton().click();
        basePage.getSelectEnglishLanguage().click();

        basePage.getHotel().click();
        basePage.getHotelArrivalDate().click();
        datePicker.selectDate("October", "15");
        datePicker.selectDate("November", "1");
        basePage.getHotelLocationButton().click();
        basePage.getHotelLocation().sendKeys("Magnitogorsk (MQF), RU");
        actions.sendKeys(Keys.ENTER);



        basePage.getHotelGuestButton().click();
        basePage.getHotelGuestAdultsPlus().click();
        basePage.getHotelGuestAdultsPlus().click();
        basePage.getHotelGuestAdultsReduce().click();
        basePage.getHotelGuestChildPlus().click();
        basePage.getHotelGuestChildReduce().click();
        basePage.getHotelSearchButton().click();


        System.out.println(basePage.getCheckInDate().getText());
        //Assert.assertEquals(basePage.getCheckInDate().getText(), checkIn);
       // Assert.assertEquals(a, checkOut);
    }
}
