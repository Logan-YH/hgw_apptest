package app.wework;

import app.common.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DayPlanPage extends BasePage {

    public DayPlanPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public DayPlanPage addplan(String name){
        click(By.id("gym"));
        sendkey(By.id("b2k"),name);
        click("保存");
        return this;
    }

    public List<String> getplans(){
//        return Arrays.asList("1");
        return driver.findElements(By.id("bi1")).stream().map(x->x.getText()).collect(Collectors.toList());
    }
}
