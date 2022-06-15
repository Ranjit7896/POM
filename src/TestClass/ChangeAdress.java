package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.BaseClass;
import POMClass.HomePage;
import POMClass.LoginPage;
import UtilityClass.UtilityClass;

public class ChangeAdress extends UtilityClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
	WebDriver driver=BaseClass. getdriver();	
	
		LoginPage pg=new LoginPage(driver);
		pg.enteremailId();
		pg.enterPassword();
		pg.pressLoginButton();
		ScreenShot();
		Thread.sleep(4000);
		HomePage Hp=new HomePage(driver);
		Hp.EnterSearchBar();
		Hp.engterSearchButton();
		ScreenShot();
		
		
		
	}

	

}
