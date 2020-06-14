package app.xueqiu;

import app.common.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {

    public MainPage() throws MalformedURLException {
        super("com.xueqiu.android",".view.WelcomeActivityAlias");
    }

    public SearchPage toSearch() throws MalformedURLException {
//        MobileElement ele4= (MobileElement) driver.findElement(By.id("com.xueqiu.android:id/home_search"));
//        ele4.click();
        click(By.id("com.xueqiu.android:id/home_search"));
        return new  SearchPage(driver);
    }
    public StockPage  toStock(){
        return  new StockPage(driver);
    }
}
