package uk.sponte.automation.seleniumpom.tests.ui;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class

 * Edited by nihanth on 09/01/19.
 */
public class StaleElementTests extends BasePageTest {
    @Test
    public void automaticallyRefreshesModelAfterStaleElementException() {
        String paragraphsText = testPage.staleElementsSection.getParagraphsText();
        testPage.staleElementsSection.triggerStaleElement();
        Assert.assertEquals(paragraphsText, testPage.staleElementsSection.getParagraphsText());
    }
}
