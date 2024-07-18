package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // double forward slash used for Xpath
        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(3000);

        By computerLocator = By.xpath("/html/body/div/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/img");
        WebElement tvElement = driver.findElement(computerLocator);
        tvElement.click();
    }
}
