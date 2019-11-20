package manager;

import io.appium.java_client.AppiumDriver;
import model.Article;
import org.openqa.selenium.By;

public class HelperBase {
    AppiumDriver driver;

    public HelperBase(AppiumDriver driver) {
        this.driver = driver;
    }

    public void pause(int time) throws InterruptedException {
        Thread.sleep(time);
    }
    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void sendKeys(By locator, Article article) {
        driver.findElement(locator).sendKeys(article.getTitle());
    }
}
