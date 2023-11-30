import StepObject.CartPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends ChromeRunner {
    CartPageSteps CartPageSteps = new CartPageSteps();
    @Test
    @Description("Add To Cart")
    public void CartPageCheck(){
        CartPageSteps
                .goToManSection()
                .clickManClothing()
                .goTosuit()
                .viewImage1()
                .viewImage2()
                .addingCart();
        Assert.assertTrue(CartPageSteps.checkoutBtn.is(Condition.visible));
    }
    @Test
    public void NegativeCartPageCheck(){
        CartPageSteps
                .goToManSection()
                .clickManClothing()
                .goTosuit()
                .viewImage1()
                .viewImage2();
        Assert.assertFalse(CartPageSteps.checkoutBtn.is(Condition.visible));
    }




}
