import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TransferQueue;

public class WebElementsTest {
    WebDriver driver;
     @BeforeMethod
    public  void open(){
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
     }
     @Test
     public void FindEllemnts() throws InterruptedException {
         driver.get("http://the-internet.herokuapp.com/dynamic_controls");
         driver.findElement(By.tagName("title"));
         System.out.println("The title of page is :" + driver.getTitle());
         WebElement button = driver.findElement(By.tagName("button"));
         System.out.println("button is enable and textContant is : " + button.getText());
         button.click();
         Thread.sleep(3000);
         if ( button.getText() !="Remove"){
             System.out.println("The text is changed and current text is:"+button.getText());
             WebElement message=driver.findElement(By.id("message"));
             System.out.println(message.getText());
         }else{
             System.out.println("Text is not changed");
             button.click();
         }
     }

     @Test
     public  void Manipulations() throws InterruptedException {
         driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
         WebElement button=driver.findElement(By.tagName("button"));
         int count=0;
         for(int i=1 ; i<4; i++){
             button.click();
             count=+i;
            System.out.println("button:"+i);
             Thread.sleep(3000);
         }
         WebElement thirdone=driver.findElement(By.cssSelector("button.added-manually:nth-child(3)"));
         System.out.println(thirdone.getText());
         System.out.println("the count of delete elements are :"+count);
         if (count==3){
             driver.findElements(By.cssSelector("button[class*='added']"));
             WebElement lastElement= driver.findElements(By.cssSelector("button[class*='added']")).get(2);
             lastElement.click();
             Thread.sleep(3000);
             count--;
         }
         if(count==2){
             System.out.println("the number of buttons are :" +count +" so elemnets has changed");

         }




     }

     @AfterMethod
    public void close(){
         driver.quit();
     }
}

