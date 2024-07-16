package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args) throws InterruptedException {

        //Open Browser Chrome Browser
        ChromeDriver chromeDriver = new ChromeDriver();

        //Use this Method to Maximize Browser
        chromeDriver.manage().window().maximize();

        //Navigate to a URL
        chromeDriver.get("https://google.com");

        //return String of Application title.
        String title = chromeDriver.getTitle();
        System.out.println(title);

        Thread.sleep(3000);
        //to Close browser entirely.
        chromeDriver.quit();

    }
}
