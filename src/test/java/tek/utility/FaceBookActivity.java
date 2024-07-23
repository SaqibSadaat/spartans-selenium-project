package tek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.tree.ExpandVetoException;
import java.time.Duration;

public class FaceBookActivity {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"u_0_0_My\"]"))).click();

        driver.findElement(By.linkText("Create new account"))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")))
                .sendKeys("Saqib");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")))
                .sendKeys("Ali");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__")))
                .sendKeys("saqibafg@gmail.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_passwd__")))
                .sendKeys("Password@123");

       




    }
}
