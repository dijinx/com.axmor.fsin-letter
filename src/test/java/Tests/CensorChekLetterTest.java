package Tests;

import BasePage.BasePage;
import TestBase.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

public class CensorChekLetterTest extends TestBase {

    @Description(value = "Цензор - проверяет ")
    @Feature(value = "Успешная авторизация - цензор")
    @Severity(SeverityLevel.BLOCKER)


    @Test
    public void censorCheckLetter() throws InterruptedException {
        BasePage page = new BasePage(driver);
        CensorCheckLetterPage testPage = new CensorCheckLetterPage(driver);

        page.login();
        //поиск первого письма в списке
        testPage.checkLetterText();
        testPage.checkLetterRecipientFIO();
        testPage.checkSenderFIO();
        testPage.checkLetterPhoto();
        testPage.checkLetterResponse();
    }

}
