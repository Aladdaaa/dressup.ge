package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class RegistracionPage {
    public SelenideElement
            regBtn = $("#header-sign-in"),
            regPage = $(byXpath("  //*[@id=\"custuomer-auth-dropdown\"]/div/div[3]/div[4]/div/a")),
            emailInput = $(byXpath("//*[@id=\"customer-form\"]/section/div[1]/div[1]/input")),
            nameInput = $(byXpath("//*[@id=\"customer-form\"]/section/div[2]/div[1]/input")),
            lastnameInput = $(byXpath("//*[@id=\"customer-form\"]/section/div[3]/div[1]/input")),
            specialNumber = $(byXpath("//*[@id=\"customer-form\"]/section/div[4]/div[1]/input")),
            passwordInput = $(byXpath("//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/input")),
            checkboxInput = $("#ff_optin"),
            checkboxInput2 = $("#ff_newsletter"),

    registrationButtonInput = $(byXpath("//*[@id=\"customer-form\"]/footer/button"));
}

