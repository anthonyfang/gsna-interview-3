import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class CustomersSteps {
    CustomersPage page = new CustomersPage();

    public void openPage() {
        page.openPage();
    }

    public void searchInput(String input) {
        // TODO
    }

    public void checkIfTableContainsString(String text) {
        // TODO
    }

    public void checkIfTableNotContainsString(String text) {
        // TODO
    }

    public void checkIfTableResumeContainsText(String fragment) {
        // TODO
    }

    public void closePage() {
        page.closePage();
    }

    public void openAndSearchByName(String searchString) {
        openPage();
        searchInput(searchString);
    }

    public void openAndSearchByEmail(String searchString) {
        //TODO
    }

    public void setMatchCase(boolean selected) {
        //TODO
    }

    public void checkIfTableContainsExpectedNumberOfRows(String numberOfRows) {
        //TODO
    }

    public void clearSearchParameters() {
        //TODO
    }

    public void shouldContainLink(String link) {
        assertThat(page.containsLink(link), is(true));
    }

    public void clickOnClearButton() {
        // TODO
    }
}
