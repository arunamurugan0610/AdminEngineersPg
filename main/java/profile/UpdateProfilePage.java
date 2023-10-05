package profile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateProfilePage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//li[14]//a[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
        WebElement nameTextBox= driver.findElement(By.xpath("//input[@placeholder='Enter full name']"));
        WebElement PhoneTextBox = driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']"));
        nameTextBox.sendKeys(Keys.CONTROL + "a");
        nameTextBox.sendKeys(Keys.DELETE);       
        PhoneTextBox.sendKeys(Keys.CONTROL + "a");
        PhoneTextBox.sendKeys(Keys.DELETE);
        nameTextBox.sendKeys("Admin Test");
        PhoneTextBox.sendKeys("9876543211");
        
        WebElement fileInput = driver.findElement(By.xpath("//input[@name='myfile']"));
        String imagePath = "C:/Users/Yuvasri/Downloads/dummy/Cute-Books-Pfp.jpg"; 

        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", fileInput);
        fileInput.sendKeys(imagePath);
	
	driver.findElement(By.xpath("//button[normalize-space()='Update Profile']")).click();
	
	 boolean name = driver.findElement(By.xpath("//input[@placeholder='Enter full name']")).getAttribute("value").contains("Admin Test");
	 boolean mobileNo =   driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).getAttribute("value").contains("9876543211");
	 boolean profilePicture = driver.findElement(By.xpath("//img[@alt='...']")).getAttribute("src").contains("https://d2v4bybytnkmx7.cloudfront.net/Image/Cute-Books-Pfp.jpg");
	 if (name){
			System.out.println("Updated name textbox");
		} if(mobileNo){
			System.out.println("Updated Phone Number");
		}if(profilePicture){
			System.out.println("Updated profile Picture");
		}
		else{
			System.out.println("No updated data");
		}
		driver.close();
	
	}
	

}
