package TDbankTestCases;

import org.testng.annotations.Test;

public class TestClass extends TdBank {
    @Test
    public void testLogIn() throws InterruptedException {
        logIn();
    }

    @Test
    public void testSmallBusiness() throws InterruptedException {
        smallBusiness();
    }

    @Test
    public void testVerifyProducts() throws InterruptedException {
        verifyProducts();
    }

    @Test
    public void testClickCommercial() throws InterruptedException {
        clickCommercial();

    }

    @Test
    public void testPersonal() throws InterruptedException {
        personal();
    }
}
