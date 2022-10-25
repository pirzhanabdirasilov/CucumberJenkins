package PageWeb;

import javafx.beans.value.WeakChangeListener;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCourses extends BasePage{

    @FindBy(xpath = "(//a[@href='https://abdirasilov3422.talentlms.com/course/create'])[2]")
    private WebElement clickCoursesButton;

    @FindBy(xpath = "(//input[@name='name'])")
    private WebElement name;

    @FindBy(xpath = "//*[@id='s2id_tl-course-category-select']/a/span[1]")
    private WebElement samplesInput;

    @FindBy(xpath = "(//span[@class='select2-arrow'])[1]")
    private WebElement category;

    @FindBy(xpath = "(//div[@class='select2-result-label'])[1]")
    private WebElement saples;

    @FindBy(xpath = "(//textarea[@name='description'])[1]")
    private WebElement des;

    @FindBy(xpath = "(//input[@name='submit_course'])[1]")
    private WebElement clickSave;

    @FindBy(xpath = "(//i[@class='icon-plus icon-grid tl-toggle-user'])[1]")
    private WebElement clickUser;

    @FindBy(xpath = "(//a[@href='https://abdirasilov3422.talentlms.com/dashboard'])[3]")
    private WebElement home;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[2]")
    private WebElement courses;

    @FindBy(xpath = "(//input[@id='tl-grid-checkbox-all'])")
    private WebElement all;

    @FindBy(xpath = "(//input[@data-id='125'])")
    private WebElement first;

    @FindBy(xpath = "(//input[@data-id='123'])")
    private WebElement secend;

    @FindBy(xpath = "(//input[@data-id='122'])")
    private WebElement thrirt;

    @FindBy(xpath = "(//input[@data-id='113'])")
    private WebElement four;

    @FindBy(xpath = "(//input[@data-id='46'])")
    private WebElement five;

    @FindBy(xpath = "(//input[@data-id='124'])")
    private WebElement six;

    @FindBy(xpath = "(//a[@class='btn dropdown-toggle'])")
    private WebElement more;

    @FindBy(xpath = "(//a[@class='massaction'])[3]")
    private WebElement delete;

    @FindBy(xpath = "(//a[@class='btn deletecourses btn-danger'])")
    private WebElement DELETE;

    public AddNewCourses clickCourses(){
        helpers.jsClick(clickCoursesButton);
        return this;
    }
    public AddNewCourses coursesName(String name1,String dis){
        helpers.jsSendKeys(name,name1)
                .click(samplesInput)
                .click(saples)
                .jsSendKeys(des,dis);
        return this;
    }
    public AddNewCourses clickSavaButton(){
        helpers.jsClick(clickSave);
        return this;
    }
    public AddNewCourses clickUser1(){
        helpers.pause(5);
        helpers.jsClick(clickUser);
        helpers.pause(5);
                helpers.jsClick(home);
        return this;
    }

    public AddNewCourses deleteCourses(){
        helpers.click(courses)
                .jsClick(all)
                .jsClick(first)
                .jsClick(secend)
                .jsClick(thrirt)
                .jsClick(four)
                .jsClick(five)
                .jsClick(six)
                .pause(5)
                .jsClick(more)
                .jsClick(delete)
                .jsClick(DELETE)
                .pause(3);
        return this;
    }


}
