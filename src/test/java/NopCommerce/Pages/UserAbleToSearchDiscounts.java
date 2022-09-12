package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class UserAbleToSearchDiscounts {
    WebDriver driver;
    By Dicounts = By.xpath("//p[contains(text(),' Discounts')]");
    By StartDate = By.xpath("//input[@name='SearchStartDate']");
    By EndDate = By.xpath("//input[@name='SearchEndDate']");
    By Search = By.xpath("//button[@class='btn btn-primary btn-search']");
    public UserAbleToSearchDiscounts(WebDriver driver) {
        this.driver=driver;
    }

    public void SearchDicounts() throws InterruptedException {
        driver.findElement(Dicounts).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(StartDate).sendKeys("9/12/2022");
        driver.findElement(EndDate).sendKeys("9/15/2022");
        driver.findElement(Search).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
}
