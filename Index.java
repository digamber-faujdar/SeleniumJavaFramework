import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Index {

    @BeforeMethod
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.spicejet.com/");
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(new By.ByXPath("//div[text()='Hotels']"))).build().perform();
        driver.close();
     }
     @Test
    public void mouseHover()
     {

     }
}
