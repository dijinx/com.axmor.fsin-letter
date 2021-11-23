package Tests;

import TestBase.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

public class UserCheckUrlAvailabilityTest extends TestBase {

    @Description(value = "Проверка доступности страницы отправки письма")
    @Feature(value = "Проверка доступности страницы отправки письма")
    @Severity(SeverityLevel.BLOCKER)

    @Test
    public void UserCheckUrlAvailability(){
        UserCheckUrlAvailabilityPage page = new UserCheckUrlAvailabilityPage(driver);

        page.open();
        page.CheckUrl();

    }
}
