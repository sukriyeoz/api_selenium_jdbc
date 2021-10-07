package selenium.proje01;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class first_UI_AccountCreationTest {

    WebDriver driver;
    Faker faker = new Faker();

    @Before
    public void setUpman(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        driver.manage().window().maximize();
    }


    @Test
    public void test() {

//2. Go to http://automationpractice.com/index.php
        driver.get("http://automationpractice.com/index.php");

//3. Click on sign in link
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

//4.Send your email and click on create an account button
        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();

//5.Verify the Text : CREATE AN ACCOUNT
        String actualText = driver.findElement(By.xpath("//*[@id=\"noSlide\"]/h1")).getText();
        String expectedText="CREATE AN ACCOUNT";
        Assert.assertEquals("CREATE AN ACCOUNT",actualText);
        Assert.assertTrue(actualText.contains("CREATE AN ACCOUNT"));

//6. Verify the Text : YOUR PERSONAL INFORMATION

//7. Verify the Text : Title
//8. Select your title
//9. Enter your first name
//10. Enter your last name
//11. Enter your email
//12. Enter your password
//13. ENTER DATE OF BIRTH
//14. Click on Sign up for our newsletter!
//15. Enter your first name
//16. Enter your last lane
//17. Enter your company
//18. Enter your Address
//19. Enter your City
//20. SELECT STATE
//21. Enter Postal Code
//22.SELECT COUNTRY
//23. Enter additional information
//24. Enter home phone
//25. Enter mobile phone
//26. Enter reference name
//27. Click Register
//20. Then verify MY ACCOUNT is displayed on the home page-SEE BELOW IMAGE


    }



}
