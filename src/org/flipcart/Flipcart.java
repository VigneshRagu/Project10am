package org.flipcart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenova\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement x = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		x.click();
		WebElement product = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		product.sendKeys("iphone");
		WebElement search = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		search.click();
		System.out.println("Mobile Phone");
		List<WebElement> mobile = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		for (int i = 0; i < mobile.size(); i++) {
			WebElement in = mobile.get(i);
			String text = in.getText();
			System.out.println(text);

		}

		System.out.println(" ");

		System.out.println("Phone Rate");
		System.out.println("");
		List<WebElement> phone = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		List<Integer> s = new ArrayList<>();
		for (int i = 0; i < phone.size(); i++) {
			WebElement in = phone.get(i);
			String text = in.getText();
			String replace = text.replace(",", "");
			String substring = replace.substring(1);
			int p = Integer.parseInt(substring);
			s.add(p);

		}
		// for (Integer integer:s) {
		// System.out.println(integer);
		// }
		Collections.sort(s);
		System.out.println(s);
		System.out.println(Collections.max(s));
		System.out.println(Collections.min(s));
		
		System.out.println("Next Page");
		WebElement btn = driver.findElement(By.xpath("//a[@class=\"_1LKTO3\"]"));
		btn.click();
		
		List<WebElement> ph = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		for (int i = 0; i < ph.size(); i++) {
			WebElement e = ph.get(i);
			String text = e.getText();
			System.out.println(text);
			
			
		}
	}

}
