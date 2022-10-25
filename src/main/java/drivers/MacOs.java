package drivers;

import data.ConfigReader;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MacOs {

    public static RemoteWebDriver runMacOs(){
            SafariOptions browserOptions = new SafariOptions();
            browserOptions.setPlatformName("macOS 12");
            browserOptions.setBrowserVersion("16");
            Map<String, Object> sauceOptions = new HashMap<>();
            sauceOptions.put("build", "<your build id>");
            sauceOptions.put("name", "<your test name>");
            sauceOptions.put("screenResolution", "1920x1440");
            browserOptions.setCapability("sauce:options", sauceOptions);
            RemoteWebDriver driver = null;
            try {
                    URL url = new URL("https://oauth-1maral1ev1904-78b2d:0d47c54e-fb83-4d83-be61-53fb0c42b15c@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
                    driver = new RemoteWebDriver(url, browserOptions);
            }catch (MalformedURLException e){
                    e.printStackTrace();
            }
            return driver;

    }

}
