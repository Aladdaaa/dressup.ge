import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Description;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPageTest extends ChromeRunner {
    RegistrationPageSteps RegistrationPageSteps = new RegistrationPageSteps();
    @Test
    @Description("dressup")
    public void PositiveRegistrationPageTest(){
        RegistrationPageSteps
                .GoToRegistration()
                .GoToRegistrationPage()
                .FillEmail( email)
                .FillFirstName(firstName)
                .FillLastName(lastName)
                .FillSpecialNumber(personalNumber)
                .FillPassword(password)
                .FillCheckbox()
                .FillCheckbox2();
        Assert.assertTrue(RegistrationPageSteps.registrationButtonInput.is(Condition.visible));
    }
        @Test
    public void NegativeRegistrationPageTest(){
        RegistrationPageSteps
                    .GoToRegistration()
                    .GoToRegistrationPage()
                    .FillEmail( email)
                    .FillFirstName(firstName)
                    .FillLastName(lastName)
                    .FillSpecialNumber(personalNumber)
                    .FillCheckbox()
                    .FillCheckbox2()
                    .RegButtonClick();
            Assert.assertFalse(RegistrationPageSteps.massageInput.is(Condition.visible));



            Assert.assertTrue(RegistrationPageSteps.registrationButtonInput.is(Condition.visible));


        }

}
