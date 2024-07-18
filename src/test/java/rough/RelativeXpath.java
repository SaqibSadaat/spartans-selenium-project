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

        Thread.sleep(1000);

        // double forward slash used for Xpath
        //When you used tag after // it means this is relative Xpath.

        By smartHomeTextLocator = By.xpath("//h1[text()='Smart Home'] "); //h1 tag is always used for font size in html and this is just select text.
        WebElement smartHomeTextElement = driver.findElement(smartHomeTextLocator);
        smartHomeTextElement.click();

        Thread.sleep(1000);

//        By bulbLocator = By.xpath("//img[@alt='Smart Home Lightning']");
//        WebElement bulbElement = driver.findElement(bulbLocator);
//        bulbElement.click();
        driver.findElement(By.xpath("//img[@alt='Smart Home Lightning']")).click();
    }
}
