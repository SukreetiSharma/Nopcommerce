package NopCommerce.Test;

import org.testng.annotations.Test;

public class TestUserAbleToAddDiscount extends BaseClass {

    @Test
    public void AbleToAddProduct() throws InterruptedException {
        pageFactory.getUserAbleToLogin().LoginToDashboard();
        pageFactory.getToAddDiscounts().ableToAddDiscounts();
        pageFactory.getToLogout().ableToLogout();
    }

}
