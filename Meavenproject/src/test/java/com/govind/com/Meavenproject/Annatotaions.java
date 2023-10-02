package com.govind.com.Meavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Annatotaions 
{
	public WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		 this.driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 Thread.sleep(5000);
		 driver.get("https://www.youtube.com");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
