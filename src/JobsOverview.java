import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobsOverview {

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
		Thread.sleep(3000);
	
		boolean buttonPresence = driver.findElement(By.xpath("/html/body/app-root/app-main-dashboard/app-dashboard/main/div[3]/div[1]/a[1]")).isDisplayed();
		boolean searchIconEnabled = driver.findElement(By.xpath("/html/body/app-root/app-main-dashboard/app-dashboard/main/div[3]/div[1]/a[1]")).isEnabled();
		boolean buttonSelected = driver.findElement(By.xpath("/html/body/app-root/app-main-dashboard/app-dashboard/main/div[3]/div[1]/a[1]")).isSelected();
		
		
	}
	

}
