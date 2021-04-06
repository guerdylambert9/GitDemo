package pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NutsLandingPage {
	
	WebDriver driver;
	
	private By almonds = By.xpath("//div[@class='product']/div[@class='product-image']/img[contains(@alt, 'Almonds')]");
	private By pista = By.xpath("//div[@class='product']/div[@class='product-image']/img[contains(@alt, 'Pista')]");
	private By cashews = By.xpath("//div[@class='product']/div[@class='product-image']/img[contains(@alt, 'Cashews')]");
	private By walnuts = By.xpath("//div[@class='product']/div[@class='product-image']/img[contains(@alt, 'Walnuts')]");
	
	public NutsLandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement BuyNuts(String nutType)
	{
		WebElement a = driver.findElement(almonds), p = driver.findElement(pista);
		WebElement c = driver.findElement(cashews), w = driver.findElement(cashews);
		ArrayList<WebElement> nutsArray= new ArrayList<WebElement>();
		nutsArray.add(a); nutsArray.add(p); nutsArray.add(c); nutsArray.add(w);
		
		for(WebElement nut: nutsArray)
		{
			
		}
		return
	}
}
