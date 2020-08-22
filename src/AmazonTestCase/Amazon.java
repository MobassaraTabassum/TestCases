package AmazonTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Amazon {

    public WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib/browserDriver/chromedriver";
    public String url = "https://www.amazon.com/";
    public String searchBox = "//*[@id=\"twotabsearchtextbox\"]";
    public String productSearch = "Hand sanitizer";
    public String searchButton = "//*[@id=\"nav-search\"]/form/div[2]/div/input";

    @BeforeMethod
    public void welcome() {
        System.out.println("Welcome to Amazon Automation world");
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

    // Test case Action method
    public void searchBoxCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        //Click on search box and Enter Hand sanitizer
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        Thread.sleep(3000);
        //Click on search button
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(5000);
    }

    //test 1:
    public void addToCart() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        //  click on search and enter shampoo
        driver.findElement(By.xpath(searchBox)).sendKeys("shampoo");
        Thread.sleep(3000);
        //click search
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]")).click();
        Thread.sleep(3000);
        //choose desired shampoo
        driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(text(),'TRESemmé Moisturizing Shampoo For Hydrated Hair Mo')]")).click();
        //choose one time
        driver.findElement(By.xpath("//*[@id=\"newAccordionRow\"]/div/div[1]/a/i")).click();
        //add to cart
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();

    }


//test 2:

    public void tryPrime() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //hover over to try prime
        WebElement search = driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span/span"));
        Actions action = new Actions(driver);
        action.moveToElement(search).perform();
        //click on try prime
        driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span")).click();
        //print amazon.com: amazon prime on the console
        System.out.println(driver.getTitle());
        Thread.sleep(2000);

    }

    //test 3:
    public void hello() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on the deliver to
        driver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")).click();
        Thread.sleep(3000);
        //search by the zip code
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys("10462");
        Thread.sleep(3000);
        //click search
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input")).click();

    }


    //test 4:
    public void deliverTo() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on the deliver to
        driver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")).click();
        Thread.sleep(3000);
        //click on ship outside of us
        driver.findElement(By.xpath("//*[@id=\"GLUXCountryValue\"]")).click();
        Thread.sleep(3000);
        //click on japan
        driver.findElement(By.xpath("//*[@id=\"GLUXCountryList_3\"]")).click();
        Thread.sleep(3000);
        //click done
        driver.findElement(By.name("glowDoneButton")).click();

    }

    //test 5:

    public void clickOnMenu() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on menu
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        Thread.sleep(3000);
        //click on prime video
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a/div")).click();
        Thread.sleep(3000);
        //click on included with prime
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a")).click();
    }


    // test 6:

    public void searchPrimeVideo() throws InterruptedException {

        //call the clickOnMenu() method
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on menu
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        Thread.sleep(3000);
        //click on prime video
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a/div")).click();
        Thread.sleep(3000);
        //click on included with prime
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a")).click();
        Thread.sleep(3000);
        //hover over to categories:
        WebElement search = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[1]/ul[1]/li[4]"));
        Actions action = new Actions(driver);
        action.moveToElement(search).perform();
        Thread.sleep(3000);
        //click on movies
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[1]/ul[1]/li[4]")).click();

    }

    //test 7:

    public void watchParty() throws InterruptedException {
        clickOnMenu();
        Thread.sleep(3000);
        //click on watch party
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[1]/ul[1]/li[6]/a")).click();
        Thread.sleep(3000);
        //click Not yet a prime member? join here.
        driver.findElement(By.xpath("//*[@id=\"slot-576479633\"]/div/div/p[5]/a/span")).click();
    }

    //test 8:
    public void echoAndAlexa() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on menu
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul/li[4]/a/div")).click();
        Thread.sleep(3000);
        //click on echo show 5
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[4]/li[3]/a")).click();
        Thread.sleep(3000);
        //click on sandstone
        driver.findElement(By.xpath("//*[@id=\"a-autoid-23-announce\"]/div/div[1]/img")).click();
    }

    //test 9:
    public void getBestSellersTitle() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        //get the title of the page on console
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

    }

    //test 10:
    public void navigateToCustomerService() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
        System.out.println("Navigate to customer service");
        Thread.sleep(3000);
        //click on amazon and covid-19
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[3]/div/a/div/div")).click();
        Thread.sleep(3000);
        //click on search box and type delivery time
        driver.findElement(By.xpath("//*[@id=\"helpsearch\"]")).sendKeys("Delivery time");
        Thread.sleep(3000);
        //click search
        driver.findElement(By.xpath("//*[@id=\"helpSearchSubmit\"]/span/input")).click();
        Thread.sleep(3000);


    }

