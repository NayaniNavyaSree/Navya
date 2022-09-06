package package1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;


public class MouseClick2 {
	WebDriver d;
	@Test
	public void testMouseOver() throws Exception
	{
		d.get("https://www.onlinesbi.com/");
		assertEquals(d.getTitle(),"State Bank of India");
		Actions a=new Actions(d);
		a.click(d.findElement(By.linkText("Apply for SB/ Current Account"))).perform();
		a.click(d.findElement(By.linkText("Current Account"))).perform();
		a.click(d.findElement(By.linkText("MCA Current Account"))).perform();
		//d.findElement(By.linkText("Apply for SB/ Current Account")).click();
		//d.findElement(By.linkText("Current Account")).click();
		//d.findElement(By.linkText("MCA Current Account")).click();
		Thread.sleep(2000);
		
	}
	@BeforeMethod
	public void launch()
	{
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	}
    @AfterMethod
    public void exit()
    {
    	d.quit();
    }


}
