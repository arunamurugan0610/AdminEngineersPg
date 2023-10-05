package complaintManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommentInComplaint {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver .get("https://3.110.102.12/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();		
		driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();	
        driver.findElement(By.xpath("//span[normalize-space()='Compliant Management']")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[8]/div/div/span")).click();

	driver.findElement(By.xpath("//*[@id='root']/div[2]/div[1]/main/div/div/div/div[3]/div/div/div[4]/div[1]/p")).sendKeys("Checking Testing");
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div[4]/button")).click();
	boolean messageExist =driver.findElement(By.xpath("//p[contains(text(),'Checking Testing')]")).getText().contains("Checking Testing");
	if(messageExist){
		System.out.println("Message Exist - Passed");
	}else{
		System.out.println("Message Exist - Failed");
	}
	//driver.close();
	
	}

}
