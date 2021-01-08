package base;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    
    protected static WebDriver driver = null;
    private static String URL = "http://book.theautomatedtester.co.uk/";

    public BaseClass()
    {
        driver = DriverInitialization.getSingletonInstance();
    }

    //@Parameters("URL") to pass Parameter at runtime from testng.xml
    public static void OpenBrowser(){
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

        driver.get(URL);
    }


}
