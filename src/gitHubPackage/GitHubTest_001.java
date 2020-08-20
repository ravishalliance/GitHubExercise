package gitHubPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GitHubTest_001 {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("hii ravish...");
	System.setProperty("webdriver.chrome.driver","E:\\work1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.careerpower.in/upcoming-bank-exams.html");
	driver.manage().window().maximize();
	Thread.sleep(300);
	WebElement bank=driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Bank')]"));
	WebElement rbibank=driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'RBI Assistant')]"));
	Actions act=new Actions(driver);
	act.moveToElement(bank).build().perform();
	
	rbibank.click();
	System.out.println("all test case is executed..");
	driver.quit();

	}

}
