package org.antikode.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class HelperClass {
	private static HelperClass helperClass;
    private static WebDriver driver;
    public final static int TIMEOUT = 5;
    String browser = "chrome";
       
	@SuppressWarnings("deprecation")
	private HelperClass() {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","src\\test\\driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","src\\test\\driver\\msedgedriver.exe");
	    	driver = new EdgeDriver();
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}else {
			System.out.println("No browser detected");
		}
		
     }      
               
	public static void openPage(String url) {
        driver.get(url);
    }
           
    public static WebDriver getDriver() {
        return driver;              
    }
       
    public static void setUpDriver() {
           
        if (helperClass==null) {
               
            helperClass = new HelperClass();
        }
    }
       
    public static void tearDown() {
    	
        if(driver!=null) {
             driver.close();
             driver.quit();
        }
            
       helperClass = null;
   } 
}
