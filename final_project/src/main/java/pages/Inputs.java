package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Inputs {
    public SelenideElement
         firstName= $(By.id("firstname")),
            lastname= $(By.id("lastname")),
         userName=  $(By.id("userName")),
       password= $(By.id("password")),
//        Selenide robot= (Selenide) $(By.className("recaptcha-checkbox-border"));
        username= $(By.id("userName")),
    Password=$(By.id("password")),

    searching=$("#form-control");
    }

