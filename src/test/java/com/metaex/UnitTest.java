// package com.metaex;

// import org.aspectj.lang.annotation.Before;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.firefox.FirefoxOptions;
// import org.openqa.selenium.support.ui.Select;
// import org.testng.annotations.BeforeTest;
// import org.testng.annotations.Test;

// import io.github.bonigarcia.wdm.WebDriverManager;

// public class UnitTest {
// 	WebDriver dr;
//   @BeforeTest
//   public void BT() {
	  
	  
// 	  dr = new EdgeDriver();
// 	  dr.get("https://www.google.com/");

//       dr.manage().window().maximize();

//   }
//   @Test(enabled=false)
//   public void TC001() throws InterruptedException {
      
//       Thread.sleep(1000);
	  
// 	  dr.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a")).click();
//       Thread.sleep(2000);
//       dr.navigate().back();
// 	  dr.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
//       Thread.sleep(2000);
//       dr.navigate().back();
//       Thread.sleep(2000);

//   }

  
// }
