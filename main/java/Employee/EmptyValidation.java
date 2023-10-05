package Employee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyValidation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try{		
			 driver .get("https://3.110.102.12/login");
	         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
	         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
			 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
			 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");		
			 driver.findElement(By.cssSelector("button[type='submit']")).click();
 			 driver.findElement(By.xpath("//li[3]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
			 driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
		try{
			driver.findElement(By.xpath("//button[normalize-space()='Add New Employee']")).click();
		}catch(StaleElementReferenceException e){
			driver.findElement(By.xpath("//button[normalize-space()='Add New Employee']")).click();
		}
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		boolean fullName =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[1]/span")).getText().contains("Full name is Required");
		boolean fatherName= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[2]/span")).getText().contains("Fathers name is Required");
		boolean dob= driver.findElement(By.xpath("//span[normalize-space()='DOB is required']")).getText().contains("DOB is required");
		boolean doj =driver.findElement(By.xpath("//span[normalize-space()='Date of joining is required']")).getText().contains("Date of joining is required");
		boolean mobileNo =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[5]/span")).getText().contains("Mobile Number is Required");
		boolean emergencyNo =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[6]/span")).getText().contains("Emergency Contact Number is Required");
		boolean role= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[7]/span")).getText().contains("Role is Required");
		boolean gender =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[8]/span")).getText().contains("Gender is Required");
		boolean emailAddress = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[9]/span")).getText().contains("Email address is Required.");
		boolean aadharNo =driver.findElement(By.xpath("//span[normalize-space()='Aadhar Number is required']")).getText().contains("Aadhar Number is required");
		boolean designation =driver.findElement(By.xpath("//span[normalize-space()='Designation is Required']")).getText().contains("Designation is Required");
		boolean address =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[16]/span")).getText().contains("Address is Required");
		
		if(fullName){
			System.out.println("fullName error passed");
		}if(fatherName){
			System.out.println("fatherName error passed");
		}
		if(dob){
			System.out.println("dob error passed");
		}if(doj){
			System.out.println("doj error passed");
		}if(mobileNo){
			System.out.println("mobileNo error passed");
		}if(emergencyNo){
			System.out.println("emergencyNo error passed");
		}if(role){
			System.out.println("role error passed");
		}if(gender){
			System.out.println("gender error passed");
		}if(emailAddress){
			System.out.println("emailAddress error passed");
		}if(aadharNo){
			System.out.println("aadharNo error passed");
		}if(designation){
			System.out.println("designation error passed");
		}if(address){
			System.out.println("address error passed");
		}else{
			System.out.println("Empty Validation Failed");
		}		
		}  finally{  
              
    //    	driver.close();
           }		
	}

}
