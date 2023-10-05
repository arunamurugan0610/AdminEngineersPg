package specificTenant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PollHistory {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		 driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");		
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/ul/li[5]/a")).click();
driver.findElement(By.xpath("//div[contains(text(),'Kamal raj')]")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[1]/div/div/div[7]")).click();   
boolean Title =driver.findElement(By.xpath("//a[normalize-space()='Dinner for october four']")).getText().contains("Dinner For October Four");
boolean RespondedOn = driver.findElement(By.xpath("//div[normalize-space()='03-10-2023 17:10:25 pm']")).getText().contains("03-10-2023 17:10:25 pm");
boolean response = driver.findElement(By.xpath("//div[normalize-space()='Yes']")).getText().contains("Yes");
if(Title){
	System.out.println("Title listing Passed");
}if(RespondedOn){
	System.out.println("Responded ON lISTING PASSED");
}if(response){
	System.out.println("reponse listing Passed");
}else{
	System.out.println("poll History listing failed");
}
driver.close();
	}

}
