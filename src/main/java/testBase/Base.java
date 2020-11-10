package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static Properties prop;
	public static WebDriver driver;
	
	public Base(){
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\User\\Desktop\\eclipse\\MJFramework"
					+ "\\src\\main\\java\\properties\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browser_name = prop.getProperty("browser");
		
		if (browser_name.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser_name.equals("FF")) {
			System.setProperty("", "");
			driver = new FirefoxDriver();
		}
		else if (browser_name.equals("IE")) {
			System.setProperty("", "");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Browser not available");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
	
	public static void tearDown() {
		driver.close();
	}
}
