package sdet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(20000);//2 sec
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("izin");
		Thread.sleep(2000);//2 sec
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("izin");
		Thread.sleep(2000);//2 secThread.sleep(2000);//2 sec
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
  }


	}


