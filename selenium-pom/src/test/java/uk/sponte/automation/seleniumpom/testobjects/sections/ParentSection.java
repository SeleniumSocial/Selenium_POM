package uk.sponte.automation.seleniumpom.testobjects.sections;

import uk.sponte.automation.seleniumpom.PageSection;
import uk.sponte.automation.seleniumpom.annotations.Section;

/**
 * Edited by nihanth on 09/01/19.
 */
public class ParentSection extends PageSection {
    @Section
    public ChildSection child;
}
