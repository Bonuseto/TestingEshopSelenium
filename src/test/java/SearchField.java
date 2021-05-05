import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchField extends PageObject {

    @FindBy(id = "search_query_top")
    private WebElement searchField;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
    private WebElement productResult;

    public SearchField(WebDriver driver) {
        super(driver);
    }

    public void enterSearch(String searchRequest) {
        this.searchField.sendKeys(searchRequest);
    }

    public void pressSearchButton() {
        this.searchButton.click();
    }

    public String result() {
        return this.productResult.getText();
    }
}
