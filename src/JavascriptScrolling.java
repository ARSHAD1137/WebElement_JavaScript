import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

public class JavascriptScrolling
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com/");
        WebElement element = driver.findElement(By.cssSelector("div.body-wrap:nth-child(1) div.container.main-content.sticky-parent.ng-scope:nth-child(17) carousel-product-widget.ng-scope.ng-isolate-scope:nth-child(4) section.row.custom-component.carousel-section.ng-scope div.carousel-wrap.owl-pd-wrap div.owl-carousel.carouselGrid-inner.ng-scope.owl-loaded div.owl-stage-outer div.owl-stage div.owl-item:nth-child(5) > div.item.prod-deck.ng-scope"));

        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(3000);
        element.click();
    }
}
