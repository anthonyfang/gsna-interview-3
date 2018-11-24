import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CustomersPage {

    private WebDriver driver;

    CustomersPage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openPage() {
        driver.get("file://"+getClass().getResource("/index.html").getPath());
    }
    

    public void closePage() {
        driver.quit();
    }


    public boolean containsLink(String linkText) {
        WebElement link = driver.findElement(By.linkText(linkText));
        return link.isDisplayed();
    }
}