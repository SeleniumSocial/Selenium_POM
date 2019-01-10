package uk.sponte.automation.seleniumpom.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;

/**
 * Edited by nihanth on 09/01/19.
 */
public class Result {
    @FindBy(tagName = "h2")
    public PageElement title;
}
