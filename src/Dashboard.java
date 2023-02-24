import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(2000);
		driver.findElement(By.linkText("IaaS")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("DRaaS")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("BaaS")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("M365")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("License")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Billing")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Reporting")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Dashboard")).click();
		Thread.sleep(2000);
	}

}
