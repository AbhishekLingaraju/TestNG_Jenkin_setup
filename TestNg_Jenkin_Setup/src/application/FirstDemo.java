package application;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstDemo 
{
	@Test
	public static void launch()
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Login successful");
	}
}
