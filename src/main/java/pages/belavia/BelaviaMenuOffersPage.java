package pages.belavia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import services.DriverProvider;

public class BelaviaMenuOffersPage {

    public BelaviaMenuOffersPage() {
        PageFactory.initElements(DriverProvider.getDriverProvider().getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=KZN&JourneySpan=Rt&lang=en']")
    private WebElement offersKazan;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=KUF&JourneySpan=Rt&lang=en']")
    private WebElement offersSamara;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=TBS&JourneySpan=Rt&lang=en']")
    private WebElement offersTbilisi;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=KUT&JourneySpan=Rt&lang=en']")
    private WebElement offersKutaisi;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=GOJ&JourneySpan=Rt&lang=en']")
    private WebElement OffersNizhnyiNovgorod;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=UFA&JourneySpan=Rt&lang=en']")
    private WebElement offersUfa;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=DXB&JourneySpan=Rt&lang=en']")
    private WebElement offersDubai;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=ROV&JourneySpan=Rt&lang=en']")
    private WebElement offersRostov;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=MOW&JourneySpan=Rt&lang=en']")
    private WebElement offersMoscow;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=AER&JourneySpan=Rt&lang=en']")
    private WebElement offersSochi;

    @FindBy(xpath = "//a[@href='/redirect.php?OriginLocation=MSQ&DestinationLocation=KRR&JourneySpan=Rt&lang=en']")
    private WebElement offersKrasnodar;

    @FindBy(xpath = "//div[@class='route']/span[2]")
    private WebElement confirmCity;

    public WebElement getOffersKazan() {
        return offersKazan;
    }

    public WebElement getOffersSamara() {
        return offersSamara;
    }

    public WebElement getOffersTbilisi() {
        return offersTbilisi;
    }

    public WebElement getOffersKutaisi() {
        return offersKutaisi;
    }

    public WebElement getOffersNizhnyiNovgorod() {
        return OffersNizhnyiNovgorod;
    }

    public WebElement getOffersUfa() {
        return offersUfa;
    }

    public WebElement getOffersDubai() {
        return offersDubai;
    }

    public WebElement getOffersRostov() {
        return offersRostov;
    }

    public WebElement getOffersMoscow() {
        return offersMoscow;
    }

    public WebElement getOffersSochi() {
        return offersSochi;
    }

    public WebElement getOffersKrasnodar() {
        return offersKrasnodar;
    }

    public WebElement getConfirmCity() {
        return confirmCity;
    }
}
