package uk.sponte.automation.seleniumpom.testobjects.pages;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;

import java.util.List;

/**
 * Edited by nihanth on 09/01/19.
 */
public class AnimatedTestPage {
    public PageElement moveButton;

    @FindBy(css = ".listItem")
    public List<PageElement> listElements;
}
