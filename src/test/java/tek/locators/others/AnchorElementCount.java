package tek.locators.others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AnchorElementCount {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        By anchorLocation = By.tagName("a");
        List<WebElement> anchorElement = driver.findElements(anchorLocation);
        System.out.println(anchorElement.size());


        driver.quit();
    }
}
