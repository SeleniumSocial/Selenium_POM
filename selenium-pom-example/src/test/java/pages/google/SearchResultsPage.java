package pages.google;

import org.openqa.selenium.support.FindBy;
import pages.google.sections.searchresults.SearchResults;
import uk.sponte.automation.seleniumpom.PageElement;

/**
 * Edited by nihanth on 09/01/19.
 */
public class SearchResultsPage {
    public PageElement resultStats;

    @FindBy(id = "search")
    public SearchResults searchResults;
}
