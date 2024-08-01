package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in"))).click();

        driver.findElement(By.id("email")).sendKeys("saqib123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Saqib@123");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account"))).click();

        WebElement phoneNumberLocation = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
        phoneNumberLocation.clear();
        phoneNumberLocation.sendKeys("9165531156");

        driver.findElement(By.id("personalUpdateBtn")).click();


    }
}
