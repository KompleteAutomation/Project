package com.prac;

import java.util.Scanner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Amaz {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\installs\\\\Selenium\\\\chromedriver_win32_101\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(400, TimeUnit.MILLISECONDS);
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,-300)");
	}



}
