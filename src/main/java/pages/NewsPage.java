package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends BasePage {

    @FindBy(xpath = "//h2[contains(text(),'What is Lorem Ipsum?')]/../p")
    public WebElement someText1;

    @FindBy(xpath = "//h2[contains(text(),'Why do we use it?')]/../p")
    public WebElement someText2;

    @FindBy(xpath = "//h2[contains(text(),'Where does it come from?')]/../p[1]")
    public WebElement someText3one;

    @FindBy(xpath = "//h2[contains(text(),'Where does it come from?')]/../p[2]")
    public WebElement someText3second;

    public WebElement getSomeText1() {
        return someText1;
    }

    public WebElement getSomeText2() {
        return someText2;
    }

    public WebElement getSomeText3one() {
        return someText3one;
    }

    public WebElement getSomeText3second() {
        return someText3second;
    }
}
