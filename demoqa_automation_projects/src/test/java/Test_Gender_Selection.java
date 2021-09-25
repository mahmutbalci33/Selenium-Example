import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Gender_Selection extends BaseTest{
    @Test
     public void check_male_radio_button(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Gender.MALE);
        Assertions.assertTrue(practiceFormPage.genderSection().clickRadioButtonChecked(GenderSection.Gender.MALE),
                "Male radio button is not checked");
     }

    @Test
    public void check_female_radio_button(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Gender.FEMALE);
        Assertions.assertTrue(practiceFormPage.genderSection().clickRadioButtonChecked(GenderSection.Gender.FEMALE),
                "FEMALE radio button is not checked");
    }

    @Test
    public void check_other_radio_button(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Gender.OTHER);
        Assertions.assertTrue(practiceFormPage.genderSection().clickRadioButtonChecked(GenderSection.Gender.OTHER),
                "OTHER radio button is not checked");
    }
}
