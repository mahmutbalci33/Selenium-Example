import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{
    By searchBoxLocater= By.id("twotabsearchtextbox");
    By submitButtonLocator = By.id("nav-search-submit-button");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocater,text);
        click(submitButtonLocator);
    }
}
