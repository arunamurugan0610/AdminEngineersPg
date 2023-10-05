package profile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExistedData {

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
 boolean name = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[1]/input")).getAttribute("value").contains("Admin");
 boolean mobileNo =   driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/input")).getAttribute("value").contains("9898075643");
 boolean emailID =   driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[3]/input")).getAttribute("value").contains("admin@engineerspg.com");

if (name){
	System.out.println("Existed name present");
}if(mobileNo){
	System.out.println("Existed MobileNo present");
}if(emailID){
	System.out.println("Existed emailID present");
}else{
	System.out.println("No existed data");
}
driver.close();

	}

}
