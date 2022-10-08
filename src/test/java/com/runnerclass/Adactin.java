package com.runnerclass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");

		driver.findElement(By.id("username")).sendKeys("Vaalu819");

		driver.findElement(By.id("password")).sendKeys("Oogy@5418");

		driver.findElement(By.id("login")).click();

		WebElement location = driver.findElement(By.id("location"));

		Select s = new Select(location);

		s.selectByValue("New York");

		WebElement hotels = driver.findElement(By.id("hotels"));

		Select s1 = new Select(hotels);

		s1.selectByValue("Hotel Sunshine");

		WebElement room_type = driver.findElement(By.name("room_type"));

		Select s2 = new Select(room_type);

		s2.selectByValue("Super Deluxe");

		WebElement No_Of_Rooms = driver.findElement(By.name("room_nos"));

		Select s3 = new Select(No_Of_Rooms);

		s3.selectByValue("1");
		
		WebElement Checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		
		Checkin.clear();
		
		Checkin.sendKeys("10/11/2022");
				
		WebElement Checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		
		Checkout.clear();
		
		Checkout.sendKeys("12/11/2022");
		
		WebElement Adults_per_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
		
		Select s4 = new Select(Adults_per_room);
		
		s4.selectByValue("2");
		
		WebElement children_per_room = driver.findElement(By.xpath("//select[@name='child_room']"));
		
		Select s5 = new Select(children_per_room);
		
		s5.selectByValue("0");
		
	    driver.findElement(By.id("Submit")).click();
		
	    driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Vaalarivan");
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Annamalai");
		
		driver.findElement(By.id("address")).sendKeys("Area51,secret U.S.Airforce,U.S.A");
		
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1881188118811881");
        
		WebElement cc_type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		
		Select s6 = new Select(cc_type);
		
		s6.selectByValue("OTHR");
		
		WebElement Exp_Mnth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		
		Select s7 = new Select(Exp_Mnth);
		
		s7.selectByValue("12");
		
		WebElement Exp_Yr = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		
		Select s8 = new Select(Exp_Yr);
		
		s8.selectByValue("2022");
				
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		
		Thread.sleep(7000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File Src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Screenshot//Adactin.png");
		
		FileUtils.copyFile(Src, des);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,200)");
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		
		File des1 = new File("C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Screenshot//Adactin2.png");
		
		FileUtils.copyFile(src1, des1);
		
		driver.findElement(By.id("logout")).click();
		
		TakesScreenshot ts2 = (TakesScreenshot)driver;
		
		File src2 = ts2.getScreenshotAs(OutputType.FILE);
		
		File des2 = new File("C:\\Users\\elcot\\eclipse-workspace\\Selenium\\Screenshot//logout.png");
		
		FileUtils.copyFile(src2, des2);
	}

}

