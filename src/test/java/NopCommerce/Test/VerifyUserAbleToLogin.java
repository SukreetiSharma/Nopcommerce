package NopCommerce.Test;

import org.testng.annotations.Test;

public class VerifyUserAbleToLogin extends BaseClass {

    @Test
    public void AbleToSearch() throws InterruptedException {
        pageFactory.getUserAbleToLogin().LoginToDashboard();
    }
}
