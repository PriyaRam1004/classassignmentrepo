package switchtoSalesforceLibrary;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssetLibrary {
	@Parameters({"Url","id","pwd"})
@Test(alwaysRun = true)
	public  void runAssetLibrary(String Url,String id,String pwd) throws IOException {
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
ChromeDriver driver=new ChromeDriver(options);
driver.manage().window().maximize();
driver.get(Url);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//input[@id='username']")).sendKeys(id);
driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
driver.findElement(By.xpath("//input[@id='Login']")).click();
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

try {
	driver.findElement(By.xpath("//span[@class='uiImage']")).click();
	driver.findElement(By.xpath("//a[text()='Switch to Salesforce Classic']")).click();

} catch (Exception e) {
	
}
driver.findElement(By.xpath("//a[@title='Libraries Tab']")).click();

Select drop = new Select(driver.findElement(By.xpath("//select[@id='workspacesCombo']")));
drop.selectByIndex(1);
driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
driver.findElement(By.xpath("//a[text()='Do you want to link to a website instead?']")).click();
driver.findElement(By.xpath("//input[@id='contentUrl']")).sendKeys("http://randomName.com");
driver.findElement(By.xpath("(//button[text()='Contribute'])[1]")).click();
driver.findElement(By.xpath("//input[@class='describeTitle text']")).sendKeys("About Random name");
driver.findElement(By.xpath("//button[text()='Save']")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//blockquote[@class='confirm']")));
File scr = driver.getScreenshotAs(OutputType.FILE);
File des = new File("./Screenshot/img.png");
FileUtils.copyFile(scr, des);
driver.findElement(By.xpath("//button[text()='Done Publishing']")).click();
driver.close();

	}

}
//Login: Utilize TestNG with static parameterization to log in to Salesforce using different credentials.
//
//Switch to Salesforce Classic: Click on the 'profile' and select 'Switch to Salesforce Classic.' Ensure that the switch occurs only if not already in Salesforce Classic.
//
//Navigate to Libraries: Click on the 'Libraries' tab.
//
//Select Asset Library: Choose 'Asset Library' from the 'Manage Library' dropdown.
//
//Initiate Contribution: Click on the 'Contribute' button.
//
//Link to Website: Click on the 'Do you want to link to a website instead?' link.
//
//Enter URL: In the URL bar, input http://randomName.com.
//
//Complete Contribution: Click on the 'Contribute' button.
//
//Provide Title: Enter the title as 'About Random name.'
//
//Save Contribution: Click on the 'Save' button.
//
//Capture Snapshot: Take a snapshot of the 'Save or publish content' screen.
//
//Complete Publishing: Click on 'Done publishing.'
//
//Additional Attributes for TestNG:
//
//AlwaysRun Attribute: Utilize 'alwaysRun' attribute to ensure that certain steps, such as logging in, are executed regardless of the success or failure of previous steps.
//
//Static Parameterization: Employ static parameterization in TestNG to execute the test with a minimum of two different login credentials.
//
//Parallel Execution: Execute the test in parallel through XML configuration for enhanced efficiency.


