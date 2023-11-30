package StepObject;

import PageObject.CartPage;
import PageObject.GiftCartPageObject;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;

public class GiftCartPageSteps extends GiftCartPageObject {
    CartPage cartPage= new CartPage();
    public GiftCartPageSteps goToGiftCart(){
        giftCartButton.click();
        return this;

    }
    public GiftCartPageSteps chooseTheAmount() {
        selectprice.selectOptionByValue("475");
        return this;
    }
    public GiftCartPageSteps addIntoCart() {
        addCartBtn.click();
       cartPage.checkoutBtn.shouldBe(Condition.visible, Duration.ofMillis(10000));
        return this;
    }
    public GiftCartPageSteps deleteItem() {
        removeBTN.click();
        noItem.shouldBe(Condition.visible, Duration.ofMillis(10000));
        return this;
    }


}
