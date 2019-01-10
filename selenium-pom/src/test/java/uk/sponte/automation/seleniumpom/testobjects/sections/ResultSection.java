package uk.sponte.automation.seleniumpom.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.annotations.Section;

import java.util.List;

/**
 * Edited by nihanth on 09/01/19.
 */
public class ResultSection {

    @FindBy(css = ".result")
    public List<Result> results;
}
