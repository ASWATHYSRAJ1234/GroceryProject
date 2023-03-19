package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilitiess;

public class LoginPage1 {
	WebDriver driver;
	GeneralUtilitiess gu=new GeneralUtilitiess();
	@FindBy(xpath="//button[@type='submit']")
	WebElement signIn;
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement userName;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passWord;
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickSignInToLogin()
	{
		gu.enterVlauesBySendKeys(userName,"admin");
		gu.enterVlauesBySendKeys(passWord, "admin");
	
		gu.clickElement(signIn);
	}

}
