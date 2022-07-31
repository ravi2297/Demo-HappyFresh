import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		// open url
		driver.get("https://m.happyfresh.id/");
		WebElement el = driver.findElement(By.xpath("//html"));
		el.sendKeys(Keys.TAB);

		Actions act = new Actions(driver);
		act.moveByOffset(0, 0).click().build().perform();

		driver.findElement(By.xpath("//*[@class='_lG5Al _1Ii0f _11Fec']")).click();

		driver.findElement(By.xpath("//*[@class='_1FWce']")).click();
		driver.findElement(By.xpath("//button[contains(@style,'color: white;')]")).click();
		
		
		
		// scroll to snacks
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		
		// add product from categories snacks

		driver.findElement(By.xpath("//*[text()='Snacks']")).click();
		driver.findElement(By.xpath("//*[@class='_3bfiA']")).click();
		driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
		
		// click on home for best deals product
		
		driver.findElement(By.xpath("//*[text()='Home']")).click();
		
			// close the banner
		
		driver.findElement(By.xpath("(//*[text()='x'])[2]")).click();
		// add product from best deals
		
		driver.findElement(By.xpath("//*[text()='Add']")).click();
		
		// search for a product 
		jse.executeScript("window.scrollBy(0,-800)");
		driver.findElement(By.xpath("//*[@class='_9k3Fq']")).click();
		driver.findElement(By.xpath("//*[@class='_3q3o9']")).sendKeys("chocolate");
		act.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//*[text()='Add']")).click();
		
		// click on add to cart button
		
		driver.findElement(By.id("icon-cart")).click();
		
		// click on checkout
		
		driver.findElement(By.xpath("//*[text()='Checkout']")).click();
		
		// click on register here
		
		driver.findElement(By.id("registration_link_id")).click();
		
		// generating random data 
		
		driver.findElement(By.id("firstName")).sendKeys(RandomStringUtils.randomAlphabetic(5));
		driver.findElement(By.id("lastName")).sendKeys(RandomStringUtils.randomAlphabetic(5));
		driver.findElement(By.id("phoneNumberShort")).sendKeys("8888888"+RandomStringUtils.randomNumeric(3));
		driver.findElement(By.id("email")).sendKeys(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12348888");
		driver.findElement(By.id("password-confirm")).sendKeys("12348888");
		Thread.sleep(3000);
		driver.findElement(By.id("submitButton")).click();


		
		
		
		
		
		
		
		
		
		
	}

}
