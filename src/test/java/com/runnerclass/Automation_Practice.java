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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
				
		Actions a = new Actions(driver);
		
		WebElement women = driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
		
		WebElement Casual = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		
		a.moveToElement(women).click(Casual).build().perform();
				
		WebElement add_to_cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		
        WebElement element = driver.findElement(By.xpath("//a[@class='color_pick']"));
		
        Actions a2 = new Actions(driver);
        
        a2.moveToElement(element).click(add_to_cart).build().perform();
        
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
		
		WebElement quantity = driver.findElement(By.xpath("//input[@size='2']"));
		
		quantity.click();
		
		quantity.sendKeys("6");
		
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		
		driver.findElement(By.name("email_create")).sendKeys("vaalvaalu51@gmail.com");
		
		driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
		
		driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
		
		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Vaalarivan");
		
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Annamalai");
				
		driver.findElement(By.id("passwd")).sendKeys("Oogy@531");
		
		WebElement days = driver.findElement(By.id("days"));
		
		Select s = new Select(days);
		
		s.selectByValue("12");
		
		WebElement months = driver.findElement(By.id("months"));
		
		Select s1 = new Select(months);
		
		s1.selectByValue("9");
		
		WebElement years = driver.findElement(By.id("years"));
		
		Select s2 = new Select(years);
		
		s2.selectByValue("1999");
		
		driver.findElement(By.id("newsletter")).click();
		
		driver.findElement(By.id("optin")).click();
							
		driver.findElement(By.id("address1")).sendKeys("150 West , 17th Street , between the Avenue of the Americas (Sixth Avenue) and Seventh Avenue.");
		
		driver.findElement(By.id("city")).sendKeys("Newyork City");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		
		Select s3 = new Select(state);
		
		s3.selectByValue("32");
		
		driver.findElement(By.id("postcode")).sendKeys("10005");
		
		WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
		
		Select s4 = new Select(country);
				
		s4.selectByValue("21");
		
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("9181716151");
		
        driver.findElement(By.xpath("//span[text()='Register']")).click();
		
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
		
		WebElement order_confirmation = driver.findElement(By.xpath("//span[text()='Order confirmation']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",order_confirmation);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\elcot\\eclipse-workspace\\MavenProject\\Screenshot//order cofirmation.png");
		
		FileUtils.copyFile(src, des);
		
		
	}

}

