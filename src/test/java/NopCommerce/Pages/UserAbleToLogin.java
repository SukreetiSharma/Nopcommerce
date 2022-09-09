package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAbleToLogin {
    WebDriver driver;
    By Login = By.xpath("//button[@class='button-1 login-button']");
    By Promotions = By.xpath("(//i[@class='right fas fa-angle-left '])[5]");

    public UserAbleToLogin(WebDriver driver) {
        this.driver=driver;
    }

    public void LoginToDashboard(){
        driver.findElement(Login).click();
        driver.findElement(Promotions).click();
    }
}
