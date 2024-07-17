package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        Thread.sleep(2000);

        By smartHomeTextLocator = By.xpath("//h1[text()='Smart Home'] "); //This is just text.
        WebElement smartHomeTextElement = driver.findElement(smartHomeTextLocator);
        smartHomeTextElement.click();

        Thread.sleep(3000);

        By bulbLocator = By.xpath("//img[@alt='Smart Home Lightning']");
        WebElement bulbElement = driver.findElement(bulbLocator);
        bulbElement.click();
    }
}
