import com.codeborne.selenide.Condition;
import data.checkTextData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.logIn;

import steps.TextValidation;
import steps.clickElement;
import steps.fillInputs;
import steps.fillInputs2;
import pages.Inputs;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;
import static java.awt.SystemColor.info;

public class final_testing {
    Inputs search=new Inputs();
    logIn logPage= new logIn();
   clickElement clickonit=new clickElement();
    fillInputs setItems=new fillInputs();
    fillInputs2 setItems2= new fillInputs2();
    TextValidation validate=new TextValidation();
    checkTextData checkdata=new checkTextData();



    @Test
    public  void Task1(){
        logPage.open();
clickonit.clickNewUser();
        setItems.setFirstname()
                .setLastname()
                .setUsername()
                .setPassword();
        clickonit.clickregister();
        validate.check();

        setItems2.setFirstname()
                .setLastname()
                .setUsername()
                .setPassword();
        validate.check();

    }

    @Test
    public  void Task2(){
        logPage.open();
setItems.setlogUserName()
        .setlogPassword();
clickonit.clicktheLogIn();
validate.Visible();
    }

    @Test
    public void Task3(){
        logPage.open();
        setItems.setlogUserName()
                .setlogPassword();
        clickonit.clicktheLogIn();
clickonit.GpToStore();
clickonit.firstBook();
      String ISBN= $(new By.ById("ISBN-label")).getValue();
      open("https://bookstore.toolsqa.com/swagger/#/BookStore/BookStoreV1BookGet");
        $(By.id("btn try-out__btn")).click();
        $("#invalid").setValue(ISBN);
$("#response-col_status").shouldHave(Condition.attribute("200"));
String title= $("#col_header parameters-col_description").getValue();
String UI= $("#col_header response-col_description").getValue();
if(title==UI){
    System.out.println("these items is same");
}
    }

    @Test void  Task4(){
        logPage.open();
        setItems.setlogUserName()
                .setlogPassword();
        clickonit.clicktheLogIn();
        clickonit.GpToStore();
        String title= String.valueOf($(By.id("see-book-Git Pocket Guide")));
        search.searching.setValue(title);
        $(By.id("see-book-Git Pocket Guide")).shouldHave(Condition.attribute(title));

    }
@Test void Task5(){

        logPage.open();
    setItems.setlogUserName()
            .setlogPassword();
    clickonit.clicktheLogIn();
clickonit.logout();
validate.welcome();
}
}
