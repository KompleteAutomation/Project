package com.prac;


import java.util.Scanner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_Wait {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\installs\\\\Selenium\\\\chromedriver_win32_101\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
//		 implicit wait   - 5 (only timeout)
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 //2
		 driver.findElement(By.id("twotabsearchtextbox1")).click();
//		 3
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");
//		 0
		 driver.findElement(By.id("nav-search-submit-button")).click();
//		 Load products - 4 Sec
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
		
		 
//		 condition , timeout  //Explicit Wait 
		 
//		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");
		 
	}



}
