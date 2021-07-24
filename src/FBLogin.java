import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class FBLogin
{
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.id("email")).sendKeys("testemail@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345678");
        Thread.sleep(500);

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File SourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File dstFile = new File("./Screenshot/" +"facebook-register-"+ System.currentTimeMillis() + ".png");
        //FileUtils.copyFile(SourceFile, Screenshot);
        FileHandler.copy(SourceFile,dstFile);
        Thread.sleep(3000);

        String homePageTitle = driver.getTitle();
        System.out.println("Tittle : " + homePageTitle);

        driver.findElement(By.name("login")).click();
        Thread.sleep(500);

        driver.quit();
    }
}
