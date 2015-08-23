package com.jagadeesh.cisco;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class AppTest
{
   @Test
  public void testing()

  {
	   System.setProperty("webdriver.chrome.driver", "C://Users//Jagadeesh//Downloads//chromedriver_win32//chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   //driver.get("http://www.google.com");
  }
}
