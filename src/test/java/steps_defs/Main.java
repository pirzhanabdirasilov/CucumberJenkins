package steps_defs;

import PageWeb.BasePage;
import PageWeb.IMovingPage;
import data.ConfigReader;
import drivers.Driver;
import drivers.MacOs;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class Main extends BaseTest {





    @Test
    public void test1() {
        Driver.getDriver().get("https://qa.imoving.com/");
        iMovingPage.house(2,3)
                .click5(5);

    }


}
