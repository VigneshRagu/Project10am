package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenova\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement user = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		user.sendKeys("iphone");
		WebElement click = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		click.click();
		System.out.println("MobilePhone");
		List<WebElement> list = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));

		for (int i = 0; i < list.size(); i++) {
			WebElement each = list.get(i);
			String text = each.getText();
			System.out.println(text);

		}
		System.out.println("");
		System.out.println("Rate");
		System.out.println("");
		List<WebElement> rate = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < rate.size(); i++) {
	
			
			 WebElement l = rate.get(i);
			String text = l.getText();
			String replace = text.replace(",", "");
			String sb = replace.substring(0);
			int p = Integer.parseInt(sb);
			a.add(p);

		}
		Collections.sort(a);
		System.out.println(a);
		System.out.println(Collections.max(a));
		System.out.println(Collections.min(a));
		
		
		WebElement btn = driver.findElement(By.xpath("//li[@class=\"a-normal\"]"));
		btn.click();
		
		System.out.println(" ");
		List<WebElement> li = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		for (int i = 0; i < li.size(); i++) {
			WebElement t = li.get(i);
			String text = t.getText();
			System.out.println(text);
			
		}
		
		
	}
}
