package Maven_ExampleA.ExampleA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	   System.out.println("Print the program");
    	   System.setProperty("webdriver.chrome.driver","D:\\Driver File\\chromedriver.exe");
    	   WebDriver driver = new ChromeDriver();
    	   driver.get("https://www.google.com");
    	  // driver.get("https://www.facebook.com/login/identify?ctx=recover");
    	  // driver.get("http://www.facebook.com/");
    	   driver.manage().window().maximize();
    	   WebElement elm =driver.findElement(By.partialLinkText("Gmail"));
    	  // WebElement elm=driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]"));
    	   elm.click();
    	 //  System.out.println("Facebook Login");
    	  // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	   driver.close();
    }
}
