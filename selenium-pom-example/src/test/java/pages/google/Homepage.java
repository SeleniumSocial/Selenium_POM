package pages.google;

import org.openqa.selenium.support.FindBy;
import pages.google.sections.homepage.SearchForm;

/**
 * Edited by nihanth on 09/01/19.
 */
public class Homepage {
    @FindBy(css = ".sbibod")
    public SearchForm searchForm;
}
