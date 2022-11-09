package PageWeb;

import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HTMLTablesPage extends BasePage{






    public HTMLTablesPage tableMethods(String tag,String name){

        List<WebElement> table = Driver.getDriver().findElements(By.xpath("(//table[@id='customers']//tbody//tr)[1]"));

        List<String> companyTexts = new LinkedList<>();
        List<String> all = new LinkedList<>();
        List<String> countryTexts = new LinkedList<>();

        String pa = null;

        Map<String,String> company = new LinkedHashMap<>();
        Map<String,String> contact = new LinkedHashMap<>();
        Map<String,String> country = new LinkedHashMap<>();



        for (int i = 1; i < 4; i++) {
            WebElement mood = Driver.getDriver().findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th["+i+"]"));
            WebElement mood1 = Driver.getDriver().findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td["+i+"]"));
            WebElement mood2 = Driver.getDriver().findElement(By.xpath("//*[@id='customers']/tbody/tr[3]/td["+i+"]"));
            WebElement mood3 = Driver.getDriver().findElement(By.xpath("//*[@id='customers']/tbody/tr[4]/td["+i+"]"));
            WebElement mood4 = Driver.getDriver().findElement(By.xpath("//*[@id='customers']/tbody/tr[5]/td["+i+"]"));
            WebElement mood5 = Driver.getDriver().findElement(By.xpath("//*[@id='customers']/tbody/tr[6]/td["+i+"]"));
            all.add(mood.getText());
            all.add(mood1.getText());
            all.add(mood2.getText());
            all.add(mood3.getText());
            all.add(mood4.getText());
            all.add(mood5.getText());
        }
        company.put("Company", String.valueOf(all));
        contact.put("Contact", String.valueOf(all));
        country.put("Country", String.valueOf(all));

        if (company.containsKey(tag)){
            company.get(name);
        } else if (contact.containsKey(tag)) {
            contact.get(name);
        } else if (country.containsKey(tag)) {
            country.get(name);
        }

        return this;

    }





}
