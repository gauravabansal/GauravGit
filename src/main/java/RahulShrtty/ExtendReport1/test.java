
package RahulShrtty.ExtendReport1;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class test {

	private static final WebElement[] Object = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.get("https://www.ilovepdf.com/compress_pdf");
		driver.findElement(By.xpath("//span[text()='Select PDF files']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\gaura\\Downloads\\FileUpload.exe");

//
//
//			List<WebElement> Objects  = driver.findElements(By.className("_21S-L"));
//			int i = 0;
//			
//			for( WebElement Object : Objects )
//			{   if(i==0)
//			{	i++;
//				continue;
//			
//			}
//			i++;	
//			Object.click();
//////			Object.findElement(By.cssSelector("div[class*= 'to2l77zo']")).click();
//			//System.out.println(driver.findElement(By.cssSelector("span[data-testid='conversation-info-header-chat-title']")).getText());
//			if(driver.findElement(By.cssSelector("span[data-testid='conversation-info-header-chat-title']")).getText().contains("TRADING IQ 6331"))
//			{
//			continue;	
//			}
//			driver.findElements(By.cssSelector("div[class*='kao4egtt']")).get(2).sendKeys("Test");
//			}
			
	
//			
//driver.findElement(By.cssSelector("span[title='CRED']")).click();
//driver.findElement(By.cssSelector("p[class*='iq0m558w']")).sendKeys("This is selenium");
//driver.findElement(By.cssSelector("span[data-icon='send']")).click();

		
	}

	}

