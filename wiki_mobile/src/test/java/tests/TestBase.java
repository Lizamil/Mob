package tests;

import manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class TestBase {

    protected ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws MalformedURLException {
        app.init();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

}