package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//anast//eclipse-workspace//SeleniumJavaBatch9//Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.navigate().to("https://google.com");
        Thread.sleep(1000); // pauses the thread for the given milliseconds
        driver.navigate().back(); // goes back to the previous link
        Thread.sleep(1000);
        driver.navigate().forward(); // goes forward to the website
        Thread.sleep(1000);
        driver.navigate().refresh(); // refreshes the page
        //driver.quit(); // will quit the whole browser
        driver.close(); // will close the current tab
    }
}
