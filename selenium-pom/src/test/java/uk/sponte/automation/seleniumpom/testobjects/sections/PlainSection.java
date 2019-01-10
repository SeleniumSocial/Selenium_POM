package uk.sponte.automation.seleniumpom.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.annotations.Section;

/**
 * Edited by nihanth on 09/01/19.
 */
public class PlainSection {
    @FindBy(id = "plainSectionChild")
    @Section
    public ChildSection childInheritingFromPageSection;
}
