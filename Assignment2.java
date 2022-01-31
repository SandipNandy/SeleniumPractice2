import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.Keys;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Farhan Aktar");
		// Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("FarAktar123@gmail.com");
		// Thread.sleep(1000);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("FarAktar986");
		// Thread.sleep(1000);
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inlineRadio2")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='date' and @name='bday']")).sendKeys("0206");
		driver.findElement(By.xpath("//input[@type='date' and @name='bday']")).sendKeys(Keys.ARROW_RIGHT);
		driver.findElement(By.xpath("//input[@type='date' and @name='bday']")).sendKeys("1974");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//h4//input")).sendKeys("Hi!!");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
		System.out.println(
				driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		String y = driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText();
		Assert.assertEquals(y, "×" + "\n" + "Success! The Form has been submitted successfully!.");
	}

}
