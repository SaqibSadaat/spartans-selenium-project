package tek.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ActivityMapping {
    /*
    on Insurance app "https://dev.insurance.tekschool-students.com/", login with
    supervisor / tek_supervisor credentials, and go to plans section
    and Map Plan Type with Plan Base price.
    Auto=$140.00
    Renter=$xxx
 */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Thread.sleep(2000);

        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();

        Thread.sleep(2000);
        driver.findElement(By.linkText("Plans")).click();



    }
}
