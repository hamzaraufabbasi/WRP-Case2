package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import Helpers.DriverBase;

import Objects.Others;

import Objects.loginobj;



public class Testcasesarabic extends DriverBase  {
	
		Others othersobj = new Others();
		loginobj lobj=new loginobj();
		 public static SoftAssert softAssertionforHomeVerification= new SoftAssert();
	
		  public String name;
	
		@BeforeSuite(groups={"AS-SmokeTestwithBFB"})
		public void BeforeSuit () throws InterruptedException 
		{	
		
		driver = new ChromeDriver();
		System.setProperty(othersobj.Chrome, othersobj.Browserpath);
		
		driver.get(othersobj.URL);
		driver.manage().window().maximize();
		
		}
		
		
		
		
		  @Test(groups={""}) 
		  
		  public void T00_arabic_clickPopUp_noThanksButton () throws
		  InterruptedException { othersobj.customwait(5000);//we can also put explicit wait
		  driver.findElement(By.xpath(lobj.noThanksButton)).click();
		  
		  
		  }
		 
		  @Test(groups={""}) 
		  
		  public void T00_arabic_switcharabiclang() throws
		  InterruptedException { 
		  driver.findElement(By.xpath(lobj.arabic)).click();
		  
		  
		  }
		  
 @Test(groups={""}) 
		  
		  public void T00_arabic_xclickPopUp_noThanksButton () throws
		  InterruptedException { othersobj.customwait(10000);//we can also put explicit wait
		  driver.findElement(By.xpath(lobj.noThanksButtona)).click();
		  
		  
		  }
		
		@Test(groups={""})
		public void T01_arabic_clickAccountButton () throws InterruptedException 
		{			
		
			driver.findElement(By.xpath(lobj.account)).click();
		}
	
		@Test(groups={""})
		public void T02_arabic_clickfacebook_button () throws InterruptedException 
		{			
			
			driver.findElement(By.xpath(lobj.facebook)).click();
			othersobj.customwait(5000);
		}
		
		
		
		@Test(groups={""})
		public void T03_arabic_entercred() throws InterruptedException 
		{			
			
			driver.findElement(By.xpath(lobj.emailf)).sendKeys(lobj.email);
			driver.findElement(By.xpath(lobj.passwordf)).sendKeys(lobj.password);
		
		}
		
		
		

		@Test(groups={""})
		public void T04_arabic_click_facebook_loginbutton() throws InterruptedException 
		{			
			
			driver.findElement(By.xpath(lobj.floginb)).click();
			othersobj.customwait(5000);
		}		
		
		
		@Test(groups={""})
		public void T05_clickclothing () 
		{		
			driver.findElement(By.xpath(lobj.arabicclothing)).click();
			
			
		}
		

		@Test(groups={""})
		public void T06_arabic_Scrolldown() throws InterruptedException
		
		{
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			othersobj.customwait(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			othersobj.customwait(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			othersobj.customwait(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			othersobj.customwait(2000);
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
		}
		//After 72 items, “View More” should not automatically load more, but need to be clicked button at bottom 
		//which should load more items if there are more than 12 items in this page.	
		//The above statement in the assignement seems to be invalid as the website seems to be updated.		
		
	
		@AfterMethod
		public void invokeScreenshotMethod(ITestResult res)
		{
		if (ITestResult.FAILURE==res.getStatus()){
		try{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./SSoferrorsforarabic/"+System.currentTimeMillis()+".png"));
		
		}
		
		
		
		catch (IOException e)
		 
		{
		 
		System.out.println(e.getMessage());
		 
		    }}}
		
		@AfterSuite(groups={""})
		public void AfterSuit () throws InterruptedException 
		{
		System.out.println("Arabic Testrun is complete.");
	//		driver.quit();
		}
		
}
