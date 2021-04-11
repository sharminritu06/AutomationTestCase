package automationFramework;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class TestCaseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\ppp\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		
		// Accessing Selenium Website
		
		 driver.navigate().to("https://www.selenium.dev//");  
		 
		 // Maximize Window
		 
		 driver.manage().window().maximize(); 
		 
		 // Click on the “About” menu at top left
		 
		driver.findElement(By.className ("nav-item")).click();
		driver.findElement(By.id ("aboutArrow")).click();
		
		// Now click on “About” option
		
		 driver.findElement(By.linkText ("About")).click();
		 
		 // Print the header text that marked in the screenshot 
		 		 		
		 driver.findElement(By.className ("body-large")).getText();
		 
		 // Verify with actual result
		 
		 String headertext = "Selenium is a suite of tools for automating web browsers.";
     	
     	//Storing the text of the heading in a string
		 
     	String text = driver.findElement(By.xpath("//div[@class='header-description']//p")).getText();
     	if(headertext.equalsIgnoreCase(text))
           	System.out.println("The text is same as actual text --- "+text);
     	else
           	System.out.println("The text doesn't match the actual text --- "+text);
     	
     	// navigate back to home page of selenium website
     	
     	driver.navigate().back();   
     	
    
			
	}

}
