package UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {
	public static void ScreenShot() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Date Format()
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		
		String str=sdf.format(new Date(0));
		
		//ScreenShot 
		
		WebElement cross=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cross.click();
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti=new File("F:\\ss"+str+".jpg");
		
		FileHandler.copy(source, desti);
	}

}
