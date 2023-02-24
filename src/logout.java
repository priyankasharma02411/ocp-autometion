import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.ncn.test.*;

public class logout {
	
	public static void main(String args[]) throws InterruptedException {
		// TODO Auto-generated method stub

		ApplicationProperties properties = new ApplicationProperties();
		String username = properties.readProperty("username");
		String password = properties.readProperty("password");
		System.out.println(username);
		System.out.println(password);
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opscenter.newcloudnetworks.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	
		String txt1 = driver.findElement(By.id("user-login")).getText();
		System.out.println(txt1);
		WebElement loginBtn = driver.findElement(By.id("user-login"));
		loginBtn.click();
		Thread.sleep(4000);
		WebElement elementName = driver.findElement(By.name("submit"));
		elementName.click();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		elementName.click();
		      
	      //Enter and clear text
	      WebElement d= driver.findElement(By.xpath("/html/body/app-root/app-main-dashboard/app-sidebar/aside/div[2]/ul/div/input"));
	      d.sendKeys("testing");
	      d.clear();
	      
	      driver.findElement(By.xpath("/html/body/app-root/app-main-dashboard/app-sidebar/aside/div[2]/div/ul/li[3]/div[1]/i")).click();
	     
	      Actions a = new Actions(driver);
	      a.moveToElement(driver.findElement(By.xpath("/html/body/app-root/app-main-dashboard/app-sidebar/aside/div[2]/div/ul/li[3]/div[2]/a[5]"))).build().perform();
	      driver.findElement(By.xpath("/html/body/app-root/app-main-dashboard/app-sidebar/aside/div[2]/div/ul/li[3]/div[2]/a[5]")).click();
	      
		//driver.close();

	}
		
		
}