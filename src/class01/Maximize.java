package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//anast//eclipse-workspace//SeleniumJavaBatch9//Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        driver.manage().window().maximize(); // just makes the screen bigger
        Thread.sleep(2000);
        driver.manage().window().fullscreen(); // full screen doesn't show the tabs and the toolbar
        Thread.sleep(2000);
        driver.navigate().back();

    }
}
