package Tests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserSendLetterPage extends BasePage {
    WebDriver driver;

    public UserSendLetterPage(WebDriver driver) {
        super(driver);
    }

    //страница пользователя для отправки писем
    private String URL = "https://fsin-pismo.axmor.com/client/app/letter/create";

    //ЗАЙТИ НА САЙТ
    public void open() {
        BaseOpen(URL);
    }

    //ВЫБРАТЬ ОБЛАСТЬ
    public void selectRegion() {
        BaseClick(By.xpath("//*[@value=1]"));
    }

    //ВЫБРАТЬ УЧЕРЕЖДЕНИЕ
    public void selectDepartment() {
        BaseClick(By.xpath("//*[@value=1 and text()=\"СИЗО-1 Кресты\"]"));
    }

    //ВНЕСТИ ФАМИЛИЮ АДРЕСАТА
    public void enterRecipientLastName() {
        BaseSendText(By.xpath("//*[@name=\"sender.lastName\"]"), "Фамилия");
    }

    //ВНЕСТИ ИМЯ АДРЕСАТА
    public void enterRecipientFirstName() {
        BaseSendText(By.xpath("//*[@name=\"sender.firstName\"]"), "Имя");
    }

    //ВНЕСТИ ОТЧЕСТВО АДРЕСАТА
    public void enterRecipientSecondName() {
        BaseSendText(By.xpath("//*[@name=\"sender.middleName\"]"), "Отчество");
    }

    //ВНЕСТИ ДАТУ РОЖДЕНИЯ АДРЕСАТА
    public void selectBirthDate() {
        BaseClick(By.xpath("//*[@value=\"2007\"]"));
    }

    //ВНЕСТИ ФИО ОТПРАВИТЕЛЯ
    public void enterSenderCredentials() {
        BaseSendText(By.xpath("//*[@name=\"author.name\"]"), "Фио отправителя");
    }

    //ВНЕСТИ ТЕЛЕФОННЫЙ НОМЕР ОТПРАВИТЕЛЯ
    public void enterSenderPhone() {
        BaseSendText(By.xpath("//*[@placeholder=\"Номер телефона\"]"), "+79999999999");
    }

    //ВНЕСТИ ПОЧТУ ОТПРАВИТЕЛЯ
    public void enterSenderMail() {
        BaseSendText(By.xpath("//*[@name=\"author.email\"]"), "dvaxmor@gmail.com");
    }

    //ВНЕСТИ ПОДТВЕРЖДЕНИЕ ПОЧТЫ ОТПРАВИТЕЛЯ
    public void enterSenderMailConfirm() {
        BaseSendText(By.xpath("//*[@name=\"author.email2\"]"), "dvaxmor@gmail.com");
    }

    //ВНЕСТИ ТЕКСТ ПИСЬМА
    public void enterLetterText() {
        BaseSendText(By.xpath("//*[@name=\"letter\"]"), "AUTOTEST");
    }

    //ВНЕСТИ НОМЕР КАРТЫ
    public void enterCardNumber() {
        BaseSendText(By.xpath("//*[@placeholder=\"Номер карты\"]"), "2500039");
    }

    //ВНЕСТИ ПИН КАРТЫ
    public void enterCardCode() {
        BaseSendText(By.xpath("//*[@placeholder=\"Код авторизации\"]"), "7832");
    }

    //ЗАГРУЗИТЬ ФОТО
    public void loadPhoto() {
        BaseSendText(By.xpath("//*[@accept=\"image/jpeg,image/png,image/gif\"]"),
                "C:\\java_projects\\com.axmor.fsin-letter\\src\\test\\resources\\test_picture.jpeg");
    }

    //ЧЕК-БОКС - НЕОБХОДИМОСТИ ПОЛУЧИТЬ ОТВЕТ НА ПИСЬМО
    public void clickCheckBoxAnswer() {
        BaseClick(By.xpath("//*[@name=\"isAnswerOrdered\"]"));
    }

    //НАЖАТЬ КНОПКУ ОТПРАВИТЬ ПИСЬМО
    public void pressButtonSendLetter() {
        BaseClick(By.xpath("//*[@type=\"submit\"]"));

    }

    //НАЖАТЬ КНОПКУ ОПЛАТИТЬ ПИСЬМО
    public void pressButtonPayLetter() {
        BaseClick(By.xpath("//*[@class=\"ci_submit left\"]"));
    }
    //проверка - письмо доставлено
    public void checkLetterIsSend(){
        BaseWaitVisibility(By.xpath("//*[contains(text(), \"Ваше письмо принято к доставке\")]"),"Ваше письмо принято к доставке");
    }
    //забрать номер письма
    public String getElementText(){
        String text = BaseGetElementText(By.xpath("\"//lh[contains(text(),'565')]\""));
        return text;
    }
    //получение номера письма

}
