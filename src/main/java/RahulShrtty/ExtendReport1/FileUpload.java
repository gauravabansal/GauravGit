package RahulShrtty.ExtendReport1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String downloadpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();    
        option.addArguments("--remote-allow-origins=*");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadpath);
        option.setExperimentalOption("prefs", chromePrefs);
//        WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver(option);
		
		//ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ilovepdf.com/compress_pdf");
		driver.findElement(By.xpath("//span[text()='Select PDF files']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\gaura\\Downloads\\FileUpload.exe");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='processTask']")));
		driver.findElement(By.cssSelector("button[id='processTask']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='downloader__btn active']")));
//		a[class='downloader__btn active']		
		driver.findElement(By.cssSelector("a[class='downloader__btn active']")).click();
		File f = new File(downloadpath+"/p44_compressed.pdf");
		Thread.sleep(3000);
		if(f.exists())
		{
			System.out.println("File exist");
			f.delete();
		}
		
		
        driver.close();
		
		
	}

}
