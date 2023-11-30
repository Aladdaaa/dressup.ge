package StepObject;

import PageObject.CartPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static DataObject.CartPageData.*;
import static com.codeborne.selenide.Selenide.sleep;

public class CartPageSteps extends CartPage {
    public CartPageSteps goToManSection(){
        manBtn.click();
        return this;
    }
    public CartPageSteps clickManClothing(){
        manClothingButton.click();
        return this;
    }
    public CartPageSteps goTosuit(){
        suitScroll.scrollTo().click();
        return this;
    }
    public CartPageSteps viewImage1(){
        suitImmage1.click();
        return this;
    }
    public CartPageSteps viewImage2(){
        suitImmage2.click();
        return this;
    }
    public CartPageSteps addingCart(){
        addCartBtn.click();
        checkoutBtn.shouldBe(Condition.visible, Duration.ofMillis(10000));
        return this;
    }


}
