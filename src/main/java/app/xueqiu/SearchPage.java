package app.xueqiu;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchPage extends BasePage {
    public SearchPage(AndroidDriver driver) throws MalformedURLException {
       super(driver);

    }

    public SearchPage search(String keyword){
//        MobileElement els5= (MobileElement) driver.findElement(By.id("com.xueqiu.android:id/search_input_text"));
//        els5.sendKeys(keyword);
        sendkey(By.id("com.xueqiu.android:id/search_input_text"),keyword);
        return  this;
    }
    public List<String> getSearchList(){
        List<String> namelist = new ArrayList ();
        for (Object element:
             driver.findElements(By.id("name"))) {
            namelist.add(((WebElement)element).getText());

        }
        return namelist;
    }

    public double getPrice(){
//        MobileElement els6= (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));
//        els6.click();
        click(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"));
        return Double.valueOf(driver.findElement(By.id("current_price")).getText());
    }


}
