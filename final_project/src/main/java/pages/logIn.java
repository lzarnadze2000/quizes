package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class logIn {

    public logIn open(){
        Selenide.open("https://demoqa.com/login");
        return  this;
    }
}
