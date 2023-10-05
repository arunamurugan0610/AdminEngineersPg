package loginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvalidEmailValidPassword {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver .get("https://3.110.102.12/login");
		driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();	
		driver.findElement(By.cssSelector("#email_id")).sendKeys("admin");
		driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
//		String loggedInUrl = driver.getCurrentUrl();
//		System.out.println(loggedInUrl);
		
		boolean message = driver.findElement(By.xpath("//span[@class='text-error']")).getText().contains("Email Id is invalid");

		if (message){
             System.out.println("Login Passed");
		}else{ 
			System.out.println("Login Failed");
			
		}
		driver.close();
	}




	}


