package mybook;

import metacritic.BaseTest;
import org.testng.annotations.Test;
import pages.MyBookBase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyBookTest extends BaseTest {
    MyBookBase myBookBase = new MyBookBase();

    @Test
    public void readTheBook() {
        driver.get("https://www.tnp.sg/");
        myBookBase.freeBook.click();
        myBookBase.text1.getText();
        Pattern pattern = Pattern.compile("T\\w*");
        Matcher matcher = pattern.matcher(myBookBase.text1.getText());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        Pattern p = Pattern.compile("ca\\w*");
        Matcher m = p.matcher(myBookBase.text2.getText());
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
