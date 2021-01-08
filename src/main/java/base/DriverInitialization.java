package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverInitialization {

    private static WebDriver driver;

    private DriverInitialization(){}

    public static WebDriver getSingletonInstance(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
