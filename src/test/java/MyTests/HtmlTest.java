package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class HtmlTest {
	
//	@Test
//	public void homePage() throws Exception {
//	    try (final WebClient webClient = new WebClient()) {
//	        final HtmlPage page = webClient.getPage("https://www.google.com/");
//	        System.out.println(page.getTitleText());
//	        Assert.assertEquals("Google", page.getTitleText());
//
////	        final String pageAsXml = page.asXml();
////	        System.out.println(pageAsXml);
//
//	        final String pageAsText = page.asText();
//	        System.out.println(pageAsText);
//	        
//	    }
//	}
	
	@Test
	public void googleTest() {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.name("q")).sendKeys("India");
     	driver.findElement(By.name("btnK")).click();
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
