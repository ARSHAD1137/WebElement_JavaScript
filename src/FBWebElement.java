import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBWebElement
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","X:\\Selenium jar and drivers\\drivers\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]")).click();
        Thread.sleep(3000);

        WebElement first_Name = driver.findElement(By.name("firstname"));
        int f_nx = first_Name.getLocation().getX();
        int f_ny = first_Name.getLocation().getY();
        System.out.println("Coordinate of first name web element");
        System.out.println("X:"+f_nx +" "+ "Y:"+f_ny);
        int f_nh = first_Name.getSize().getHeight();
        int f_nw = first_Name.getSize().getWidth();
        System.out.println("Dimension of first name web element");
        System.out.println("Width:"+f_nw +" "+ "Height:"+f_nh);

        WebElement last_Name = driver.findElement(By.name("lastname"));
        int l_nx = last_Name.getLocation().getX();
        int l_ny = last_Name.getLocation().getY();
        System.out.println("Coordinate of last name web element");
        System.out.println("X:"+l_nx +" "+ "Y:"+l_ny);
        int l_nh = last_Name.getSize().getHeight();
        int l_nw = last_Name.getSize().getWidth();
        System.out.println("Dimension of last name web element");
        System.out.println("Width:"+l_nw +" "+ "Height:"+l_nh);

        if(f_nw==l_nw && f_nh==l_nh)
        {
            System.out.println("Dimension of first name and last name web element is equal");
        }
        else
        {
            System.out.println("Dimension of first name and last name web element is equal");
        }

        WebElement email_add = driver.findElement(By.name("reg_email__"));
        int e_ax = email_add.getLocation().getX();
        int e_ay = email_add.getLocation().getY();
        System.out.println("Coordinate of email address web element");
        System.out.println("X:"+e_ax +" "+ "Y:"+e_ay);
        int e_ah = email_add.getSize().getHeight();
        int e_aw = last_Name.getSize().getWidth();
        System.out.println("Dimension of email address web element");
        System.out.println("Width:"+e_aw +" "+ "Height:"+e_ah);

        WebElement passWord = driver.findElement(By.name("reg_passwd__"));
        int p_x = passWord.getLocation().getX();
        int p_y = passWord.getLocation().getY();
        System.out.println("Coordinate of password web element");
        System.out.println("X:"+p_x +" "+ "Y:"+p_y);
        int p_h = passWord.getSize().getHeight();
        int p_w = passWord.getSize().getWidth();
        System.out.println("Dimension of password web element");
        System.out.println("Width:"+p_w +" "+ "Height:"+p_h);

        if(e_ax==e_ay)
        {
            System.out.println("Email address and password having same X co-ordinate");
        }
        else
        {
            System.out.println("Email address and password having same X co-ordinate");
        }

        WebElement day = driver.findElement(By.name("birthday_day"));
        int d_h = day.getSize().getHeight();
        int d_w = day.getSize().getWidth();
        System.out.println("Dimension of day web element");
        System.out.println("Width:"+d_w +" "+ "Height:"+d_h);

        WebElement month = driver.findElement(By.name("birthday_day"));
        int m_h = month.getSize().getHeight();
        int m_w = month.getSize().getWidth();
        System.out.println("Dimension of month web element");
        System.out.println("Width:"+m_w +" "+ "Height:"+m_h);

        WebElement year = driver.findElement(By.name("birthday_day"));
        int y_h = year.getSize().getHeight();
        int y_w = year.getSize().getWidth();
        System.out.println("Dimension of year web element");
        System.out.println("Width:"+y_w +" "+ "Height:"+y_h);

        if(d_h==m_h && m_h==y_h && y_h==d_h && d_w==m_w && m_w==y_w && y_w==d_w)
        {
            System.out.println("Dimension of web element day, month and year is equal");
        }
        else
        {
            System.out.println("Dimension of web element day, month and year is not equal");
        }

        driver.quit();
    }
}
