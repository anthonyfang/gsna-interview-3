import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomersTest {

    CustomersSteps steps;

    @Before
    public void setUp() {
        steps = new CustomersSteps();
    }

    @After
    public void clear() {
        steps.closePage();
    }

    @Test
    public void checkDefaultSearch() {
        steps.openAndSearch("b");
        steps.checkIfTableContainsString("Alabaster");
    }

    @Test
    public void checkNumberOfFindRowsInTableResumePageObject() {
        steps.openPage();
        steps.searchInput("b");
        steps.checkIfTableResumeContainsText("Showing 2 of 3 customers");
    }


    @Test
    public void matchCaseOptionPageObject() {
        //GIVEN
        steps.openAndSearch("B");
        //WHEN
        steps.setMatchCase();
        //THEN
        steps.checkIfTableContainsString("Bondir");
        steps.checkIfTableNotContainsString("Alabaster");
    }

    @Test
    public void clearButtonTestPageObject() {
        //GIVEN
        steps.openPage();
        steps.searchInput("Bondir");
        steps.checkIfTableNotContainsString("Alabaster");

        //WHEN
        steps.clickOnClearButton();

        //THEN
        steps.shouldContainLink("office@alabaster.com");
        steps.checkIfTableContainsString("office@alabaster.com");
        steps.checkIfTableContainsString("conatact@postimex.pl");
        steps.checkIfTableContainsString("info@bond.ir");
    }
}
