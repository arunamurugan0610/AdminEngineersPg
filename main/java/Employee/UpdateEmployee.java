package Employee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateEmployee {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		 driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");		
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 driver.findElement(By.xpath("//li[3]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[5]/div/div/span[1]")).click();
		
		 WebElement updateName=driver.findElement(By.cssSelector("input[placeholder='Enter full name']"));
		 updateName.sendKeys(Keys.CONTROL + "a");
		 updateName.sendKeys(Keys.DELETE);
		 updateName.sendKeys("Aruna Murugan");
		 
		 WebElement updateFatherName=driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[2]/input"));
		 updateFatherName.sendKeys(Keys.CONTROL + "a");
		 updateFatherName.sendKeys(Keys.DELETE);
		 updateFatherName.sendKeys("Murugan I");
		 
		 WebElement updateMobileNo=driver.findElement(By.cssSelector("input[placeholder='Enter mobile number']"));
		 updateMobileNo.sendKeys(Keys.CONTROL + "a");
		 updateMobileNo.sendKeys(Keys.DELETE);
		 updateMobileNo.sendKeys("9876543209");
	
		 WebElement updateemergencyMobileNo=driver.findElement(By.cssSelector("input[placeholder='Enter emergency number']"));
		 updateemergencyMobileNo.sendKeys(Keys.CONTROL + "a");
		 updateemergencyMobileNo.sendKeys(Keys.DELETE);
		 updateemergencyMobileNo.sendKeys("9876543200");
	
		 WebElement updateAadharNo=driver.findElement(By.cssSelector("input[placeholder='Enter aadhar number']"));
		 updateAadharNo.sendKeys(Keys.CONTROL + "a");
		 updateAadharNo.sendKeys(Keys.DELETE);
		 updateAadharNo.sendKeys("456743217891");
	
		 WebElement updateAddress=driver.findElement(By.cssSelector("textarea[placeholder='Enter address']"));
		 updateAddress.sendKeys(Keys.CONTROL + "a");
		 updateAddress.sendKeys(Keys.DELETE);
		 updateAddress.sendKeys("No.2/A Gandhi Road Velachery - 600033");
	
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[15]/div/div/div[1]")).click();
    WebElement designation = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[15]/div/div/div[1]/div[2]/input"));
    designation.sendKeys("Testing Team");
    designation.sendKeys(Keys.ENTER);	
		 
		
	    driver.findElement(By.xpath("//div[7]//select[1]")).click();;
         driver.findElement(By.xpath("//option[contains(@value,'650ebad01dc99e97ac0a0c51')]")).click();   
	
         CharSequence[]	dob ={"23-09-2023"};
         WebElement dob_field = driver.findElement(By.xpath( "//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/div[3]/input[1]"));
		    dob_field.click();
		    dob_field.clear();			    
		    dob_field.sendKeys(dob);
		    dob_field.sendKeys(Keys.ENTER);
         
		    CharSequence[]	doj ={"23-09-2023"};
	         WebElement doj_field = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[2]/div[4]/input[1]"));
	         doj_field.click();
	         doj_field.clear();			    
	         doj_field.sendKeys(dob);
	         doj_field.sendKeys(Keys.ENTER);
        
	         driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
	         
	         WebElement Compare=  driver.findElement(By.xpath("//button[normalize-space()='Add New Employee']"));
             if(Compare.isDisplayed()){
          	   System.out.println("Employee updated");
             }else{
          	   System.out.println("Employee not updated");
             }
	
	driver.close();
	}

}
