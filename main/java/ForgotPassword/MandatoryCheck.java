package ForgotPassword;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MandatoryCheck {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'hover:text-primary hover:underline hover:cursor-pointer transition duration-200')]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
		
		boolean message = driver.findElement(By.xpath("//span[@class='text-error']")).getText().contains("Email address is Required.");
		System.out.println(message);
	    if(message){
	    	System.out.println("Mandatory check of Forgot password passed");
	    }else{
	    	System.out.println("Mandatory check of Forgot password failed");
	    }
		
	    driver.close();
	}

}
