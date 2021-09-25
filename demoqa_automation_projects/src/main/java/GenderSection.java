import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.function.BooleanSupplier;

public class GenderSection extends BasePage{

    private final By maleLabelLocator = new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleLabelLocator = new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherLabelLocator = new By.ByCssSelector("label[for='gender-radio-3']");
    public enum Gender{MALE, FEMALE, OTHER}

    private final By maleRadioButtonLocator =By.id("gender-radio-1");
    private final By femaleRadioButtonLocator =By.id("gender-radio-2");
    private final By otherRadioButtonLocator =By.id("gender-radio-3");

    public GenderSection(WebDriver driver) {
        super(driver);
    }
    public BooleanSupplier clickRadioButton(Gender gender){
        switch (gender){
            case MALE:
                click(maleLabelLocator);
                break;
            case FEMALE:
                click(femaleLabelLocator);
                break;
            case OTHER:
                click(otherLabelLocator);
                break;
        }

        return null;
    }
    public boolean clickRadioButtonChecked(Gender gender){
        boolean isChecked=false;
        switch (gender){
            case FEMALE:
                isChecked=isSelected(femaleRadioButtonLocator);
                break;
            case MALE:
                isChecked=isSelected(maleRadioButtonLocator);
                break;
            case OTHER:
                isChecked=isSelected(otherRadioButtonLocator);
                break;
        }
        return isChecked;
    }
}
