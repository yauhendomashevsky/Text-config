package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyBookBase extends BasePage{


    @FindBy(xpath = "//a[@href='https://www.tnp.sg/news/singapore/new-human-resource-playbook-help-fb-firms-manpower-issues']")
    public WebElement freeBook;

    @FindBy(xpath = "//div[@property='content:encoded']/p[2]")
    public WebElement text1;

    @FindBy(xpath = "//div[@property='content:encoded']/p[3]")
    public WebElement text2;
}
