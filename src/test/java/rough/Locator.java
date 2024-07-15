package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By singInLocator = By.xpath("//*[@id=\"signinLink\"]"); //locator the element
        WebElement singInElement = driver.findElement(singInLocator); //find the Element
        singInElement.click(); //performance

       By emailLocator = By.xpath("//*[@id=\"email\"]");
       WebElement emailElement = driver.findElement(emailLocator);
       emailElement.sendKeys("Saqib123@gmail.com");

       By passwordLocator = By.xpath("//*[@id=\"password\"]");
       WebElement passwordElement = driver.findElement(passwordLocator);
       passwordElement.sendKeys("Saqib@123");

       By loginBtnLocator = By.xpath("//*[@id=\"loginBtn\"]");
       WebElement loginBtnElement = driver.findElement(loginBtnLocator);
       loginBtnElement.click();

       Thread.sleep(3000);

       By tvLocator = By.xpath("//*[@class=\"image\"]");
       WebElement tvElement = driver.findElement(tvLocator);
       tvElement.click();

       Thread.sleep(3000);

       By logoutBtnLocator = By.id("logoutBtn");
       WebElement logoutBtnElement = driver.findElement(logoutBtnLocator);
       logoutBtnElement.click();





    }
}
