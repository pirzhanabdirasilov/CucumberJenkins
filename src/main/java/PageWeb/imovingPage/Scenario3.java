package PageWeb.imovingPage;

import MethodFactory.AssetHelper;
import PageWeb.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedList;
import java.util.List;

public class Scenario3 extends BasePage {

    @FindBy(xpath = "(//a[@class='btn tab-header collapsed'])[3]")
    private WebElement clickITeam;

    @FindBy(xpath = "(//table[@class='table confirm-table']/tbody/tr/td[9])[3]")
    private WebElement iTeam1;

    @FindBy(xpath = "(//table[@class='table confirm-table']/tbody/tr/td[9])[4]")
    private WebElement iTeam2;

    @FindBy(xpath = "(//table[@class='table confirm-table']/tbody/tr/td[9])[5]")
    private WebElement iTeam3;

    @FindBy(xpath = "(//table[@class='table confirm-table']/tbody/tr/td[9])[6]")
    private WebElement iTeam4;

    @FindBy(xpath = "(//span[@class='detail-name'])[3]")
    private WebElement iTeamText;

    public Scenario3 clickITeam(){
        helpers.pause(2);
        AssetHelper.assertText("Inventory - Items",iTeamText);
            helpers.jsClick(clickITeam);
        return this;
    }

    public Scenario3 iTeamTest(int in) throws Exception {
        helpers.pause(2).arrowDown(21);
        String num = iTeam1.getText() + iTeam2.getText() + iTeam3.getText() + iTeam4.getText() ;

//        List<String> textTable = new LinkedList<>();
//        textTable.add(iTeam1.getText());
//        textTable.add(iTeam2.getText());
//        textTable.add(iTeam3.getText());
//        textTable.add(iTeam4.getText());
        char qa;
        int run = 0;

        int n;

        for (int i = 0; i < num.length(); i++) {
            qa = num.charAt(i);
            if (Character.isDigit(qa)) {
                n = Character.getNumericValue(qa);
                run += n;
            }

        }
        int txt7 = in - 3;
        Assert.assertEquals(txt7,run);
//        System.out.println("----------------------------> " + iTeam1.getText());
        return this;

    }
}
