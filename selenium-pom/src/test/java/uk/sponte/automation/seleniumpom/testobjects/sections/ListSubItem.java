package uk.sponte.automation.seleniumpom.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;
import uk.sponte.automation.seleniumpom.PageSection;

/**
 * Edited by nihanth on 09/01/19.
 */
public class ListSubItem extends PageSection {
    @FindBy(tagName = "h5") public PageElement headline;
}
