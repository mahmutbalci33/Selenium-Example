import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected WebDriver driver;

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahmut\\IdeaProjects\\demoqa_automation_projects\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();

    }

    @BeforeEach
    public void beforeMethod(){
        driver=new ChromeDriver();
    }

     /*@AfterEach
    public void afterMethod(){
        driver.quit();
    }

    @AfterAll
    public  void tearDown(){
        driver.quit();
    }*/
}
