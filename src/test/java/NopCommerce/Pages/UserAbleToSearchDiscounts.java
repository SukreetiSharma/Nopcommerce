package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAbleToSearchDiscounts {
    WebDriver driver;
    By Dicounts = By.xpath("//p[contains(text(),' Discounts')]");

    public UserAbleToSearchDiscounts(WebDriver driver) {
        this.driver=driver;
    }

    public void SearchDicounts(){
        driver.findElement(Dicounts).click();
    }

}
