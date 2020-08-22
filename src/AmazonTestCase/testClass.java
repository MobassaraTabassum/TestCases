package AmazonTestCase;

import org.testng.annotations.Test;

import java.security.PublicKey;

public class testClass extends Amazon {

    @Test
    public void testAddToCart() throws InterruptedException {
        addToCart();
    }
    @Test
    public void testTryPrime() throws InterruptedException {
        tryPrime();
    }
    @Test
    public void testNewCustomerStartHere() throws InterruptedException {
        newCustomerStartHere();
    }
    @Test
    public void testHello() throws InterruptedException {
        hello();
    }

    @Test
    public void testDeliverTo() throws InterruptedException {
        deliverTo();
    }

    @Test
    public void testClickOnMenu() throws InterruptedException {
        clickOnMenu();

    }

    @Test
    public void testSearchPrimeVideo() throws InterruptedException {
        searchPrimeVideo();
    }

    @Test
    public void testWatchParty() throws InterruptedException {
        watchParty();
    }

    @Test
    public void testEchoAndAlexa() throws InterruptedException {
        echoAndAlexa();
    }

    @Test
    public void testGetBestSellersTitle() throws InterruptedException {
        getBestSellersTitle();
    }

    @Test
    public void testNavigateToPrimeVideo() throws InterruptedException {
        navigateToPrimeVideo();
    }

    @Test
    public void testNavigateToCustomerService() throws InterruptedException {
        navigateToCustomerService();
    }

    @Test
    public void testNavigateToFindAGift() throws InterruptedException {
        navigateToFindAGift();
    }

    @Test
    public void testChooseFromAllDropDown() throws InterruptedException {
        chooseFromAllDropDown();

    }

    @Test
    public void testSignIn() throws InterruptedException {
        signIn();
    }
    @Test
    public void testNewReleases() throws InterruptedException {
        newReleases();
    }




}
