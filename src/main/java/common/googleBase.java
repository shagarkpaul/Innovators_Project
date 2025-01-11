package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class googleBase {

    public WebDriver driver;

    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void closeCurrent(){

        driver.close();
    }

    public void closeAll(){

        driver.quit();
    }

}
