package manager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class ArticleHelper extends HelperBase {


    public ArticleHelper(AppiumDriver driver) {
        super(driver);
    }

    public void typeRequest(Article article) {
        type(By.id("search_container"), article.getTitle());
    }

    public void startSearch() {
        click(By.id("search_container"));
    }

    public String getArticleTitle() {
        return driver.findElement(By.id("view_page_title_text")).getText().toLowerCase();
    }

    public void swipeUp() {

        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int x = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int stopY = (int) (size.height * 0.2);

        action.longPress(PointOption.point(x, startY)).moveTo(PointOption.point(x, stopY)).release().perform();
    }

    public void swipeUpToElement(By locator, int maxSwipes) {  //By.id("page_external_link")
        int curSwipes = 0;

        while (driver.findElements(locator).size() == 0) {
            if (curSwipes < maxSwipes) {
                curSwipes++;
            } else return;
            swipeUp();
        }
    }

}
