import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_LastName_Email extends BaseTest{


    @Test
    public void setName(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.setName("Mahmut");
        Assertions.assertEquals("Mahmut",practiceFormPage.getName(),"Name is not correct!");
    }

    @Test
    public void setLastName(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.setLastName("BALCI");
        Assertions.assertEquals("BALCI", practiceFormPage.getLastName(),"Lastname is not correct!");
    }

    @Test
    public void setEmail(){
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.setEmail("1234@mail.com");
        Assertions.assertEquals("1234@mail.com", practiceFormPage.emailName(),"Email is not correct!" );
    }
}
