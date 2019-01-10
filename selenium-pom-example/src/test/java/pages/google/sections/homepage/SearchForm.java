package pages.google.sections.homepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;
import uk.sponte.automation.seleniumpom.PageSection;

/**
 * Edited by nihanth on 09/01/19.
 */
public class SearchForm extends PageSection {
    @FindBy(css = "[name=q]")
    private PageElement query;

    public void searchFor(String term) {
        this.query.set(term);
        this.query.sendKeys(Keys.RETURN);
    }
}
