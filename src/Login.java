import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	
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
		// System.out.println(driver.getPageSource());
		System.out.println("Title of the page is: " + driver.getTitle());
		System.out.println("Project URL is: " + driver.getCurrentUrl());
		// driver.get(driver.getCurrentUrl());
		// driver.navigate.to(driver.getCurrentURL());

		driver.navigate().refresh();
		driver.get("https://www.google.com/");
		// driver.navigate().to("http://www.yahoo.com");
		System.out.println("Title of the page is: " + driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		String expectedTitle = "Otava";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Verification Successful - The correct title is displayed on the web page.");
		} else {
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
		}

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
		//driver.close();

	}
		
}