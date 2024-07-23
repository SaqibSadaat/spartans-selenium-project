package tek.reviewsession.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
public class ActivityByMohammad {
    /*
   in retail sign in with valid credentials and go to account page.
   update phone number. and validate Success toast is displayed.
   your test should work without changing multiple time.
   Apply implicit and explicit wait.
   use any locators available and you like.
   push to repository.
    */
    public static void main(String[] args) {
        // Initialize the WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the specified URL
        driver.get("https://retail.tekschool-students.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set an implicit wait of 15 seconds for all elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Create an explicit wait with a timeout of 15 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the "Sign in" link is clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")))
                .click();

        // Wait until the email input field is visible and enter the email address
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")))
                .sendKeys("mohammad2536@gmail.com");

        // Wait until the password input field is visible and enter the password
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")))
                .sendKeys("Password@123");

        // Wait until the login button is clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")))
                .click();

        // Wait until the "Account" link is clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account")))
                .click();

        // Wait until the phone number input field is visible
        WebElement phoneElement = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.name("phoneNumber")));

        // Clear the current phone number in the input field
        phoneElement.clear();

        // Generate a random 10-digit phone number
        String number = getRandomPhoneNumber();
        System.out.println("random number " + number); // Print the generated phone number to the console
        phoneElement.sendKeys(number);// Enter the generated phone number into the input field

        // Wait until the personal update button is clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(By.id("personalUpdateBtn")))
                .click();

        // Wait until the toast message is visible and check if it is displayed
        boolean isToastDisplayed = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.className("Toastify"))).isDisplayed();

        // Get the text of the toast message
        String toastText = wait.until(ExpectedConditions.
                visibilityOfElementLocated
                        (By.cssSelector(".Toastify div.Toastify__toast-body > div:last-child")))
                .getText();

        System.out.println(toastText);// Print the toast message text to the console

        // Check if the toast message is displayed and print the test result to the console
        if (isToastDisplayed)
            System.out.println("Test Passed: Toast Displayed");
        else
            System.out.println("Test Failed");

        // Close the browser and quit the WebDriver session
        driver.quit();
    }

    // Method to generate a random 10-digit phone number
    private static String getRandomPhoneNumber() {
        // Create a Random object
        Random random = new Random();

        // StringBuilder to build the phone number
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) { // Generate 10 random digits
            int digit = random.nextInt(10); // Generate a random digit between 0 and 9
            sb.append(digit); // Append the digit to the StringBuilder
        }

        // Convert StringBuilder to String and return it
        return sb.toString();
    }
}
