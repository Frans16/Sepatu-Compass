package test;

import org.testng.annotations.Test;

import config.AppiumConfig;
import io.appium.java_client.AppiumBy;

public class BaseTest extends AppiumConfig {
	
	@Test
	public void wifiSettingName() {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	}
}
