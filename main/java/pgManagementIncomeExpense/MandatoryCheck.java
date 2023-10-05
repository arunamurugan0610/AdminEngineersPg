package pgManagementIncomeExpense;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MandatoryCheck {

	public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver .get("http://192.168.1.12:3000/");
		driver.manage().window().maximize();
//         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
//         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
         driver.findElement(By.xpath("//div[contains(text(),'BoyS PG')]")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[9]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();
		driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[6]/button[2]")).click();
		boolean type = driver.findElement(By.xpath("//p[normalize-space()='Type is Required']")).getText().contains("Type is Required");
		boolean purpose = driver.findElement(By.xpath("//p[normalize-space()='title is Required']")).getText().contains("title is Required");
		boolean price = driver.findElement(By.xpath("//p[normalize-space()='Price is Required']")).getText().contains("Price is Required");
		boolean invoiceNo = driver.findElement(By.xpath("//p[normalize-space()='Invoice Number is Required']")).getText().contains("Invoice Number is Required");
		boolean description = driver.findElement(By.xpath("//p[normalize-space()='Description is Required']")).getText().contains("Description is Required");
		
		
		if(type){
			System.out.println("Type error - Passed");
		}if(purpose){
			System.out.println("purpose error - Passed");
		}if(price){
			System.out.println("price error - Passed");
		}if(invoiceNo){
			System.out.println("invoiceNo error - Passed");
		}if(description){
			System.out.println("description error - Passed");
		}else{
			System.out.println("No error - Failed");
		}
		driver.close();
				
	}

}
