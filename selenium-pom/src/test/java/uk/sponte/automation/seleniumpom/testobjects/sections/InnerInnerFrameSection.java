package uk.sponte.automation.seleniumpom.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;

import java.util.concurrent.TimeoutException;

/**
 * Edited by nihanth on 09/01/19.
 */
public class InnerInnerFrameSection {
    @FindBy(css = "h2.inner2")
    public PageElement title;

    @FindBy(id = "createElementAfterDelay")
    private PageElement createElementAfterDelay;

    public PageElement newElement;

    public PageElement clickAndWaitForNewContent() throws TimeoutException {
        this.createElementAfterDelay.click();
        newElement.waitFor();
        return newElement;
    }
}
