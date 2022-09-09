package NopCommerce.Test;

import org.testng.annotations.Test;

public class TestUserAbleToSearchDiscounts extends BaseClass {

    @Test
    public void AbleToSearch() throws InterruptedException {
        pageFactory.getUserAbleToLogin().LoginToDashboard();
        pageFactory.getToSearchDiscounts().SearchDicounts();
    }
}
