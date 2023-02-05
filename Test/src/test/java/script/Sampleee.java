package script;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Sampleee
	{
	WebDriver driver;
	@BeforeMethod
	public void start()
	{
			   WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
			   driver.get("http://localhost:8888/");
			   driver.manage().window().maximize();
	}	
	@Test
	public void testcase()
	{
	           driver.findElement(By.name("user_name")).sendKeys("admin");
			   driver.findElement(By.name("user_password")).sendKeys("admin");
			   driver.findElement(By.id("submitButton")).click();
			   driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			   driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
	}
	@AfterMethod
	public void end()
	{
		driver.findElement(By.xpath("(//td[@class='small'])[2]")).click();
	    driver.findElement(By.linkText("Sign Out")).click();
	}
	}

