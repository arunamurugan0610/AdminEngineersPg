package ForgotPassword;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OTPPageWithvalidEmail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver .get("https://3.110.102.12/login");
        driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();	
		driver.findElement(By.xpath("//span[contains(@class,'hover:text-primary hover:underline hover:cursor-pointer transition duration-200')]")).click();
		driver.findElement(By.cssSelector("#usermail")).sendKeys("arunkumar.v@quantzi.in");

		driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
		String loggedInUrl = driver.getCurrentUrl();
		 System.out.println("URL after logging in: " + loggedInUrl);

		boolean otppage = false;
		if (driver.getCurrentUrl().equals("http://192.168.1.33:3000/login")){
		System.out.println("OTP page is not displayed");
		}else{
			System.out.println("OTP page is displayed");
			otppage = true;
		}
		
		driver.close();
		
		
	}

}
