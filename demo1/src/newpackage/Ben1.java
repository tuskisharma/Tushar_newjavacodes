package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ben1 {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//tusha//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		String beforelogin=driver.getTitle();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']//div//div//input")).sendKeys("tushar");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Job Titles")).click();
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-form']/div/div/div/input")).sendKeys("test manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		Thread.sleep(3000);
	
		String afterlogin=driver.getTitle();
		if(beforelogin.equals(afterlogin)) {
			System.out.println("logout from page");
			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
			
		}else {
			System.out.println("title is not same");
		}
		
		

		
		
		
				
	}

}
