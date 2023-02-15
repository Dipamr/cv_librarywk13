package uk.co.library.pages;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='keywords']")
    WebElement JobTitle;
    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;
    @FindBy(xpath = "//select[@class='hp-distance form__select']")
    WebElement distanceDropDown;
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOption;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement SalaryTypeDropDown;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement JobTypeDropDown;
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;
    public void enterJobTitle(String title) {
        sendTextToElement(JobTitle, title);


    }
    public void enterLocation(String loction) {
        sendTextToElement(Location, loction);


    }

    public void selectDistanceFromDropDown(String distance){
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }


   // public void clickOnMoreSearchOptionLink() {// clickOnElement(MoreSearchOptionLink);
       // clickOnElement(moreSearchOptionLink);


   // }
    //moreSearchOptionsLink


    public void clickOnMoreSearchOption(){
        log.info("Clicked on more search option :" + moreSearchOption.getText());
        clickOnElement(moreSearchOption);
    }

    public void enterSalaryMin(String minSalary) {
        sendTextToElement(salaryMin,minSalary );

    }

    public void enterSalaryMax(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);

    }

    public void selectSalaryTypeDropDown(String sType){
        selectByValueFromDropDown(SalaryTypeDropDown,sType);
    }



    public void selectJobTypeDropDown(String jobType){
        selectByValueFromDropDown(JobTypeDropDown,jobType);
    }

    public void clickOnFINDJOBS() {
        clickOnElement(findJobsBtn);


    }

}
