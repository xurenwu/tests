package com.test.webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cn.bing.com/");
		System.out.println("home page title "+ driver.getTitle());
		WebElement element = driver.findElement(By.id("sb_form_q"));
		element.sendKeys("software testing");
		element.submit();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
