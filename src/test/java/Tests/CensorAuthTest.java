package Tests;

import TestBase.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

public class CensorAuthTest extends TestBase {

    @Description(value = "Цензор - проверка возможности успешной авторизации")
    @Feature(value = "Успешная авторизация - цензор")
    @Severity(SeverityLevel.BLOCKER)


    @Test
    public void censorAuth() throws InterruptedException {
        CensorAuthPage page = new CensorAuthPage(driver);
        page.open();
        Thread.sleep(2000);
        page.checkUrl();
    }
}
