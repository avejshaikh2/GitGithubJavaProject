package ProjectForSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\egde\\edgedriver_win64 (1)//msedgedriver.exe");
		
		WebDriver driver =  new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/index.php");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebElement name = driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[1]"));
		name.sendKeys("8600626191");
		
		WebElement pass = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		pass.sendKeys("avej@1234");
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		
		WebElement image = driver.findElement(By.xpath("//*[@class='x3ajldb']"));
		image.click();
		
		WebElement logout = driver.findElement(By.xpath("(//*[@dir='auto'])[58]"));
		logout.click();
	}

}
