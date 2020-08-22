package CignaTestCase;

import org.testng.annotations.Test;

public class CignaTestClass extends Cigna {
    @Test
    public void testNavigate() throws InterruptedException {//works best
        navigate();
    }
    @Test
    public void testGoToDentalInsurancePlan() throws InterruptedException {//works best
        goToDentalInsurancePlan();
    }

    @Test
    public void testFindADoctor() throws InterruptedException {
        findADoctor();
    }
    @Test
    public void testGoMedicarePlans() throws InterruptedException {
        goMedicarePlans();
    }
}
