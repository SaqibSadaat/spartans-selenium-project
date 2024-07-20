package tek.reviewsession.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        /*
        in retail sign in with valid credentials and go to account page.
        update phone number, and validate Success toast is displayed.
        Your test should work without changing multiple time.
        Apply implicit and explicit wait.
        use any locators available and you like.
        Push to repository.
         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        // Set implicit wait to 20 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("signinLink")).click();

        driver.findElement(By.id("email")).sendKeys("saqib123@gmail.com");

       driver.findElement(By.id("password")).sendKeys("Saqib@123");

        driver.findElement(By.id("loginBtn")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//a[@id='accountLink']")).click();

        driver.findElement(By.xpath("//input[@id='nameInput']")).sendKeys("Ali");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("personalUpdateBtn")).click();

//        driver.quit();


    }
}
