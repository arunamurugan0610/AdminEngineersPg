package ForgotPassword;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MandatoryCheckInOTP {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver .get("https://3.110.102.12/login");
		        driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
		        driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
				driver.findElement(By.xpath("//span[contains(@class,'hover:text-primary hover:underline hover:cursor-pointer transition duration-200')]")).click();
				driver.findElement(By.cssSelector("#usermail")).sendKeys("arunkumar.v@quantzi.in");

				driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
				
				driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/form/div[3]/button")).click();
				
			boolean message =	driver.findElement(By.xpath("//small[contains(@class,'text-error')]")).getText().contains("Otp is Required");
				if(message){
					System.out.println("OTP mandatory Check Passed");
				}else{
					System.out.println("OTP mandatory Check Failed");
				}
                driver.close();
	}

}
