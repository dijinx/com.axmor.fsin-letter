package Tests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CensorAuthPage extends BasePage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor jSex;

    public CensorAuthPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //CONST
    public String CENSOR_SUCCESSFULLY_AUTH_URL = "https://fsin-pismo.axmor.com/fsin-censor/";


    //CONST_END

    //Elements

    //Elements_end

    //Actions
    //Авторизоваться цензором
    public void open() {
        login();
    }
    //внести текст
//    public void sendText(){
//       BaseSendText(By.xpath("r"), "r");
//    }
    //проверить текущий адрес страницы
    public void checkUrl(){
        BaseCheckUrl(CENSOR_SUCCESSFULLY_AUTH_URL);
    }
    //Actions_end
}
