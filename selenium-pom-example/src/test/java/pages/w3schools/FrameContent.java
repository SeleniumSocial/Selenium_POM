package pages.w3schools;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;
import uk.sponte.automation.seleniumpom.PageSection;

/**
 * Edited by nihanth on 09/01/19.
 */
public class FrameContent extends PageSection {
    @FindBy(css = "#main h2")
    public PageElement title;
}
