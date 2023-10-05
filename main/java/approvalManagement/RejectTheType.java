package approvalManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RejectTheType {

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
	
	driver.findElement(By.xpath("//a[contains(@href,'/app/approval-management')]")).click();
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div/span[2]")).click();
	boolean approvedType = driver.findElement(By.xpath("//div[contains(text(),'gggggg')]")).getText().contains("Gggggg");
	if(approvedType){
		System.out.println("Rejected Passed");
	}else{
		System.out.println("Rejected Failed");
	}
	
	driver.close();
	

	}

}
