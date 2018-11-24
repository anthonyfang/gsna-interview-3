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
    }

    @Test
    public void checkNumberOfFindRowsInTableResumePageObject() {
    }

    @Test
    public void matchCaseOptionPageObject() {
    }

    @Test
    public void clearButtonTestPageObject() {
    }
}
