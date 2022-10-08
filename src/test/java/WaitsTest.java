import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.By.*;

public class WaitsTest {
    WebDriver driver;
    @BeforeMethod
    public void open(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

@Test
public void TheSecondTask(){
        driver.get("https://demoqa.com/progress-bar");
        driver.findElement(By.id("startStopButton")).click();
    WebElement progressBar= driver.findElement(By.xpath("//div[@role='progressbar']"));
    new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.attributeToBe(progressBar,"aria-valuenow", String.valueOf(50)));
}

    @AfterMethod
    public  void clothe(){
        driver.quit();
    }
}
