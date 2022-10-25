package steps_defs;

import MethodFactory.MethodsHelpers;
import PageWeb.*;
import com.github.javafaker.Faker;
import drivers.Driver;
import drivers.DriverInterface;
import drivers.DriverMethods;
import gherkin.lexer.Da;

import java.awt.*;
import java.awt.event.KeyEvent;

public  abstract class BaseTest extends BasePage implements DriverInterface {


   protected MethodsHelpers helper = new MethodsHelpers();
   protected LoginPage loginPage = new LoginPage();


   protected Faker faker = new Faker();

   protected DriverMethods driverMethods = new DriverMethods(Driver.getDriver());

   protected LoginPage login = new LoginPage();

   protected AddCreatePage addCreatePage = new AddCreatePage();

   protected AddNewCourses courses = new AddNewCourses();

   protected DataPage dataPage = new DataPage();

   protected IMovingPage iMovingPage = new IMovingPage();

   protected Test1IMoving iMoving = new Test1IMoving();







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


}
