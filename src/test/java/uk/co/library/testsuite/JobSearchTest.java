package uk.co.library.testsuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;
    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        resultPage =new ResultPage();
    }


    @Test(dataProvider = "JobSearch", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String title,String location,String distance,String salaryMin,
                                                           String salaryMax,String salaryType,String jobType,String result){

        homePage.clickOnMoreSearchOption();
     homePage.enterJobTitle(title);
     homePage.enterLocation(location);
     homePage.selectDistanceFromDropDown(distance);
     homePage.enterSalaryMin(salaryMin);
     homePage.enterSalaryMax(salaryMax);
     homePage.selectSalaryTypeDropDown(salaryType);
     homePage.selectJobTypeDropDown(jobType);
     homePage.clickOnFINDJOBS();
     resultPage.verifyTheResults(result);




    }

}