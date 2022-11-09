package steps_defs;

import MethodFactory.MethodsHelpers;
import POJO.HTMLTablesPojo;
import PageWeb.*;
import PageWeb.imovingPage.Scenario1;
import PageWeb.imovingPage.Scenario2;
import PageWeb.imovingPage.Scenario3;
import PageWeb.imovingPage.Test1IMoving;
import PageWeb.user.AddCreatePage;
import PageWeb.user.AddNewCourses;
import com.github.javafaker.Faker;
import drivers.Driver;
import drivers.DriverInterface;
import drivers.DriverMethods;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public  abstract class BaseTest extends BasePage implements DriverInterface {

   protected SoftAssertions softAssert = new SoftAssertions();


   protected Faker faker = new Faker();

   protected DriverMethods driverMethods = new DriverMethods(Driver.getDriver());

   protected LoginPage login = new LoginPage();

   protected AddCreatePage addCreatePage = new AddCreatePage();

   protected AddNewCourses courses = new AddNewCourses();

   protected DataPage dataPage = new DataPage();

   protected IMovingPage iMovingPage = new IMovingPage();

   protected Test1IMoving iMoving = new Test1IMoving();

   protected HTMLTablesPage tablesPage = new HTMLTablesPage();

   protected HTMLTablesPojo pojo = new HTMLTablesPojo();

   protected Scenario1 scenario1 = new Scenario1();

   protected Scenario2 scenario2 = new Scenario2();

   protected Scenario3 scenario3 = new Scenario3();







   public void pageDown(int num)throws  Exception {
      Robot robot = new Robot();
      for (int i = 0; i < num; i++) {
         robot.keyPress(KeyEvent.VK_PAGE_DOWN);
         robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
      }
   }

   @Override
   public void goToWebSite(String usl) {
      driverMethods.openToUrl(usl);
   }
   public void switchFrame(WebElement element){
      driverMethods.switchTo(element);
   }


}
