package uk.sponte.automation.seleniumpom.testobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;
import uk.sponte.automation.seleniumpom.testobjects.sections.ListItem;
import uk.sponte.automation.seleniumpom.testobjects.sections.TestSection;

import java.util.List;

/**
 * Edited by nihanth on 09/01/19.
 */
public class CachingTestPage {

    @FindBy(id = "section")
    public WebElement webElement;

    @FindBy(id = "section")
    public PageElement pageElement;

    @FindBy(id = "section")
    public TestSection pageSection;

    @FindBy(className = "listItem")
    public List<ListItem> listItems;

    @FindBy(className = "expiringListItem")
    public List<ListItem> expiringListItems;

    @FindBy(className = "expiringListItem")
    public List<PageElement> expiringListItemsPageElement;
}
