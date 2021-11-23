package BasePage;

import TestBase.TestBase;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor jSex;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    //CONST
    private String URL = "https://fsin-pismo.axmor.com/fsin-censor/auth";
    private String URL_SUCC_AUTH = "https://fsin-pismo.axmor.com/fsin-censor/";
    private String USER_URL = "https://fsin-pismo.axmor.com/client/app/letter/create";

    //CONST_END

    //Actions
    //открыть страницу
    public void BaseOpen(String URL){
        driver.get(URL);
    }

    //Авторизоваться в качестве цензора
    public void login() {
        driver.get(URL);
        driver.findElement(By.xpath("//*[@type=\"text\"]")).sendKeys("user1234");
        driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("user1234");
        driver.findElement(By.id("authorization-form-submit")).click();
    }
    //внести текст
    public void BaseSendText(By elementBy, String text){
        driver.findElement(elementBy).sendKeys(text);
    }

    //кликнуть по эементу
    public void BaseClick(By elementBy){
        driver.findElement(elementBy).click();
    }

    //проверить сылку принимает ожидаемый адрес и сравнивает с сылкой открытой страницы
    public void BaseCheckUrl(String url){
        String element = driver.getCurrentUrl();
        Assertions.assertEquals(url, element);

    }
    //ожидание видимости элемента
    public void BaseWaitVisibility(By elementBy, String text){
        wait.until(ExpectedConditions.invisibilityOfElementWithText(elementBy, text));
    }

    //Actions_end

}
