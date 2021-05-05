import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration extends PageObject {

    //elements on first form
    @FindBy(id = "email_create")
    private WebElement emailField;

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    //element on second form
    @FindBy(id = "id_gender1")
    private WebElement genderMrRadioButton;

    @FindBy(id = "id_gender2")
    private WebElement genderMsRadioButton;

    @FindBy(id = "customer_firstname")
    private WebElement firstnameField;

    @FindBy(id = "customer_lastname")
    private WebElement lastnameField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "days")
    public WebElement dayOfBirth;

    @FindBy(id = "months")
    private WebElement monthOfBirth;

    @FindBy(id = "years")
    private WebElement yearOfBirth;

    @FindBy(id = "newsletter")
    private WebElement newsletterCheckBox;

    @FindBy(id = "optin")
    private WebElement specialOffersCheckBox;

    //address part
    @FindBy(id = "firstname")
    private WebElement firstnameAddressField;

    @FindBy(id = "lastname")
    private WebElement lastnameAddressField;

    @FindBy(id = "company")
    private WebElement companyField;

    @FindBy(id = "address1")
    private WebElement addressLineOneField;

    @FindBy(id = "address2")
    private WebElement addressLineTwoField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postcodeField;

    @FindBy(id = "id_country")
    private WebElement country;

    @FindBy(id = "other")
    private WebElement additionalInfoField;

    @FindBy(id = "phone")
    private WebElement homePhoneField;

    @FindBy(id = "phone")
    private WebElement mobilePhoneField;

    @FindBy(id = "alias")
    private WebElement aliasField;

    @FindBy(id = "submitAccount")
    private WebElement submitAccountButton;

    @FindBy(className = "info-account")
    private WebElement welcomeMessage;

    @FindBy(id = "email")
    private WebElement loginEmailField;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    private WebElement signOutButton;


    public UserRegistration(WebDriver driver) {
        super(driver);
    }

    //methods for first form
    public void email(String email) {
        this.emailField.sendKeys(email);
    }

    public void clickSubmitButton() {
        this.submitButton.click();
    }

    //methods for second form
    public void genderMrRadioButton() {
        this.genderMrRadioButton.click();
    }

    public void genderMsRadioButton() {
        this.genderMsRadioButton.click();
    }

    public void firstnameField(String firstName) {
        this.firstnameField.sendKeys(firstName);
    }

    public void lastnameField(String lastName) {
        this.lastnameField.sendKeys(lastName);
    }

    public void passwordField(String password) {
        this.passwordField.sendKeys(password);
    }

    public void dayOfBirthSelect(String day) {
        Select stateSelect = new Select(this.dayOfBirth);
        stateSelect.selectByValue(day);
    }

    public void monthOfBirthSelect(String month) {
        Select stateSelect = new Select(this.monthOfBirth);
        stateSelect.selectByValue(month);
    }

    public void yearOfBirthSelect(String year) {
        Select stateSelect = new Select(this.yearOfBirth);
        stateSelect.selectByValue(year);
    }

    public void newsletterCheckBox() {
        this.newsletterCheckBox.click();
    }

    public void specialOffersCheckBox() {
        this.specialOffersCheckBox.click();
    }

    //address part
    public void firstnameAddressField(String firstNameAddress) {
        this.firstnameAddressField.sendKeys(firstNameAddress);
    }

    public void lastnameAddressField(String lastNameAddress) {
        this.lastnameAddressField.sendKeys(lastNameAddress);
    }

    public void companyField(String company) {
        this.companyField.sendKeys(company);
    }

    public void addressLineOneField(String address) {
        this.addressLineOneField.sendKeys(address);
    }

    public void addressLineTwoField(String address) {
        this.addressLineTwoField.sendKeys(address);
    }

    public void cityField(String city) {
        this.cityField.sendKeys(city);
    }

    public void stateSelect(String state) {
        Select stateSelect = new Select(this.state);
        stateSelect.selectByVisibleText(state);
    }

    public void postcodeField(String postcode) {
        this.postcodeField.sendKeys(postcode);
    }

    public void countrySelect(String country) {
        Select stateSelect = new Select(this.country);
        stateSelect.selectByVisibleText(country);
    }

    public void additionalInfoField(String additionalInfo) {
        this.additionalInfoField.sendKeys(additionalInfo);
    }

    public void homePhone(String homePhone) {
        this.homePhoneField.sendKeys(homePhone);
    }

    public void mobilePhoneField(String mobilePhone) {
        this.mobilePhoneField.sendKeys(mobilePhone);
    }

    public void aliasField(String alias) {
        this.aliasField.sendKeys(alias);
    }

    public void submitAccountButton() {
        this.submitAccountButton.click();
    }

    public String result() {
        return this.welcomeMessage.getText();
    }

    public void loginEmailField(String email) {
        this.loginEmailField.sendKeys(email);
    }

    public void loginButton() {
        this.loginButton.click();
    }

    public void signOutButton() {
        this.signOutButton.click();
    }


}
