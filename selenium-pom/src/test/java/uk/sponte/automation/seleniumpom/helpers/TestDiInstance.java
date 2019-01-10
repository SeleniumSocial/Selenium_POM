package uk.sponte.automation.seleniumpom.helpers;

/**
 * Edited by nihanth on 09/01/19.
 */
public class TestDiInstance {
    private String name;

    public TestDiInstance(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("This instance is called '%s'", this.name);
    }
}
