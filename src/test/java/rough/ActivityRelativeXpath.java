package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityRelativeXpath {

    /*
    In retail App click on Videos Games then choose PS5 console
    then click on add to cart
    Only use relative xpath.
    Push to Your GitHub Repository

     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
    }
}
