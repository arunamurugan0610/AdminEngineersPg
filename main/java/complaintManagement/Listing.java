package complaintManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listing {

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
	    driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div/div/div[3]/table/tbody/tr[1]/td[7]/div/div")).click();
boolean booleanPopUpPage =driver.findElement(By.xpath("//h3[normalize-space()='Description']")).getText().contains("Description");	
boolean description = driver.findElement(By.xpath("/html/body/div/div[4]/div/div")).getText().contains("the food is worst..");
if(booleanPopUpPage){
		System.out.println("Description pop up page displayed - Passed");
	}if(description){
		System.out.println("Description content in pop up page displayed - Passed");
	}else{
		System.out.println("Description pop up page displayed - Failed");
	}	
	driver.close();
	}

}
