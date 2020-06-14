import app.xueqiu.MainPage;
import app.xueqiu.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class search {
    static MainPage mainPage;
    static SearchPage searchPage;

    @BeforeAll
    public static  void before(){
        try {
            mainPage=new MainPage();
           searchPage= mainPage.toSearch();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @AfterAll
    public static void after(){
        searchPage.quit();
    }
    @ParameterizedTest
    @CsvSource({
            "alibaba,阿里巴巴",
            "jd,京东"

    })
    public void search(String keyword,String name){

        assertEquals(searchPage.search(keyword).getSearchList().get(0),name);
    }

    @Test
    public void getPrice(){
        assertTrue(searchPage.search("alibaba").getPrice()>200);
    }
}
