package app.wework;

import org.junit.jupiter.api.BeforeAll;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;

class DayPlanPageTest {
    static WeworkPage weworkPage;
    static DayPlanPage dayPlanPage;
    @BeforeAll
    public static void before() throws MalformedURLException {
        weworkPage=new WeworkPage();
    }

}