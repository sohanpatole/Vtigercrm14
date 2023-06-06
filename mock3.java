package Mock;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mock3 {
      
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("(//span[@class='app-icon fa fa-bars'])[1]")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("(//div[@class='menu-items-wrapper app-menu-items-wrapper'])[2]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(ele1).perform();
		
		WebElement ele2 = driver.findElement(By.xpath("//span[text()=' Services']"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(ele2).perform();
		ele2.click();
		
		driver.findElement(By.xpath("//button[@id='Services_listView_basicAction_LBL_ADD_RECORD']")).click();
		driver.findElement(By.id("Services_editView_fieldName_servicename")).sendKeys("sp");
		Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[text()='Select an Option'])[1]")).click();
        Thread.sleep(3000);
        WebElement ele3 = driver.findElement(By.xpath("(//span[text()='Hours'])[1]"));
        Actions action3 = new Actions(driver);
		action3.moveToElement(ele3).perform();
		Thread.sleep(2000);
		ele3.click();
		
		driver.findElement(By.id("Services_editView_fieldName_website")).sendKeys("www.sp.com");
		driver.findElement(By.id("Services_editView_fieldName_qty_per_unit")).sendKeys("10");
		driver.findElement(By.id("Services-editview-fieldname-unit_price")).sendKeys("10");
		driver.findElement(By.id("Services_editView_fieldName_commissionrate")).sendKeys("10");
		driver.findElement(By.id("Services_editView_fieldName_purchase_cost")).sendKeys("10");
		driver.findElement(By.id("Services_editView_fieldName_description")).sendKeys("sp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
		Thread.sleep(2000);
        driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
	}
}

