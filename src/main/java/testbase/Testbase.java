package testbase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public static WebDriver driver;
	public static String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static xpath login;


	public void lunch_Chrome() throws InterruptedException {
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(1000);
		System.out.println("ChromeDriver");
		Thread.sleep(1000);
		login=new xpath();
		
		
		}
	

	public void close_Chrome() throws IOException, InterruptedException {
		Thread.sleep(1000);
		takeScreenshot();
		 driver.quit();
		System.out.println("close Chrome");
		}
	
	public void takeScreenshot() throws IOException {
        // Generate a timestamp for unique file naming
        String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

        // Take screenshot and store as a file format
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("E:\\abc\\bstackdemo\\screenshot\\Tushar"+ "_" + timestamp + ".png");
        FileUtils.copyFile(srcFile, destFile);
    }
}
