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
    public void TC_01_clearButtonTestPageObject() {
        //GIVEN
        steps.openAndSearchByName("Bondir");

        //WHEN
        steps.clearSearchParameters();

        //THEN
        steps.checkIfTableContainsString("Alabaster");
    }

    @Test
    public void TC_02_matchCaseOptionPageObject() {
        //GIVEN
        steps.openAndSearchByName("B");
        //WHEN
        steps.setMatchCase(true);
        //THEN
    }

    @Test
    public void TC_03_checkDefaultSearch() {
        steps.openAndSearchByName("b");
        steps.checkIfTableContainsExpectedNumberOfRows("2");
    }

    @Test
    public void TC_04_checkSearchColumn() {
        steps.openAndSearchByEmail("office");
        steps.shouldContainLink("office@alabaster.com");
        steps.checkIfTableResumeContainsText("Showing 1 of 3 customers filtered by term \"office\" in Email column without match case.");
    }
}
