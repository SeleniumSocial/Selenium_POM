package uk.sponte.automation.seleniumpom.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.annotations.Section;
import uk.sponte.automation.seleniumpom.PageSection;

import java.util.List;

/**
 * Edited by nihanth on 09/01/19.
 */
public class ListItem extends PageSection {
    @Section
    @FindBy(className = "listSubItem") public List<ListSubItem> subItems;
}
