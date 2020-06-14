package app.wework;

import app.common.BasePage;

import java.net.MalformedURLException;

public class WeworkPage extends BasePage {
    public WeworkPage() throws MalformedURLException {
        super("com.tencent.wework",".launch.WwMainActivity");
    }
}
