package TestCasess;

import org.testng.annotations.Test;

import elementrepository.LoginPage1;

public class LoginTestCases extends BaseClass1{
	LoginPage1 lp1;
	
  @Test
  public void verifyLogin() {
	  lp1=new LoginPage1(driver);
	  lp1.clickSignInToLogin();
  }
}
