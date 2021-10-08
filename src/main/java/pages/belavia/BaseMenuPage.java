package pages.belavia;

import com.codeborne.selenide.impl.Waiter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import services.DriverProvider;

public class BaseMenuPage{

    public BaseMenuPage () {
        PageFactory.initElements(DriverProvider.getDriverProvider().getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Can Belavia provide information about the presence of the passenger on the flight?')]")
    private WebElement canBelaviaProvideInformation;

    @FindBy(xpath = "//a[contains(text(),'Can not buy a ticket for child on a site')]")
    private WebElement canNotBuyTicket;

    @FindBy(xpath = "//a[contains(text(),'Can not check the status of reservations on Belavia site')]")
    private WebElement canNotCheck;

    @FindBy(xpath = "//a[contains(text(),'Conditions of animals carriage.')]")
    private WebElement conditionsOfAnimalCarriage;

    @FindBy(xpath = "//a[contains(text(),'How to change the departure date?')]")
    private WebElement howToChangeTheDepartureDate;

    @FindBy(xpath = "//a[contains(text(),'Is the transit visa needed?')]")
    private WebElement isTheTransitVisaNeeded;

    @FindBy(xpath = "//a[contains(text(),'Request on an invoice for a ticket purchased on the site')]")
    private WebElement requestOnAnInvoiceForTicket;

    @FindBy(xpath = "//a[contains(text(),'What determines the price of tickets?')]")
    private WebElement whatDeterminesThePriceOfTicket;

    @FindBy(xpath = "//div[@class='accordion-pane active']/div/p")
    private WebElement canBelaviaProvideInformationAnswer;

    @FindBy(xpath = "//p[contains(text(), 'Children’s ticket issuance on the site is possible only in the same booking with an adult passenger.')]")
    private WebElement canNotBuyTicketAnswer;

    @FindBy(xpath = "//p[contains(text(), 'Unfortunately, the tickets issued by another booking system are not displayed on our site.')]")
    private WebElement canNotCheckAnswer;

    @FindBy(xpath = "//p[contains(text(), 'Some')]")
    private WebElement conditionsOfAnimalCarriageAnswer;

    @FindBy(xpath = "//p[contains(text(), 'To change the date of departure, you must open ')]")
    private WebElement howToChangeTheDepartureDateAnswer;

    @FindBy(xpath = "//p[contains(text(), 'According to the information, obtained from National airport Minsk border guard service:')]")
    private WebElement isTheTransitVisaNeededAnswer;

    @FindBy(xpath = "//li[contains(text(), ' Itinerary receipt.')]")
    private WebElement requestOnAnInvoiceForTicketAnswer;

    @FindBy(xpath = "//p[contains(text(), 'The price of tickets depends on their availability on a specific date.')]")
    private WebElement whatDeterminesThePriceOfTicketAnswer;

    public WebElement getCanBelaviaProvideInformationAnswer() {
        return canBelaviaProvideInformationAnswer;
    }

    public WebElement getCanNotBuyTicketAnswer() {
        return canNotBuyTicketAnswer;
    }

    public WebElement getCanNotCheckAnswer() {
        return canNotCheckAnswer;
    }

    public WebElement getConditionsOfAnimalCarriageAnswer() {
        return conditionsOfAnimalCarriageAnswer;
    }

    public WebElement getHowToChangeTheDepartureDateAnswer() {
        return howToChangeTheDepartureDateAnswer;
    }

    public WebElement getIsTheTransitVisaNeededAnswer() {
        return isTheTransitVisaNeededAnswer;
    }

    public WebElement getRequestOnAnInvoiceForTicketAnswer() {
        return requestOnAnInvoiceForTicketAnswer;
    }

    public WebElement getWhatDeterminesThePriceOfTicketAnswer() {
        return whatDeterminesThePriceOfTicketAnswer;
    }

    public WebElement getCanBelaviaProvideInformation() {
        return canBelaviaProvideInformation;
    }

    public WebElement getCanNotBuyTicket() {
        return canNotBuyTicket;
    }

    public WebElement getCanNotCheck() {
        return canNotCheck;
    }

    public WebElement getConditionsOfAnimalCarriage() {
        return conditionsOfAnimalCarriage;
    }

    public WebElement getHowToChangeTheDepartureDate() {
        return howToChangeTheDepartureDate;
    }

    public WebElement getIsTheTransitVisaNeeded() {
        return isTheTransitVisaNeeded;
    }

    public WebElement getRequestOnAnInvoiceForTicket() {
        return requestOnAnInvoiceForTicket;
    }

    public WebElement getWhatDeterminesThePriceOfTicket() {
        return whatDeterminesThePriceOfTicket;
    }
}
