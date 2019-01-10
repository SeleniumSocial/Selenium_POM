package uk.sponte.automation.seleniumpom.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;
import uk.sponte.automation.seleniumpom.PageSection;

import java.util.List;

/**
 * Test section with buttons, headers and lists

 * Edited by nihanth on 09/01/19.
 */
public class TestSection extends PageSection {
    @FindBy(tagName = "h1")
    public PageElement headline;

    @FindBy(tagName = "h2")
    public PageElement subtitle;

    @FindBy(css = "input[name=addNewItem]")
    public PageElement addNewItemButton;

    @FindBy(css = "input[name=addTwoNewItems]")
    public PageElement addTwoNewItemsButton;

    @FindBy(css = "input[name=removeItem]")
    public PageElement removeItemButton;

    @FindBy(tagName = "li")
    public List<PageElement> listItems;
}
