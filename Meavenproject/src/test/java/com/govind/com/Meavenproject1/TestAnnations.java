package com.govind.com.Meavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.govind.com.Meavenproject.Annatotaions;

public class TestAnnations extends Annatotaions
{
	@Test
	public void loginlogoutTest() throws Exception
	{
		 WebElement Sign=driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2] "));
			Sign.click();
			Thread.sleep(5000);
			WebElement user=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
			user.sendKeys("deepusingh201301@gmail.com");
			WebElement Next=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span "));
			Next.click();
			Thread.sleep(5000);
			WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
			password.sendKeys("8826813726");
			Thread.sleep(5000);
			WebElement next1=driver.findElement(By.cssSelector("#passwordNext > div > button > span"));
			next1.click();
			Thread.sleep(5000);
			WebElement signout=driver.findElement(By.xpath("//*[@id=\"img\" and @class=\"style-scope yt-img-shadow\" and @alt=\"Avatar image\"]"));
			signout.click();
			Thread.sleep(5000);
			WebElement sign=driver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-compact-link-renderer[4]/a/tp-yt-paper-item/div[2]/yt-formatted-string[1]"));
			sign.click();
	}
	
	@Test
	public void titletest() throws Exception
	{
		String title=driver.getTitle();
		System.out.println(title);
		 Thread.sleep(5000);
	}

}
