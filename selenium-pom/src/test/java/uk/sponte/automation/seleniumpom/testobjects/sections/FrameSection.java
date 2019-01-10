package uk.sponte.automation.seleniumpom.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;
import uk.sponte.automation.seleniumpom.annotations.Frame;
import uk.sponte.automation.seleniumpom.annotations.Section;

/**
 * Edited by nihanth on 09/01/19.
 */
public class FrameSection {
    @FindBy(tagName = "h1")
    public PageElement headline;

    @Section
    public FrameSubSection frameSubSection;

    @Frame
    @FindBy(tagName = "iframe")
    public InnerFrameSection innerFrame;
}
