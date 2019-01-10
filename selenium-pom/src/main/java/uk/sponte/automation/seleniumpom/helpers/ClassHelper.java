package uk.sponte.automation.seleniumpom.helpers;

import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Edited by nihanth on 08/01/19.
 */
public class ClassHelper {
    public static Iterable<Field> getFieldsFromClass(Class<?> startClass) {
        List<Field> currentClassFields = new ArrayList<Field>();
        Class<?> parentClass = startClass.getSuperclass();

        if (parentClass != null) {
            List<Field> parentClassFields =
                    (List<Field>) getFieldsFromClass(parentClass);
            currentClassFields.addAll(parentClassFields);
        }

        currentClassFields.addAll(Lists.newArrayList(startClass.getDeclaredFields()));
        return currentClassFields;
    }
}
