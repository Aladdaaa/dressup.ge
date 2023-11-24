package StepObject;

import PageObject.RegistracionPage;

public class RegistrationPageSteps extends RegistracionPage {
    public RegistrationPageSteps GoToRegistration() {
        regBtn.click();
        return this;
    }

    public RegistrationPageSteps GoToRegistrationPage() {
        regPage.click();
        return this;
    }

    public RegistrationPageSteps FillEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public RegistrationPageSteps FillFirstName(String firstName) {
        nameInput.setValue(firstName);
        return this;
    }

    public RegistrationPageSteps FillLastName(String lastName) {
        lastnameInput.setValue(lastName);
        return this;
    }

    public RegistrationPageSteps FillSpecialNumber(String PersonalNumber) {
        specialNumber.setValue(PersonalNumber);
        return this;

    }

    public RegistrationPageSteps FillPassword(String Password) {
        passwordInput.setValue(Password);
        return this;
    }

    public RegistrationPageSteps FillCheckbox() {
        checkboxInput.click();
        return this;
    }

    public RegistrationPageSteps FillCheckbox2() {
        checkboxInput2.click();
        return this;
    }
}


