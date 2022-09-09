package NopCommerce.Test;

import NopCommerce.Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin-demo.nopcommerce.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        pageFactory = new PageFactory(driver);
    }

    @AfterClass
    public static void close(){
        driver.close();
    }
}
