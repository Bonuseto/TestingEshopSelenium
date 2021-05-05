import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {

    public static final WebDriver driver = new ChromeDriver();

    @Test(priority = 0)
    public static void searchField() {
        driver.get(Utils.BASE_URL);
        SearchField searchField = new SearchField(driver);
        searchField.enterSearch("CHIFFON DRESS");
        searchField.pressSearchButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String expectedResult = "Printed Chiffon Dress";
        Assert.assertEquals(expectedResult, searchField.result());
    }

    @Test(priority = 1)
    public static void contactUs() {
        driver.get(Utils.CONTACT_US_URL);
        ContactUs contactUs = new ContactUs(driver);
        contactUs.chooseCustomerService();
        contactUs.enterEmail("test@gmail.com");
        contactUs.enterOrderReference("test");
        contactUs.enterMessage("test");
    }

    @Test(priority = 2)
    public static void userRegistration() {
        driver.get(Utils.AUTHENTICATION_URL);
        UserRegistration userRegistration = new UserRegistration(driver);
        userRegistration.email(Utils.USER_EMAIL);
        userRegistration.clickSubmitButton();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        userRegistration.genderMsRadioButton();
        userRegistration.firstnameField("Bilbo");
        userRegistration.lastnameField("Begins");
        userRegistration.passwordField(Utils.USER_PASSWORD);
        userRegistration.dayOfBirthSelect("10");
        userRegistration.monthOfBirthSelect("4");
        userRegistration.yearOfBirthSelect("1900");
        userRegistration.newsletterCheckBox();
        userRegistration.specialOffersCheckBox();
        userRegistration.firstnameAddressField("Bilbo");
        userRegistration.lastnameAddressField("Begins");
        userRegistration.companyField("Actum");
        userRegistration.addressLineOneField("Veleterzni");
        userRegistration.addressLineTwoField("Revolucni");
        userRegistration.cityField("Praha");
        userRegistration.stateSelect("Arizona");
        userRegistration.postcodeField("17000");
        userRegistration.countrySelect("United States");
        userRegistration.additionalInfoField("test");
        userRegistration.mobilePhoneField("776406043");
        userRegistration.aliasField("test");
        userRegistration.submitAccountButton();
        String expectedResultAfterRegistration = "Welcome to your account. Here you can manage all of your personal information and orders.";
        Assert.assertEquals(expectedResultAfterRegistration, userRegistration.result());
        userRegistration.signOutButton();
        userRegistration.loginEmailField(Utils.USER_EMAIL);
        userRegistration.passwordField(Utils.USER_PASSWORD);
        userRegistration.loginButton();
        String expectedResultAfterLogin = "Welcome to your account. Here you can manage all of your personal information and orders.";
        Assert.assertEquals(expectedResultAfterLogin, userRegistration.result());
        userRegistration.signOutButton();
    }

    @Test(priority = 3)
    public static void cart() {
        driver.get(Utils.PRODUCT_URL);
        Cart cart = new Cart(driver);
        cart.addToCartButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        cart.proceedToCheckout();
        cart.plusButton();
        cart.proceedToCheckoutSummaryStepButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        UserRegistration userRegistration = new UserRegistration(driver);
        userRegistration.loginEmailField(Utils.USER_EMAIL);
        userRegistration.passwordField(Utils.USER_PASSWORD);
        userRegistration.loginButton();
        cart.proceedToCheckoutAddressStepButton();
        cart.termOfServiceCheckBox();
        cart.proceedToCheckoutShippingStepButton();
        cart.payByBankWireButton();
        cart.confirmOrderButton();
        String expectedMessage = "Your order on My Store is complete.";
        String expectedPrice = "$35.02";
        Assert.assertEquals(expectedMessage, cart.orderConfirmation());
        Assert.assertEquals(expectedPrice, cart.orderConfirmationPrice());
    }

    @AfterSuite
    //Test cleanup
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
