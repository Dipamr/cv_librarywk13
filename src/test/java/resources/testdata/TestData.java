package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "JobSearch")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Software Developer","Harrow Green", "up to 5 miles","30000","50000","annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Development Manager", "Wembley","up to 7 miles","30000","40000","annum","Permanent","Permanent Developer jobs in Wembley "},
                {"Teacher","Edgware","up to 5 miles","35000","37000"," Per annum","Permanent","Permanent Teacherjobs in Edgware,Greater London"},
                {"Store Manager","Stanmore","up to 5 miles","45000","50000"," annum","Permanent","Permanent Store Manager jobs in Stanmore,Greater London"},
                {"Marketing Executive","Harrow Weald,","up to 10 miles","30000","40000","annum","Permanent","Permanent Marketing Executive jobs in Harrow Weald,Greater London"},
                {"QA Analyst","Harrowgate","up to 5 miles","35000","40000","annum","Permanent","Permanent QA Analyst jobs in Harrowgate,North Yorkshire"},

        };
        return data;
    }
}
