package tek.reviewsession.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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


        driver.findElement(By.id("signinLink")).click();

        driver.findElement(By.id("email")).sendKeys("saqibaf@gmail.com");

       driver.findElement(By.id("password")).sendKeys("Saqib@123");

        driver.findElement(By.id("loginBtn")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='accountLink']")).click();

        driver.findElement(By.id("personalPhoneInput")).sendKeys("9161112345");

        Thread.sleep(2000);

        driver.findElement(By.id("personalUpdateBtn")).click();

        driver.quit();


    }
}
