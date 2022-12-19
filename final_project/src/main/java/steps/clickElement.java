package steps;

import com.codeborne.selenide.SelenideElement;
import pages.Error;
import pages.Clicks;

public class clickElement {

    Clicks clickonit=new Clicks();

    public void  clickNewUser(){
      clickonit.newUser.click();
    }
    public void  clickregister(){
        clickonit.register.click();
    }
    public void  clicktheLogIn(){
        clickonit.Login.click();
    }
    public void  GpToStore(){
        clickonit.gostore.click();

    }
    public  void firstBook(){
        clickonit.firstBook.click();
    }
    public  void logout(){
        clickonit.Logout.click();
    }

}
