import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DressupTest extends ChromeRunner {
    RegistrationPageSteps RegistrationPageSteps = new RegistrationPageSteps();
    @Test
    public void Dressuptest(){
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

}
