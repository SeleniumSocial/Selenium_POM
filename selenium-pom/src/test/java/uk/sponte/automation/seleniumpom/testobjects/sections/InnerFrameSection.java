package uk.sponte.automation.seleniumpom.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;
import uk.sponte.automation.seleniumpom.annotations.Frame;

/**
 * Edited by nihanth on 09/01/19.
 */
public class InnerFrameSection {
    @Frame
    @FindBy(tagName = "iframe")
    public InnerInnerFrameSection innerInnerFrameSection;
}
