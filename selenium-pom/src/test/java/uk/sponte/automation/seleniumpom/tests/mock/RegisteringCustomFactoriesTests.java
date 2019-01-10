package uk.sponte.automation.seleniumpom.tests.mock;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import uk.sponte.automation.seleniumpom.PageFactory;
import uk.sponte.automation.seleniumpom.dependencies.DependencyFactory;

/**
 * Edited by nihanth on 09/01/19.
 
 * Verifies that user can add factories for objects
 */
public class RegisteringCustomFactoriesTests {

    @Test
    public void canUseAlternativeWebDriverFactory() {

        DependencyFactory<WebDriver> driverFactory = new DependencyFactory<WebDriver>() {
            @Override
            public WebDriver get() {
                return new ChromeDriver();
            }
        };

        PageFactory pageFactory = new PageFactory(driverFactory);
        WebDriver driver = pageFactory.getDriver();
        Assert.assertEquals(EventFiringWebDriver.class, driver.getClass());
        driver.quit();
    }
}
