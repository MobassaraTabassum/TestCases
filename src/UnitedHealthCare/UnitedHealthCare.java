package UnitedHealthCare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UnitedHealthCare {
    public WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib/browserDriver/chromedriver";
    public String url = "https://www.uhc.com/";

    @BeforeMethod
    public void welcome() {
        System.out.println("Welcome to UnitedHealth Care Automation world");
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

    //testcase 1:

    public void searchButton() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on the search box
        driver.findElement(By.xpath("//*[@id=\"search-desktop\"]")).sendKeys("insurance card");
        //click on the search button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"search__button\"]")).click();
        Thread.sleep(3000);
    }


    //TestCase 2:
    public void goToHealthInsurance() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on insurance
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[1]/nav/ul/li[1]/button")).click();
        Thread.sleep(3000);

        //click hhealth insurance
        driver.findElement(By.xpath("//*[@id=\"health-insurance-link-flyout\"]")).click();
        Thread.sleep(3000);
        driver.switchTo().activeElement();
        Thread.sleep(3000);


        //click on the serch box for view plance by state zip code
        //driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//*[@id=\"417357236\"]")).sendKeys("10472");


    }


    //test case 3:
    public void clickMedicare() throws InterruptedException { // works fine
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on insurance
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[1]/nav/ul/li[1]/button")).click();
        Thread.sleep(3000);
        //click medicare
        driver.findElement(By.xpath("//*[@id=\"flyoutId-0flyout-col-1\"]/div/div/div/ul/li[2]/a")).click();
        //Thread.sleep(5000);
       // driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
        //enter zip code in the box
        driver.findElement(By.xpath("//*[@id=\"380486246\"]")).sendKeys("10462");
//        Thread.sleep(5000);
        //click find a medicare plan
        driver.findElement(By.xpath("//button[@class='button planfinder__submit']")).click();


        // driver.switchTo().alert().accept();

    }

    //test 4:
    public void goToDentalInsurance() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on insurance
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[1]/nav/ul/li[1]/button")).click();
        Thread.sleep(3000);
        //click on dental
        driver.findElement(By.xpath("//*[@id=\"flyoutId-0flyout-col-1\"]/div/div/div/ul/li[6]/a")).click();
        Thread.sleep(3000);
        //look for no age restriction
        String actualText = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div[8]/div/table/tbody/tr[6]/th/p/strong")).getText();
        String expectedText = "No age restrictions";
        Assert.assertEquals(actualText, expectedText);

    }

    //test 5:

    public void goToCobra() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on insurance
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[1]/nav/ul/li[1]/button")).click();
        Thread.sleep(3000);
        //click on cobra
        driver.findElement(By.xpath("//*[@id=\"flyoutId-0flyout-col-3\"]/div/div/div/ul/li[5]/a")).click();
        Thread.sleep(3000);
        //click on footnote and check the text
        String actualText = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div[1]/h2")).getText();
        String expectedText = "Footnote";
        Assert.assertEquals(actualText, expectedText);
    }

    //test 6:

    public void goToHealthAndWellness() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on health and wellness
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[1]/nav/ul/li[3]/button")).click();
        Thread.sleep(3000);
        //click on fitness
        driver.findElement(By.xpath("//*[@id=\"flyoutId-2flyout-col-1\"]/div/div/div/ul/li[1]/a")).click();
        //get text of a line
        String actualText = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div[4]/div/h2")).getText();
        String expectedText = "Getting fit, staying fit";
        Assert.assertEquals(actualText, expectedText);

    }

    //test 7:
    public void clickForEmployers() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on for employers
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[1]/div/div[1]/ul/li[3]/a")).click();
        Thread.sleep(3000);
        //click on group health insurance basics
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/nav/ul/li/ul/li[3]/a")).click();
       // Thread.sleep(3000);
        //click on group health insurance
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div[3]/a")).click();

    }

    //test 8:
    public void clickBrokers() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on for brokers
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[1]/div/div[1]/ul/li[4]/a")).click();
       // Thread.sleep(3000);

        //click our solutions
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/nav/ul/li/ul/li[2]/a")).click();
        Thread.sleep(3000);

        //click member experience
        driver.findElement(By.xpath("//*[@id=\"anchor-1597647665\"]")).click();
        //Thread.sleep(3000);

        //click on lifestyles and wellness support
        driver.findElement(By.xpath("//*[@id=\"anchor-1188901214\"]")).click();
    }

    // test 9:

    public void findingCareOptions() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on finding care options
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[1]/nav/ul/li[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"flyoutId-2flyout-col-2\"]/div/div/div/ul/li[1]/a")).click();
        //Thread.sleep(3000);
        //take control of your care
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/nav/ul/li/ul/li[2]/a")).click();
        //Thread.sleep(3000);
        //click on united health premium
        //driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/nav/ul/li/ul/li/a[2]")).click();
    }

    //test 10:
    public void findDoctor() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click find a doctor
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[2]/div[2]/a")).click();
        Thread.sleep(2000);
        //look for text
        String actualText = driver.findElement(By.xpath("//*[@id=\"find-dr-top-box\"]/div/div/div[1]/h2")).getText();
        String expectedText = "Find providers in your network";
        Assert.assertEquals(actualText, expectedText);

    }

    //test 11:
    public void navigate() throws InterruptedException {//not working
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on sign in
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[1]/div[3]/div/div[2]/div[3]/button/span")).click();
        Thread.sleep(3000);

        //click sign in to a secure site:

        driver.findElement(By.xpath("//*[@id=\"671978824-list1597984049483\"]/li[3]/a")).click();
    }



}
