package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
        public SelenideElement
                manBtn =$(byLinkText("Men")),
                manClothingButton=$(byClassName("af-radio-label")),
                suitScroll=$(byLinkText("SELECTED HOMME")),
                suitImmage1=$(byXpath("//*[@id=\"product-images-thumbs\"]/div[1]/div[2]/div/img")),
                suitImmage2=$(byXpath("//*[@id=\"product-images-thumbs\"]/div[1]/div[3]/div/img")),

                addCartBtn=$("#add_to_cart"),
                checkoutBtn=$(".mb-2");

}
