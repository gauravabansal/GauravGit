package RahulShrtty.ExtendReport1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extendReportDemo {
ExtentReports extent;

	@BeforeTest
	public void config() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index1.html";
ExtentSparkReporter reporter = new ExtentSparkReporter(path);
reporter.config().setDocumentTitle("THIS IS TEST");
reporter.config().setReportName("Test Automation Test");
extent = new ExtentReports();
extent.attachReporter(reporter);
extent.setSystemInfo("TESTer Name", "GAURAV");
	}

	@Test

	
	public void initialDemo() {
extent.createTest("Thisi s a sample test");
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		extent.flush();	
	driver.quit();
}
}
