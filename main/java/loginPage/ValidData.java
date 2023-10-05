package loginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidData {

	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver .get("https://3.110.102.12/");
//Valid Data: 
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		boolean loginPass= false;
		if (driver.getCurrentUrl().equals("https://3.110.102.12/app/dashboard")){
             System.out.println("Login Passed");
		}else{ 
			System.out.println("Login Failed");
			 loginPass=true;
		}
	driver.close();
	}

}
