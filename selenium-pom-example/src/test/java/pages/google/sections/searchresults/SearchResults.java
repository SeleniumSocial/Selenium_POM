package pages.google.sections.searchresults;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageSection;

import java.util.List;

/**
 * Edited by nihanth on 09/01/19.
 */
public class SearchResults extends PageSection {
    @FindAll({
            @FindBy(css = "div > div.rc"),
            @FindBy(css = "._NId > .srg > .g div.rc")
    })
    public List<SearchResult> results;
}
