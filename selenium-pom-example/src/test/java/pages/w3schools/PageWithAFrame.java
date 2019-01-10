package pages.w3schools;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.annotations.Frame;

/**
 * Edited by nihanth on 09/01/19.
 */
public class PageWithAFrame {
    @Frame
    @FindBy(css = "iframe[src=\"default.asp\"]")
    public FrameContent frameContent;
}
