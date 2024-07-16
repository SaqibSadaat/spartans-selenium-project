package tek.locators.others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

//        By signInLocator = By.linkText("Sign in");
//        WebElement signInElement = driver.findElement(signInLocator);
//        signInElement.click();

        driver.findElement(By.linkText("Sign in")).click();

        By createNewAccountBtnLocator = By.linkText("Create New Account");
        WebElement createNewAccountBtnElement = driver.findElement(createNewAccountBtnLocator);
        createNewAccountBtnElement.click();

        By nameLocator = By.id("nameInput");
        WebElement nameElement = driver.findElement(nameLocator);
        nameElement.sendKeys("Saqib");

        By emailLocator = By.id("emailInput");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("SaqibAf@gmail.com");

        By passwordLocator = By.id("passwordInput");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Saqib@123");

        By confirmPasswordLocator = By.id("confirmPasswordInput");
        WebElement confirmPasswordElement = driver.findElement(confirmPasswordLocator);
        confirmPasswordElement.sendKeys("Saqib@123");

        By signUpBtnLocator = By.id("signupBtn");
        WebElement signUpBtnElement = driver.findElement(signUpBtnLocator);
        signUpBtnElement.click();

        driver.quit();



    }
}
