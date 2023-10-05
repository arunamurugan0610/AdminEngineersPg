package Employee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteEmployee {

		public static void main(String[] args){
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
driver .get("https://3.110.102.12");
driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");		
driver.findElement(By.cssSelector("button[type='submit']")).click();
driver.findElement(By.xpath("//li[3]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
// try{
// 			driver.findElement(By.xpath("//button[normalize-space()='Add New Employee']")).click();
// 		}catch(StaleElementReferenceException e){
// 			driver.findElement(By.xpath("//button[normalize-space()='Add New Employee']")).click();
// 		}
//			driver.findElement(By.cssSelector("input[placeholder='Enter full name']")).sendKeys("Aruna");
//			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[2]/input")).sendKeys("Murugan");
//			driver.findElement(By.cssSelector("input[placeholder='Enter mobile number']")).sendKeys("9876543211");
//			driver.findElement(By.cssSelector("input[placeholder='Enter emergency number']")).sendKeys("9876543211");
//			driver.findElement(By.cssSelector("input[placeholder='Enter email address']")).sendKeys("test123@gmail.com");
//			driver.findElement(By.cssSelector("input[placeholder='Enter aadhar number']")).sendKeys("234567893456");
//			driver.findElement(By.cssSelector("textarea[placeholder='Enter address']")).sendKeys("Address");
//		       CharSequence[]	dob ={"23-09-2023"};
//		         WebElement dob_field = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[3]/input"));
//				    dob_field.click();
//				    dob_field.clear();			    
//				    dob_field.sendKeys(dob);
//				    dob_field.sendKeys(Keys.ENTER);				 
//					CharSequence[]	doj ={"23-09-2023"};
//			         WebElement doj_field = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[4]/input"));
//			         doj_field.click();
//			         doj_field.clear();			    
//			         doj_field.sendKeys(dob);
//			         doj_field.sendKeys(Keys.ENTER);
//			         WebElement role = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[7]/select")); // Replace with the actual element locator
//			            Select employeeRole = new Select(role);
//			            employeeRole.selectByVisibleText("manager");     
//			            WebElement gender = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[8]/select")); // Replace with the actual element locator
// 			            Select genderOption = new Select(gender);
//                       genderOption.selectByVisibleText("Female");  
//  
// 		WebElement selectField =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[15]/div/div/div[1]/div[2]/input"));
// 		selectField.sendKeys("Testing Team");
// 	    selectField.sendKeys(Keys.ENTER);
//driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
//driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[5]/div/div/span[2]")).click();
//driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[5]/div/div/span[2]")).click();
driver.findElement(By.xpath("//button[@id='btn-yes-1']")).click();
boolean name =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[2]/div/a")).getText().contains("Michael antony");
if(name){
	System.out.println("Employee Deleted");
}else{
	System.out.println("Employee Not Deleted");

}
   //driver.close();
                
	}

}
