package steps_defs;


import org.junit.Test;



public class Main extends BaseTest {


    public static void main(String[] args) {
        String str = "dmsdmsl";


    }


    @Test
    public void test1(){
        goToWebSite("https://www.w3schools.com/html/html_tables.asp");

        try {
            helpers.arrowDown(6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//       List<WebElement> Headers = Driver.getDriver().findElements(By.xpath("(//table[@id='customers']//tbody//tr)[1]"));
//
//        for(WebElement el : Headers){
//            System.out.println(el.getText());
//        }
//        tablesPage.tableMethods();



    }


}
