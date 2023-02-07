import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Website {

    WebDriver driver;
    @BeforeMethod
    public void websiteOpen() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\babbi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.abhibus.com/");
    }

    @Test
    public void testTrains() {
        driver.findElement(By.id("pills-profile-tab")).click();
    }

    @Test
    public void testHotels() {
        driver.findElement(By.id("pills-contact-tab")).click();
    }

    @Test
    public void testRentals() {
        driver.findElement(By.id("pills-rental-tab")).click();
    }

	/*@AfterMethod
	public void websiteClose() {
		driver.quit();
	}*/

}
