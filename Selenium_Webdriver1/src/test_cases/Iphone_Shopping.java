package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone_Shopping {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Digambar Kale\\OneDrive\\Documents\\Selenium_Training\\softwares\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=apple&rlz=1C1RXQR_enIN944IN944&sxsrf=ALeKk00vvD2b1-Fu9o1sl53CY-ac86T2uw%3A1617165279730&ei=3_tjYPyHLO6C4-EPmbC40AY&oq=apple&gs_lcp=Cgdnd3Mtd2l6EAMyBwgjELADECcyBwgjELADECcyBwgjELADECcyBwgAELADEEMyDQguEMcBEKMCELADEEMyBwgAELADEEMyBwgAELADEEMyBwgAELADEEMyBwgAELADEEMyBwgAELADEENQAFgAYJCzA2gCcAJ4AIABnAOIAZwDkgEDNC0xmAEAqgEHZ3dzLXdpesgBCsABAQ&sclient=gws-wiz&ved=0ahUKEwi886mQ2tnvAhVuwTgGHRkYDmoQ4dUDCA0&uact=5#scso=_GfxjYI-5Hsf0rAGuk5GIDg66:880");
		Thread.sleep(2000);
		
		WebElement linktxt = driver.findElement(By.linkText("iPhone 12"));
		linktxt.click();
		Thread.sleep(2000);
		
		WebElement link = driver.findElement(By.linkText("Buy"));
		link.click();
		Thread.sleep(2000);
		
		WebElement Radio_btn = driver.findElement(By.xpath("//label[@for=\"noTradeIn\"]"));

		if(!Radio_btn.isSelected()) {
			Radio_btn.click();
		}
		Thread.sleep(2000);
		

		WebElement Radio_btn1 = driver.findElement(By.xpath("//label[@for=\"Item1-dimensionScreensize-5_4inch\"]"));
		Radio_btn1.click();
		Thread.sleep(2000);
		

		WebElement Radio_btn2 = driver.findElement(By.xpath("//label[@for=\"dimensionColor-black\"]"));
		Radio_btn2.click();
		Thread.sleep(2000);
		
		WebElement Radio_btn3 = driver.findElement(By.xpath("//label[@for=\"Item3-dimensionCapacity-128gb\"]"));
		Radio_btn3.click();
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath("//button[@class=\"button button-block\"]"));
		btn.click();
		Thread.sleep(2000);
		
		driver.close();
		
	}

	

}
