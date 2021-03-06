package TestBase;

import Tests.CensorAuthPage;
import Tests.CensorCheckLetterPage;
import Tests.UserSendLetterPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestBase { //конфиг для запускаемых тестов
    public WebDriver driver;
    public WebDriverWait wait;
    public ChromeOptions options;
    public JavascriptExecutor jSex;
    public boolean uiModeHeadless = false;
    //переменные страниц
    public CensorAuthPage CensorAuthPage;
    public UserSendLetterPage UserSendLetterPage;
    public CensorCheckLetterPage CensorCheckLetterPage;


    //выполняется перед тестами
    @BeforeEach
    public void start() {
        //       System.setProperty("webdriver.chrome.driver", "C:\\testSource\\chromedriver.exe");
        WebDriverManager.chromedriver().setup(); //при установке bonigarcia, автоподгрузка драйвера
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 1, 1000);
        options = new ChromeOptions();
        jSex = (JavascriptExecutor) driver;
        options.setHeadless(uiModeHeadless);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //переменные страниц
        CensorAuthPage = PageFactory.initElements(driver, CensorAuthPage.class);
        UserSendLetterPage = PageFactory.initElements(driver, UserSendLetterPage.class);
        CensorCheckLetterPage = PageFactory.initElements(driver, CensorCheckLetterPage.class);
    }

    //выполняется после тестов
    @AfterEach
    public void stop() {
        //Thread.sleep(10000);
        driver.close();
        driver.quit();
    }
}
