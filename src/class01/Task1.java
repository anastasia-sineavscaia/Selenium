package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//anast//eclipse-workspace//SeleniumJavaBatch9//Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        String title= driver.getTitle();
        String url= driver.getCurrentUrl();
        System.out.println(url+" "+title);
        driver.quit();


    }
}
