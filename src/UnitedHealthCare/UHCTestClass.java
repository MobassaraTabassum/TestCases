package UnitedHealthCare;

import org.testng.annotations.Test;

public class UHCTestClass extends UnitedHealthCare {
    @Test
    public void testSearchButton() throws InterruptedException {
        searchButton();
    }


    @Test
    public void testGoToHealthInsurance() throws InterruptedException {//working
        goToHealthInsurance();

    }

    @Test
    public void testClickMedicare() throws InterruptedException {
        clickMedicare();//works the best
    }

    @Test
    public void testGoToDentalInsurance() throws InterruptedException {//works
        goToDentalInsurance();
    }

    @Test
    public void testGoToCobra() throws InterruptedException {//works  best
        goToCobra();
    }

    @Test
    public void testGoToHealthAndWellness() throws InterruptedException {
        goToHealthAndWellness();
    }

    @Test
    public void testClickForEmployers() throws InterruptedException {//works
        clickForEmployers();
    }

    @Test
    public void testClickBrokers() throws InterruptedException {
        clickBrokers();
    }

    @Test
    public void testFindingCareOptions() throws InterruptedException {
        findingCareOptions();
    }

    @Test
    public void testFindDoctor() throws InterruptedException {
        findDoctor();
    }
    @Test
    public void testNavigate() throws InterruptedException {
        navigate();//not working
    }


}