//test 11:
    public void navigateToPrimeVideo() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(2000);
        //Click on Menu Icon
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        Thread.sleep(2000);
        //Click on Prime video from the Shop By Category
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a/div")).click();
        Thread.sleep(3000);
        //Click on prime video form SubMenu option from the Shop By Category
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[3]/a")).click();
    }

   // test 12:
    public void navigateToFindAGift() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
        driver.getTitle();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='sc-bdVaJa jCEIjw']//a[1]//div[1]//div[1]//img[1]")).click();
        Thread.sleep(3000);
        //click e gift
        driver.findElement(By.xpath("//button[contains(text(),'eGift')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gcx-gf-section-0\"]/div/section/div[1]/figure/div/div/div/a/div/div[1]/span")).click();
        Thread.sleep(3000);

    }

    //Test 13:

    public void chooseFromAllDropDown() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click on all dropdown
        driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
        Thread.sleep(3000);
        //click on kindle store
        driver.findElement(By.xpath("//option[contains(text(),'Kindle Store')]")).click();
        Thread.sleep(3000);
        //go to search box and type amazon kindle
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Amazon kindle");
        Thread.sleep(3000);
        //click search
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
        Thread.sleep(3000);
        //click on the spread
        driver.findElement(By.xpath("//span[contains(text(),'The Spread: Book 1 (The Hill)')]")).click();
        Thread.sleep(3000);

    }

//test 14:

    public void signIn() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //hover over to hello sign in
        WebElement hello = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(hello).perform();
        Thread.sleep(3000);
        //click sign in
        driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
        Thread.sleep(3000);
        //enter email
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("mtt1234@gmail.com");
        Thread.sleep(3000);
        //click continue
        System.out.println(driver.findElement(By.xpath("//input[@id='continue']")).getText());
        Thread.sleep(3000);

        //if you enter a valid email if will work
//        //enter password
//        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123login");
//        Thread.sleep(3000);
//        //click sign in
//        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
//        Thread.sleep(3000);

    }

    //test 15:
    public void newReleases() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(3000);
        //click new releases
        driver.findElement(By.xpath("//a[contains(text(),'New Releases')]")).click();
        Thread.sleep(3000);
        //click amazon devices and accessories
        driver.findElement(By.xpath("//a[contains(text(),'Amazon Devices & Accessories')]")).click();
        Thread.sleep(3000);
        //click on all fire hd
        driver.findElement(By.xpath("//div[contains(text(),'All-new Fire HD 8 tablet, 8\" HD display, 32 GB, de')]")).click();
        Thread.sleep(3000);

    }

    //test 16:


    //Search HeadPhones and Add To Cart
    public void searchItems() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        //Enter headphones
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("masks");
        Thread.sleep(3000);
        //Click on Search
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
        Thread.sleep(3000);
        driver.findElement(new By.ByLinkText("INTO THE AM Seamless Face Cover Mouth Mask Bandana Neck Gaiter Cool Lightweight")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[1]")).click();
        //  Thread.sleep(2000);
        // driver.findElement(By.xpath("//*[@id=\"quantity_2\"]"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
    }

    //test 17:

    public void newCustomerStartHere() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        Thread.sleep(5000);
        //hover over
        WebElement hello = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(hello).perform();
        Thread.sleep(3000);
        //start here
        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
        Thread.sleep(3000);
        //your name
        driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("mobassara");
        Thread.sleep(3000);
        //email
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("mt123@Gmail.com");
        Thread.sleep(3000);
        //password
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Mttttt123");
        Thread.sleep(3000);
        //re enter password
        driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("Mttttt123");
        //click create account
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

    }


}
