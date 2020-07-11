package mobile.android;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_1 extends Base {
	
  AndroidDriver<AndroidElement> driver;
	
	@BeforeSuite
	public void toStartApp() throws MalformedURLException{
	
		startApp();
	}

  @Test 
  public void toVrtifyHomePage() {
	  
  
  }

}
