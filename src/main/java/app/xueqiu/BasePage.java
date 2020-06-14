package app.xueqiu;

import com.sun.org.apache.bcel.internal.ExceptionConstants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class BasePage {
    AndroidDriver driver;
    WebDriverWait wait;

    public BasePage() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");//手机种类
        desiredCapabilities.setCapability("deviceName", "xueqiu");//命名
        desiredCapabilities.setCapability("appActivity", ".view.WelcomeActivityAlias");//包名
        desiredCapabilities.setCapability("appPackage", "com.xueqiu.android");
        desiredCapabilities.setCapability("noReset", "true");//不会重置

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait=new WebDriverWait(driver,10);

    }
    public BasePage(AndroidDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver,10);


    }

    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    public void sendkey(By by,String content){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        driver.findElement(by).sendKeys(content);
    }

    public void quit() {
        driver.quit();
    }

    public void waitelement(){

    }
}
