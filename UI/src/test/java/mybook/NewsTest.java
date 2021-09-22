package mybook;

import metacritic.BaseTest;
import org.testng.annotations.Test;
import pages.NewsPage;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsTest extends BaseTest {
    NewsPage newsPage = new NewsPage();

    @Test
    public void readText1() {
        File file = new File("D:\\Java Automation learning","readText1.txt");
        driver.get("https://www.lipsum.com/");
        Pattern p = Pattern.compile("\\w*ed");
        Matcher m = p.matcher(newsPage.getSomeText1().getText());

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))){
            while (m.find()) {
                String text1 = m.group();
                bufferedWriter.write(text1 + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
