package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constants
{
public WebDriver driver;
public WebDriverWait wait;

@BeforeMethod(alwaysRun=true)
public void launchBrowser()
{
	/*System.setProperty(CHROME_KEY,CHROME_PATH);
	driver =new ChromeDriver();*/
	
	System.setProperty(iexplorer_KEY,iexplorer_PATH);
	driver = new InternetExplorerDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

@AfterMethod(alwaysRun=true)
public void closeBrowser()
{
	driver.quit();
}

}
