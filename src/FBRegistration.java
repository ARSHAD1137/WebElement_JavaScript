import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBRegistration
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("jack");
        Thread.sleep(3000);
        driver.findElement(By.name("lastname")).sendKeys("Sparrow");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email__")).sendKeys("a123@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("a123@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("jack123");
        Thread.sleep(3000);

        Select Day = new Select(driver.findElement(By.name("birthday_day")));
        Day.selectByValue("3");
        Thread.sleep(500);

        Select Month = new Select(driver.findElement(By.name("birthday_month")));
        Month.selectByVisibleText("Sep");
        Thread.sleep(500);
        Select Year = new Select(driver.findElement(By.name("birthday_year")));
        Year.selectByValue("1998");
        Thread.sleep(500);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='u_1_s_D3']")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
