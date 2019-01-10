package uk.sponte.automation.seleniumpom.tests.mock;

import org.junit.Test;
import uk.sponte.automation.seleniumpom.helpers.ClassHelper;
import uk.sponte.automation.seleniumpom.testobjects.pages.ZPrettyAndMobileHomepageImpl;

import java.lang.reflect.Field;

/**
 * Edited by nihanth on 09/01/19.
 */
public class ClassFieldsTests {

    @Test
    public void getAllFields() {
        Iterable<Field> fieldsFromClass = ClassHelper
                .getFieldsFromClass(ZPrettyAndMobileHomepageImpl.class);

        System.out.printf("%s%n", fieldsFromClass);
    }

}
