package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAbleToAddDiscounts {
    WebDriver driver;
    By Dicounts = By.xpath("//p[contains(text(),' Discounts')]");
    By Add = By.xpath("//a[@href='/Admin/Discount/Create']");
    By Name = By.xpath("(//input[@class='form-control text-box single-line'])[1]");
    By percent = By.xpath("(//input[@class='check-box'])[2]");
    By PercentDiscount = By.xpath("(//input[@class='k-formatted-value k-input'])[1]");
    By Save = By.xpath("(//i[@class='far fa-save'])[1]");

    public UserAbleToAddDiscounts(WebDriver driver) {
        this.driver=driver;
    }
    public void ableToAddDiscounts (){
        driver.findElement(Dicounts).click();
        driver.findElement(Add).click();
        driver.findElement(Name).sendKeys("30% Discount");
        driver.findElement(percent).click();
        driver.findElement(PercentDiscount).sendKeys("30");
        driver.findElement(Save).click();
    }
}
