import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends PageObject {

    @FindBy(xpath = "//*[@id=\"id_contact\"]/option[2]")
    private WebElement subjectHeadingCustomerService;

    @FindBy(xpath = "//*[@id=\"id_contact\"]/option[3]")
    private WebElement subjectHeadingWebmaster;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "id_order")
    private WebElement orderReference;

    @FindBy(id = "message")
    private WebElement message;

    @FindBy(id = "submitMessage")
    private WebElement submitButton;

    public ContactUs(WebDriver driver) {
        super(driver);
    }

    public void chooseCustomerService() {
        this.subjectHeadingCustomerService.click();
    }

    public void chooseWebmaster() {
        this.subjectHeadingWebmaster.click();
    }

    public void enterEmail(String email) {
        this.email.sendKeys(email);
    }

    public void enterOrderReference(String orderReference) {
        this.orderReference.sendKeys(orderReference);
    }

    public void enterMessage(String message) {
        this.message.sendKeys(message);
    }

    public void clickSubmitButton() {
        this.submitButton.click();
    }


}
