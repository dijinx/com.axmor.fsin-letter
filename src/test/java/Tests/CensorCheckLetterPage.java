package Tests;

import BasePage.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CensorCheckLetterPage extends BasePage {
    public CensorCheckLetterPage(WebDriver driver) {
        super(driver);
    }

    public void checkLetterText() throws InterruptedException {
        BaseClick(By.xpath("//tbody/tr[1]/td[2]/div/div/div"));
        Thread.sleep(1000);
        String text = BaseGetElementText(By.xpath("//div[contains(text(),\"AUTOTEST\")]"));
        Assertions.assertEquals("AUTOTEST", text);
    }


    public void checkLetterRecipientFIO() {
        String text = BaseGetElementText(By.xpath("//tbody/tr[1]/td[5]/span/div[contains(text(), 'фамилия имя')]"));
        Assertions.assertEquals("фамилия имя отчество", text);
    }

    public void checkSenderFIO() {

    }

    public void checkLetterPhoto() {

    }

    public void checkLetterResponse() {

    }
}
