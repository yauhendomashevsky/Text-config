package pages.belavia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import services.DriverProvider;

import java.util.List;

public class DatePickerFlight {
    private static final String TABLE_LOCATOR = "//div[contains(@class, 'ui-datepicker-group') and .//span[contains(text(),'%s')]]";
    private static final String DATE_LOCATOR = ".//a[text() = '%s']";

    public void selectDate(String month, String date) {
        WebElement visibleTable = null;
        WebDriver driver = DriverProvider.getDriverProvider().getDriver();
        List<WebElement> elements = driver.findElements(By.xpath(String.format(TABLE_LOCATOR,month)));
        for (WebElement element: elements) {
            if (element.isDisplayed()){
                visibleTable = element;
            }
        }
        if (visibleTable != null) {
            WebElement visibleDate = visibleTable.findElement(By.xpath(String.format(DATE_LOCATOR, date)));
            visibleDate.click();
        }
    }
}
