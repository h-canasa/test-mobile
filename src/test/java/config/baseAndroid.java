package config;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class baseAndroid {

    public AndroidDriver driver;

    protected void prepareAndroidForAppium () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("deviceName", "Samsung");
        capabilities.setCapability("app", "C:/Users/Harley/Desktop/Projects/mobile-test/Sample Android App - Login Tes_4.0_Apkpure.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }


}
