import com.sun.jna.Structure;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public  class WebFormsTest {
    WebDriver driver;
    @BeforeMethod
    public void open(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
@Test
    public  void First_Task() throws InterruptedException {
    driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html ");
    WebElement Python = driver.findElement(By.cssSelector("#dropdowm-menu-1 > option:nth-child(3)"));
    int cout = 0;
    Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));
    dropdown.selectByValue("python");
    if (Python.isSelected()) {
        System.out.println("python dropdown is selected");

    } else {
        dropdown.selectByIndex(3);
    }

    List<WebElement> CheckBoxes = driver.findElements(By.xpath("//*[@id=\"checkboxes\"]/label/input"));
//System.out.println(CheckBoxes.size());
    for (int i = 1; i <= CheckBoxes.size(); i++) {
        String value = "input[value=" +
                '"' + "option-" + i + '"' + "]";
        //System.out.println(i);
        if (!CheckBoxes.get(i - 1).isSelected()) {
            CheckBoxes.get(i - 1).click();
            cout++;
            //Thread.sleep(3000);
        } else {
            continue;
        }
    }
    System.out.println("On checkboxes there are clicked on bottoms by " + cout + " times");
    WebElement YellowBotton = driver.findElement(By.cssSelector(" input[value=\"yellow\"]"));
    YellowBotton.click();
    if (driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]")).isSelected()) {
        System.out.println("On Yellow button is clicked");
    }
    driver.findElement(By.cssSelector("option[value=\"orange\"]")).isDisplayed();
    Select FruitDropDown = new Select(driver.findElement(By.id("fruit-selects")));
    List<WebElement> options = FruitDropDown.getOptions();
    for (WebElement option : options) {
        if (option.isEnabled()) {
            continue;
        } else {
            System.out.println("The " + option.getText() + " is not Enable");
        }
    }

}


    @AfterMethod
    public  void clothe(){
        driver.quit();
    }
}