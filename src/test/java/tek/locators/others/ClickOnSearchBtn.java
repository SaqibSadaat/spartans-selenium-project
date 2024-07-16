package tek.locators.others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnSearchBtn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://Google.com");

        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Tek School");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"jZ2SBf\"]")).click();

        driver.findElement(By.xpath("//*[@class=\"tjvcx GvPZzd cHaqb\"]")).click();



    }
}
