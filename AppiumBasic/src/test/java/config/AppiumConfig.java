package config;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumConfig {
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	
	@BeforeClass
	public void config() throws MalformedURLException {
		service = new AppiumServiceBuilder()
				.withAppiumJS(new File("main.js path"))
				.withIPAddress("IP Address")
				.usingPort(0)//Your port
				.build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options()
				.setDeviceName("Emulator Name")
				.setApp("Path of APK");
		
		driver = new AndroidDriver(new URL("IP Address:port"),options);
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}
}
