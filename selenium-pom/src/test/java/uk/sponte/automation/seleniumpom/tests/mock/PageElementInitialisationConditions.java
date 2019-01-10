package uk.sponte.automation.seleniumpom.tests.mock;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Edited by nihanth on 09/01/19.
 */
public class PageElementInitialisationConditions extends BaseMockTest {
    @Test
    public void pageCreation() {
        assertNotNull("page has not been initialised", testPage);
    }

    @Test
    public void basedOnFindByAnnotation() {
        assertNotNull("pageElement has not been initialized", testPage.headline);
    }

    @Test
    public void basedOnPageElementType() {
        assertNotNull(testPage.drag);
    }

}
