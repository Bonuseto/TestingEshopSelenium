import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends PageObject {

    @FindBy(name = "Submit")
    private WebElement addToCartButton;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/div/a[2]/span")
    private WebElement plusButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
    private WebElement proceedToCheckoutSummaryStepButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
    private WebElement proceedToCheckoutAddressStepButton;

    @FindBy(id = "cgv")
    private WebElement termOfServiceCheckBox;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
    private WebElement proceedToCheckoutShippingStepButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")
    private WebElement payByBankWireButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
    private WebElement confirmOrderButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/p/strong")
    private WebElement orderConfirmation;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/span/strong")
    private WebElement orderConfirmationPrice;


    public Cart(WebDriver driver) {
        super(driver);
    }

    public void addToCartButton() {
        this.addToCartButton.click();
    }

    public void proceedToCheckout() {
        this.proceedToCheckoutButton.click();
    }

    public void plusButton() {
        this.plusButton.click();
    }

    public void proceedToCheckoutSummaryStepButton() {
        this.proceedToCheckoutSummaryStepButton.click();
    }

    public void proceedToCheckoutAddressStepButton() {
        this.proceedToCheckoutAddressStepButton.click();
    }

    public void termOfServiceCheckBox() {
        this.termOfServiceCheckBox.click();
    }

    public void proceedToCheckoutShippingStepButton() {
        this.proceedToCheckoutShippingStepButton.click();
    }

    public void payByBankWireButton() {
        this.payByBankWireButton.click();
    }

    public void confirmOrderButton() {
        this.confirmOrderButton.click();
    }

    public String orderConfirmation() {
        return this.orderConfirmation.getText();
    }

    public String orderConfirmationPrice() {
        return this.orderConfirmationPrice.getText();
    }


}
