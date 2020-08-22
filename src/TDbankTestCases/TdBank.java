package TDbankTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TdBank {

    public WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib/browserDriver/chromedriver";
    public String url = "https://www.td.com/us/en/personal-banking/";

    @BeforeMethod
    public void welcome() {
        System.out.println("Welcome to TdBank Automation world");
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
    public void logIn() throws InterruptedException {//works fine
        //launch Browser and URL
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(7000);
        //Click on Login
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/section/div/div/div/div[2]/div/div[2]/div[1]/button")).click();
        Thread.sleep(3000);
        //Enter Username
        driver.findElement(By.xpath("//*[@id=\"formElement_0\"]")).sendKeys("mobassara");
        Thread.sleep(3000);
        //Enter Password
        driver.findElement(By.xpath("//*[@id=\"formElement_1\"]")).sendKeys("1234mtt");
        Thread.sleep(3000);
        //Click on login button
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
        Thread.sleep(8000);
    }


    //test 2:
    public void smallBusiness() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on  small business
        driver.findElement(By.xpath("//div[@class='td-segments']//a[contains(text(),'Small Business')]")).click();
        Thread.sleep(3000);
        //click checking
        driver.findElement(By.xpath("//*[@id=\"drag-id-tabsCarousel0\"]/div/li[1]/div[1]/span/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"drag-id-tabsCarousel0\"]/div/li[1]/div[1]/p")).click();
    }


    //test 3:
    public void verifyProducts() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //hover your mouse to the products
        WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"td-desktop-nav-dropdown-link-2\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(searchBtn).perform();
        Thread.sleep(3000);

    }
    //test 4:

    public void clickCommercial() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click commercial
        driver.findElement(By.cssSelector("body > div.td-header-nav-top-message > div.td_rq_header-nav.td-header-nav > header.td-header-desktop > div.td-utility-toggle > div > div.td-section-left > div > ul > li:nth-child(3) > a")).click();
        Thread.sleep(3000);
        //click on learn more
        driver.findElement(By.xpath("//*[@id=\"aBanner0\"]/div/div/div/div/div/button")).click();
        Thread.sleep(3000);
        //click on ppp forgiveness
        driver.findElement(By.xpath("//*[@id=\"ba_1_title\"]/a/span")).click();
        Thread.sleep(3000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"main\"]/section[1]/div/div/h1")).getText();
        String expectedText = "Paycheck Protection Program (PPP) Loan Forgiveness";
        Assert.assertEquals(actualText, expectedText);

    }

    //test 5:

    public void personal() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click checking
        driver.findElement(By.xpath("//*[@id=\"drag-id-tabsCarousel0\"]/div/li[1]/div[1]/span/span")).click();
        Thread.sleep(3000);
        //click td beyond checking
        driver.findElement(By.xpath("//*[@id=\"main\"]/section[3]/div/div[2]/div/div/div[1]/div[2]/div/div/div[1]/h3/a")).click();
        Thread.sleep(3000);
        // click on the box
        driver.findElement(By.xpath("//*[@id=\"state\"]")).click();
        Thread.sleep(3000);
        //click NY
        driver.findElement(By.xpath("//*[@id=\"state\"]/option[10]")).click();
        Thread.sleep(3000);

        //click on the city search box
        driver.findElement(By.xpath("//*[@id=\"city\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"city\"]/option[10]")).click();
        System.out.println("set location");
        // Thread.sleep(3000);
        //driver.findElement(By.cssSelector("#scrollbarid_378 > div > div > div > div > p:nth-child(6) > button")).click();


////click close
//        driver.findElement(By.xpath("//*[@id=\"region_selector\"]/div/div/div[1]/button/span")).click();
//        Thread.sleep(3000);
//
//        //go to td.com
//        driver.findElement(By.name("td-button td-button-block td-button-secondary leave-button-first")).click();
//        Thread.sleep(3000);

    }


}
