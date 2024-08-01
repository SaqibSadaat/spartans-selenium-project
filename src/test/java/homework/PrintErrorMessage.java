package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PrintErrorMessage {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList-nav-line-1")))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email"))).sendKeys("saqibafg@gmail.com");
        driver.findElement(By.id("continue")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password"))).sendKeys("S@q!b0093");
        driver.findElement(By.id("signInSubmit")).click();

        WebElement errorMessage = driver.findElement(By.id("auth-error-message-box"));
        String errorMsg = errorMessage.getText();
        System.out.println(errorMsg);
    }
}
