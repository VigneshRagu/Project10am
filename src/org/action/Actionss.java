package org.action;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenova\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
 WebDriver r=new ChromeDriver();
    r.get("https://www.edureka.co/");
    r.manage().window().maximize();
    r.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    Actions a = new Actions(r);
    r.get("http://www.greenstech.in/selenium-course-content.html");
    WebElement move = r.findElement(By.xpath("//div[@title='Courses']"));
    a.moveToElement(move).perform();
    WebElement data = r.findElement(By.xpath("//div[@title='Data Science']"));
    a.moveToElement(data).perform();
    WebElement ele = r.findElement(By.xpath("//div[@title='Dot Net']"));
    a.moveToElement(ele).perform();
    WebElement v = r.findElement(By.xpath("//span[text()=\"ASP.NET Certification Training\"]"));
    a.moveToElement(v).perform();
    
    
    
    
	
    }}
			
	