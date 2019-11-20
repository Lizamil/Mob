package tests;

import model.Article;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchArticleTests extends TestBase {

    @Test(priority = 1)
    public void openAppTest() {
        System.out.println("App opened");
    }


    @Test(priority = 2)
    public void searchArticleTest() throws InterruptedException {

        app.getArticle().startSearch();
        app.getArticle().pause(2000);
        app.getArticle().sendKeys(By.id("search_src_text"), new Article("Appium"));
        app.getArticle().pause(3000);
        app.getArticle().click(By.id("page_list_item_title"));
        app.getArticle().pause(6000);

        String articleTitle = app.getArticle().getArticleTitle();
        Assert.assertTrue(articleTitle.contains("appium"));

    }


}
