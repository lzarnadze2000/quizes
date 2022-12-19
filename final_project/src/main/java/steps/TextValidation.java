package steps;

import com.codeborne.selenide.Condition;
import data.checkTextData;
import pages.Error;

import static com.codeborne.selenide.Condition.exactText;

public class TextValidation {
    checkTextData message=new checkTextData();
Error error= new Error();
    public TextValidation check (){
        error.Error.shouldHave(Condition.attribute(message.message));
        return this;
    }
    public void Visible (){
        error.isVisibleUser.shouldHave(Condition.attribute("testAutomation"));
    }
    public  void welcome(){
        error.welcome.shouldHave(Condition.attribute(message.Welcomedata));
    }
}
