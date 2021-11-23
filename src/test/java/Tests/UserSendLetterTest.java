package Tests;

import TestBase.TestBase;
import org.junit.jupiter.api.Test;

public class UserSendLetterTest extends TestBase {

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
        //page.loadPhoto();
        //page.clickCheckBoxAnswer();
        Thread.sleep(2000);
        page.pressButtonSendLetter();
        page.pressButtonPayLetter();
        //check
        page.checkLetterIsSend();


    }
}
