package pages.belavia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import services.DriverProvider;

public class BasePage {


    public BasePage() {
        PageFactory.initElements(DriverProvider.getDriverProvider().getDriver(),this );
    }

    @FindBy(xpath = "//label[@for='OriginLocation_h_Combobox']")
    private WebElement hotelLocationButton;

    @FindBy(xpath = "//input[@data-rel='OriginLocation_h']")
    private WebElement hotelLocation;

    @FindBy(xpath = "//div[@id='Passengers_h']/a/i[@class='icon-down-open']")
    private WebElement hotelGuestButton;

    @FindBy(xpath = "//span[contains(text(),'from 18 years')]/../following-sibling::a/i")
    private WebElement hotelGuestAdultsPlus;

    @FindBy(xpath = "//span[contains(text(),'from 18 years')]/../preceding-sibling::a/i")
    private WebElement hotelGuestAdultsReduce;

    @FindBy(xpath = "//span[contains(text(),'0-17 years')]/../following-sibling::a/i")
    private WebElement hotelGuestChildPlus;

    @FindBy(xpath = "//span[contains(text(),'0-17 years')]/../preceding-sibling::a/i")
    private WebElement hotelGuestChildReduce;

    @FindBy(xpath = "//button[@id='hotelButton']")
    private WebElement hotelSearchButton;

    @FindBy(xpath = "//li/a[@href='#ibe']")
    private WebElement byTickets;

    @FindBy(xpath = "//li/a[@href='#wci']")
    private WebElement registrationOnBoard;

    @FindBy(xpath = "//li/a[@href='#trip-case']")
    private WebElement bookingStatus;

    @FindBy(xpath = "//li/a[@href='#hotel']")
    private WebElement Hotel;

    @FindBy(xpath = "//label[@for='DepartureDate_h_Datepicker']/../a")
    private WebElement hotelArrivalDate;

    @FindBy(xpath = "//label[@for='ReturnDate_h_Datepicker']/../a")
    private WebElement hotelDepartureDate;

    @FindBy(xpath = "//button[@id='cm-acceptAll']")
    private WebElement privacySettingAgreeButton;

    @FindBy(xpath = "//a[@id='select-lang']")
    private WebElement selectLanguageButton;

    @FindBy(xpath = "//a[@data-iso='EN']")
    private WebElement selectEnglishLanguage;

    @FindBy(xpath = "//label[@for='DepartureDate_h_Datepicker']/..")
    private WebElement checkInDate;

    @FindBy(xpath = "//label[@for='ReturnDate_h_Datepicker']/..")
    private WebElement checkOutDate;

    @FindBy(xpath = "//label[@for='OriginLocation_Combobox']")
    private WebElement fromBookFlightButton;

    @FindBy(xpath = "//input[@data-rel='OriginLocation']")
    private WebElement fromBookFlight;

    @FindBy(xpath = "//input[@data-rel='DestinationLocation']")
    private WebElement toBookFlightArea;

    @FindBy(xpath = "//input[@data-rel='DestinationLocation']/../label")
    private WebElement toBookFlight;

    @FindBy(xpath = "//input[@id='JourneySpan_Ow']")
    private WebElement oneWaySpan;

    @FindBy(xpath = "//div[@id='step-2']/div[4]/div/button")
    private WebElement fiendFlight;

    @FindBy(xpath = "//label[contains(text(),'Departure date')]/../a")
    private WebElement flightCalendar;

    @FindBy(xpath = "//a[@id='ui-id-1']")
    private WebElement adultButton;

    @FindBy(xpath = "//span[contains(text(),'Adults')]/../../a/i[@class='icon-plus'][1]")
    private WebElement adultsPlus;

    @FindBy(xpath = "//a[@id='select-main-menu']")
    private WebElement mainMenuSelected;

    @FindBy(xpath = "//a[contains(text(),'Book flights')]")
    private WebElement menuBookFlight;

    @FindBy(xpath = "//a[contains(text(),'Offices and ticket offices')]")
    private WebElement menuOfficesAndTicketOffices;

    @FindBy(xpath = "//a[contains(text(),'Offers')]")
    private WebElement menuOffers;

    @FindBy(xpath = "//a[contains(text(),'Information and services ')]/../ul/li/a[contains(text(),'Timetable')]")
    private WebElement menuTimetable;

    @FindBy(xpath = "//a[contains(text(),'Arrival and departure')]")
    private WebElement menuArrivalAndDeparture;

