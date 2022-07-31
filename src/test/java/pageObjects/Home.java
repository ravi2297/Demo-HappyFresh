package pageObjects;

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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {

	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='_1FWce']")
	WebElement LocationOK;

	public void LaunchBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	public void openUrl(String url) {
		driver.get(url);
		WebElement el = driver.findElement(By.xpath("//html"));
		el.sendKeys(Keys.TAB);
		Actions act = new Actions(driver);
		act.moveByOffset(0, 0).click().build().perform();
		driver.findElement(By.xpath("//*[@class='_lG5Al _1Ii0f _11Fec']")).click();
		driver.findElement(By.xpath("//*[@class='_1FWce']")).click(); // location
		driver.findElement(By.xpath("//button[contains(@style,'color: white;')]")).click();
	}

	public void addSnackProduct() {
		// scroll to snacks
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");

		// add product from categories snacks

		driver.findElement(By.xpath("//*[text()='Snacks']")).click();
		driver.findElement(By.xpath("//*[text()='Add']")).click();

	}

	public void clickOnHome() {
		driver.findElement(By.xpath("//*[text()='Home']")).click();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void closeBanner() {
		driver.findElement(By.xpath("(//*[text()='x'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void addProductBestDeals() {
		driver.findElement(By.xpath("//*[text()='Home']")).click();
		driver.findElement(By.xpath("(//*[text()='x'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='Add']")).click();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void searchProduct(String product) {
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-800)");
		driver.findElement(By.xpath("//*[@class='_9k3Fq']")).click();
		driver.findElement(By.xpath("//*[@class='_3q3o9']")).sendKeys(product);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//*[text()='Add']")).click();
	}

	public void clickAddtoCart() {
		driver.findElement(By.id("icon-cart")).click();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void clickonCheckout() {
		driver.findElement(By.xpath("//*[text()='Checkout']")).click();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void clickonRegister() {
		driver.findElement(By.id("registration_link_id")).click();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void enterRegistrationDetails() {
		driver.findElement(By.id("firstName")).sendKeys(RandomStringUtils.randomAlphabetic(5));
		driver.findElement(By.id("lastName")).sendKeys(RandomStringUtils.randomAlphabetic(5));
		driver.findElement(By.id("phoneNumberShort")).sendKeys("8888888" + RandomStringUtils.randomNumeric(3));
		driver.findElement(By.id("email")).sendKeys(RandomStringUtils.randomAlphabetic(5) + "@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12348888");
		driver.findElement(By.id("password-confirm")).sendKeys("12348888");
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}

	public void clickonSubmitDetails() {
		driver.findElement(By.id("submitButton")).click();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}
	
	

}
