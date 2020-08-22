package CignaTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Cigna {
    public WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib/browserDriver/chromedriver";
    public String url = "https://www.cigna.com/";

    @BeforeMethod
    public void welcome() {
        System.out.println("Welcome to Cigna Automation world");
    }


    public void setUp(String driverUrl, String driverPath, String url) {
        // For Chrome Browser
        System.setProperty(driverUrl, driverPath);
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    //test 1:
    public void navigate() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        //click on health insurance for individuals and families
        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[1]/div[1]/div[1]/div/a")).click();
        Thread.sleep(3000);
        //click on the state dropdown
        driver.findElement(By.xpath("//select[@name='state-chooser']")).click();
        Thread.sleep(3000);
        //click the state virgina
        driver.findElement(By.xpath("//*[@id=\"plan-state-virginia-dropdown\"]")).click();
        Thread.sleep(3000);
        //click on select a country
        driver.findElement(By.xpath("//div[@class='dropdown form-drop col-12 col-sm-4 county-dropdown']")).click();
        Thread.sleep(3000);

        //click on the city dropdown and choose loudoun
        driver.findElement(By.xpath("//select[2]//option[17]")).click();
        Thread.sleep(3000);
        //click see plans
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
        Thread.sleep(3000);

    }
    //test 2:

    public void goToDentalInsurancePlan() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on the dental insurance plan
        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[1]/div[1]/div[2]/div/a")).click();
        Thread.sleep(3000);
        //cigna dental 1500
        driver.findElement(By.xpath("//*[@id=\"1523788060314\"]/div/div[1]/div[1]/header/a")).click();
        Thread.sleep(3000);
        //get a quote
        driver.findElement(By.xpath("//*[@id=\"1523788056236\"]/div/div[2]/div/div[2]/div/div/a")).click();

    }

    //test 3:

    public void findADoctor() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click find a doctor
        driver.findElement(By.xpath("//*[@id=\"1564310141627\"]/div/header/div[2]/nav[2]/div/ul/li[1]/a")).click();
        Thread.sleep(3000);
        //click employee or school
        driver.findElement(By.xpath("/html/body/cigna-root/public-directory-layout/main/cigna-coverage-selection/div/div/div[1]/cigna-search-category-card/div/button")).click();
        Thread.sleep(3000);
        //click doctor by type
        driver.findElement(By.xpath("/html/body/cigna-root/public-directory-layout/main/cigna-directory/div/div[1]/div[1]/section[2]/div[1]/div[1]/div/cigna-search-category-card/div/button/span")).click();
        Thread.sleep(3000);


    }

    public void goMedicarePlans() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on the medicare plans
        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[1]/div[1]/div[3]/div/a")).click();
        Thread.sleep(3000);
        //click on the top covid 19 link
       // driver.findElement(By.xpath("//*[@id=\"1583802532564\"]/div/div/p/a/span/svg/use")).click();


    }

}
