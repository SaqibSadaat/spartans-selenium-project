package tek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);

        WebElement languageElement = driver.findElement(By.id("languageSelect"));

        Select selectIndex = new Select(languageElement);
        selectIndex.selectByValue("Italian"); //Select Dropdown option using Value

        Thread.sleep(3000);

        driver.quit();

    }
}
