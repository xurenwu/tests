package com.test.webTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
	private static  WebDriver driver;
	private static String baseUrl;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:/tools/chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://cn.bing.com/";
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		System.out.println("home page title "+ driver.getTitle());
		WebElement element = driver.findElement(By.id("scpl3"));
		assertEquals(element.getText(),"词典");
		element = driver.findElement(By.className("a11yhide"));
		assertEquals(element.getText(),"必应");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
