package Tests;

import BasePage.BasePage;
import org.openqa.selenium.WebDriver;

public class UserCheckUrlAvailabilityPage extends BasePage {
    WebDriver driver;

    public UserCheckUrlAvailabilityPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    final String URL = "https://fsin-pismo.axmor.com/client/app/letter/create";

    public void open(){
        BaseOpen();
    }

    public void CheckUrl(){
        BaseCheckUrl(URL);
    }

}
