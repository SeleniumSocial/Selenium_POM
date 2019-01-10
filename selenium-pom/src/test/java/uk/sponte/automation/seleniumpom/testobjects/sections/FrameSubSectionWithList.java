package uk.sponte.automation.seleniumpom.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;

import java.util.List;

/**
 * Edited by nihanth on 09/01/19.
 */
public class FrameSubSectionWithList {
    @FindBy(tagName = "li")
    public List<PageElement> items;
}
