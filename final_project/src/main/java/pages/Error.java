package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Error {
    public SelenideElement Error = $("#mb-1"),
    isSelectedRobot = $("#recaptcha-checkbox-border"),
    isVisibleUser=$(new By.ById("userName-value")),

     welcome=$(new By.ByTagName("h2"));

}
