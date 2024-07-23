package tek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity3 {

    public static void main(String[] args) throws InterruptedException {

        /*
        in Retail app under computer section choose accessories and then choose
        Keyboard and change quantity to 5.
        use implicit wait.
        use Explicit wait for all elements.
        Push to repository.
         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        // Set implicit wait to 20 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("signinLink")))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
                        .sendKeys("saqib123@gmail.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
                        .sendKeys("Saqib@123");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")))
                .click();



//        driver.quit();


    }
}
