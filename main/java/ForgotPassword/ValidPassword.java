package ForgotPassword;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidPassword {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'hover:text-primary hover:underline hover:cursor-pointer transition duration-200')]")).click();
		driver.findElement(By.cssSelector("#usermail")).sendKeys("arunkumar.v@quantzi.in");

		driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
		Scanner sc = new Scanner(System.in);
         System.out.print("Enter a OTP: ");
        String number = sc.nextLine();
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            WebElement otpInputField = driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character "+(i+1)+"']")); // Adjust the locator based on your page's structure.
            otpInputField.sendKeys(String.valueOf(digit));
            driver.findElement(By.xpath("//button[normalize-space()='Verify']")).click();
        } 
        driver.findElement(By.xpath("//div[@class='mb-3']//input[@id='password']")).sendKeys("Qwerty@1234");
            driver.findElement(By.xpath("//div[@class='mb-3 ']//input[@id='password']")).sendKeys("Qwerty@1234");
           
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/form/div[4]/button")).click();
            String loggedInUrl = driver.getCurrentUrl();
   		 System.out.println("URL after logging in: " + loggedInUrl);

   		boolean otppage = false;
   		if (driver.getCurrentUrl().equals("http://192.168.1.33:3000/login")){
   		System.out.println("Password Changed Passed");
   		}else{
   			System.out.println("Password changed Failed");
   			otppage = true;
   		}
	}

}
