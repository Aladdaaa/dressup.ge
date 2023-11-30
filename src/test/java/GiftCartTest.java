import PageObject.CartPage;
import StepObject.GiftCartPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftCartTest extends ChromeRunner {
    GiftCartPageSteps giftCartPageSteps= new GiftCartPageSteps();
    CartPage cartPage= new CartPage();
    @Test
    @Description("GIftCart")
    public void setGiftCartPageSteps(){
        giftCartPageSteps
                .goToGiftCart()
                .chooseTheAmount()
                .addIntoCart();
        Assert.assertTrue(cartPage.checkoutBtn.is(Condition.visible));
    }
    @Test
    @Description("GIftCart")
    public void NegativesetGiftCartPageSteps() {
        giftCartPageSteps
                .goToGiftCart()
                .chooseTheAmount()
                .addIntoCart()
                .deleteItem();
        Assert.assertFalse(cartPage.checkoutBtn.is(Condition.visible));
    }
}