    @FindBy(xpath = "//a[contains(text(),'Information and services ')]/../ul/li/a[contains(text(),'FAQ')]")
    private WebElement menuFAQ;

    @FindBy(xpath = "//a[contains(text(),'Information and services ')]/../ul/li/a[contains(text(),'Check-in')]")
    private WebElement menuInformationCheck;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=KZN&JourneySpan=Rt&lang=en']")
    private WebElement menuOffersKazan;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=TAS&JourneySpan=Rt&lang=en']")
    private WebElement menuOffersTashkent;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=AER&JourneySpan=Rt&lang=en']")
    private WebElement menuOffersSochi;

    @FindBy(xpath = "//div[@class='route']/span[contains(text(), 'Tashkent')]")
    private WebElement minsTashkentRoute;

    @FindBy(xpath = "//span[contains(text(),'Check-in')]")
    private WebElement menuChckin;

    public WebElement getMenuChckin() {
        return menuChckin;
    }

    public WebElement getMinsTashkentRoute() {
        return minsTashkentRoute;
    }

    public WebElement getMenuOffersKazan() {
        return menuOffersKazan;
    }

    public WebElement getMenuOffersTashkent() {
        return menuOffersTashkent;
    }

    public WebElement getMenuOffersSochi() {
        return menuOffersSochi;
    }

    public WebElement getMainMenuSelected() {
        return mainMenuSelected;
    }

    public WebElement getMenuBookFlight() {
        return menuBookFlight;
    }

    public WebElement getMenuOfficesAndTicketOffices() {
        return menuOfficesAndTicketOffices;
    }

    public WebElement getMenuOffers() {
        return menuOffers;
    }

    public WebElement getMenuTimetable() {
        return menuTimetable;
    }

    public WebElement getMenuArrivalAndDeparture() {
        return menuArrivalAndDeparture;
    }

    public WebElement getMenuFAQ() {
        return menuFAQ;
    }

    public WebElement getMenuInformationCheck() {
        return menuInformationCheck;
    }

    public WebElement getHotelLocationButton() {
        return hotelLocationButton;
    }

    public WebElement getHotelLocation() {
        return hotelLocation;
    }

    public WebElement getHotelGuestButton() {
        return hotelGuestButton;
    }

    public WebElement getHotelGuestAdultsPlus() {
        return hotelGuestAdultsPlus;
    }

    public WebElement getHotelGuestAdultsReduce() {
        return hotelGuestAdultsReduce;
    }

    public WebElement getHotelGuestChildPlus() {
        return hotelGuestChildPlus;
    }

    public WebElement getHotelGuestChildReduce() {
        return hotelGuestChildReduce;
    }

    public WebElement getHotelSearchButton() {
        return hotelSearchButton;
    }

    public WebElement getAdultButton() {
        return adultButton;
    }

    public WebElement getAdultsPlus() {
        return adultsPlus;
    }

    public WebElement getFlightCalendar() {
        return flightCalendar;
    }

    public WebElement getFromBookFlight() {
        return fromBookFlight;
    }

    public WebElement getToBookFlightArea() {
        return toBookFlightArea;
    }

    public WebElement getFromBookFlightButton() {
        return fromBookFlightButton;
    }

    public WebElement getToBookFlight() {
        return toBookFlight;
    }

    public WebElement getOneWaySpan() {
        return oneWaySpan;
    }

    public WebElement getFiendFlight() {
        return fiendFlight;
    }

    public WebElement getCheckInDate() {
        return checkInDate;
    }

    public WebElement getCheckOutDate() {
        return checkOutDate;
    }

    public WebElement getPrivacySettingAgreeButton() {
        return privacySettingAgreeButton;
    }

    public WebElement getByTickets() {
        return byTickets;
    }

    public WebElement getRegistrationOnBoard() {
        return registrationOnBoard;
    }

    public WebElement getBookingStatus() {
        return bookingStatus;
    }

    public WebElement getHotel() {
        return Hotel;
    }

    public WebElement getHotelArrivalDate() {
        return hotelArrivalDate;
    }

    public WebElement getHotelDepartureDate() {
        return hotelDepartureDate;
    }

    public WebElement getSelectLanguageButton() {
        return selectLanguageButton;
    }

    public WebElement getSelectEnglishLanguage() {
        return selectEnglishLanguage;
    }
}
