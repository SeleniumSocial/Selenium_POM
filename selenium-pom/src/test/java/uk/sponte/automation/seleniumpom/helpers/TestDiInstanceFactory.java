package uk.sponte.automation.seleniumpom.helpers;

import uk.sponte.automation.seleniumpom.dependencies.DependencyFactory;

/**
 * Test dependency injection instance
 /**
 * Edited by nihanth on 09/01/19.
 */
public class TestDiInstanceFactory implements DependencyFactory<TestDiInstance> {
    @Override
    public TestDiInstance get() {
        return new TestDiInstance("secret");
    }
}
