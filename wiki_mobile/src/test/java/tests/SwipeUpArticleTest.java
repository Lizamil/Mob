package tests;

import model.Article;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SwipeUpArticleTest extends TestBase {

    @Test
    public void swipeUpTest() throws InterruptedException {
        app.getArticle().startSearch();
        app.getArticle().pause(2000);
        app.getArticle().sendKeys(By.id("search_src_text"), new Article("Appium"));
        app.getArticle().pause(3000);
        app.getArticle().click(By.id("page_list_item_title"));
        app.getArticle().pause(5000);

        //app.getArticle().swipeUp();
       app.getArticle().swipeUpToElement(By.id("page_external_link"),0);


    }
}
