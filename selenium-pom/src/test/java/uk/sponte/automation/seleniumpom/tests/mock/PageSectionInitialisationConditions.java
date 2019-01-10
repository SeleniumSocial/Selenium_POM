package uk.sponte.automation.seleniumpom.tests.mock;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Edited by nihanth on 09/01/19.
 
 * PageConditions tests
 */
public class PageSectionInitialisationConditions extends BaseMockTest {

    @Test
    public void basedOnSectionAnnotation() {
        assertNotNull(testPage.parent);
    }

    @Test
    public void basedOnFindByAnnotation() {
        assertNotNull(testPage.basedOnFindByAnnotation);
    }

    @Test
    public void basedOnFieldType() {
        assertNotNull(testPage.section);
    }
}
