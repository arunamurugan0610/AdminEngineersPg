package Employee;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExistedData {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
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
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[5]/div/div/span[1]")).click();
		boolean name =driver.findElement(By.cssSelector("input[placeholder='Enter full name']")).getAttribute("Value").contains("Aruna");
		boolean fathersName =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[2]/input")).getAttribute("Value").contains("Murugan");
		boolean mobileNo =driver.findElement(By.cssSelector("input[placeholder='Enter mobile number']")).getAttribute("Value").contains("9876543211");
		boolean emergencyNo =driver.findElement(By.cssSelector("input[placeholder='Enter emergency number']")).getAttribute("Value").contains("9876543211");
		boolean emailID =driver.findElement(By.cssSelector("input[placeholder='Enter email address']")).getAttribute("Value").contains("vovopa9501@gekme.com");
		boolean aadharNo=driver.findElement(By.cssSelector("input[placeholder='Enter aadhar number']")).getAttribute("Value").contains("987654321111");
		boolean address=driver.findElement(By.cssSelector("textarea[placeholder='Enter address']")).getText().contains("Address");
	    boolean designation =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[15]/div/div/div[1]/div[1]")).getText().contains("testing");
	    boolean role= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[7]/select")).getText().contains("Admin");
	    boolean gender= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[8]/select")).getText().contains("Female");
	    boolean dob =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[3]/input")).getAttribute("Value").contains("2023-09-21");	
	    boolean doj =driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[2]/div[4]/input")).getAttribute("Value").contains("2023-09-21");	
		if(name){
			System.out.println("Existed Name passed");
		}if(fathersName){
			System.out.println("Existed fathersName passed");
		}if(mobileNo){
			System.out.println("Existed mobileNo passed");
		}if(emergencyNo){
			System.out.println("Existed emergencyNo passed");
		}if(emailID){
			System.out.println("Existed emailID passed");
		}if(aadharNo){
			System.out.println("Existed aadharNo passed");
		}if(address){
			System.out.println("Existed address passed");
		}if(designation){
			System.out.println("Existed designation passed");
		}if(role){
			System.out.println("Existed role passed");
		}if(gender){
			System.out.println("Existed gender passed");
		}if(dob){
			System.out.println("Existed dob passed");
		}if(doj){
			System.out.println("Existed doj passed");
		}else{
			System.out.println("No existed Data");
		}	
	}    finally{  
		driver.close();
             }
	}

}
