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
    public void userSendLetter() throws InterruptedException {
        UserSendLetterPage page = new UserSendLetterPage(driver);

        page.open();
        page.selectRegion();
        page.selectDepartment();
        page.enterRecipientLastName();
        page.enterRecipientFirstName();
        page.enterRecipientSecondName();
        page.selectBirthDate();
        page.enterSenderCredentials();
        page.enterSenderPhone();
        page.enterSenderMail();
        page.enterSenderMailConfirm();
        page.enterLetterText();
        page.enterCardNumber();
        page.enterCardCode();
        page.loadPhoto();
        page.clickCheckBoxAnswer();
        Thread.sleep(2000);
        page.pressButtonSendLetter();
        page.pressButtonPayLetter();
        //check
        page.checkLetterIsSend();
    }

    @Test
    public void censorCheckLetter() {
        BasePage page = new BasePage(driver);
        CensorCheckLetterPage testPage = new CensorCheckLetterPage(driver);

        page.login();

    }
}
