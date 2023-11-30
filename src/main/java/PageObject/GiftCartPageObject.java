package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GiftCartPageObject {
    public SelenideElement
    giftCartButton = $(byXpath("//*[@id=\"header\"]/nav/div/div/div[1]/div/ul/li[1]/a")),
   selectprice= $("#group_13"),
    addCartBtn=  $("#add_to_cart"),
    removeBTN= $(".remove-from-cart"),
    noItem= $(".no-items");



}
