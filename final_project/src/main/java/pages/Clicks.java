package pages;

import com.codeborne.selenide.SelenideElement;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Clicks {

    public SelenideElement newUser =$(By.id("newUser"));



    public SelenideElement register = $(By.id("register"));
    public SelenideElement Login = $(By.xpath("//*[@id=\"userForm\"]/div[4]/div[1]"));

    public SelenideElement gostore = $(By.id("gotoStore"));

    public SelenideElement firstBook= $(By.xpath("//*[@id=\"see-book-Git Pocket Guide\"]/a"));

    public SelenideElement Logout=$(By.id("submit"));
}

