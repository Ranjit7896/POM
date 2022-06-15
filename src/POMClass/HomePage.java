package POMClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//input[@type='text']")
	private  WebElement SearchBar; 
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private  WebElement SearchButton;
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void EnterSearchBar() {
		SearchBar.sendKeys("realme");;
	}
	public void engterSearchButton() {
		SearchButton.click();;
	}
	
}
