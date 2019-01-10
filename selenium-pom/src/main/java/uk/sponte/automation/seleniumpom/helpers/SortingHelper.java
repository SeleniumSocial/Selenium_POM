package uk.sponte.automation.seleniumpom.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * Edited by nihanth on 09/01/19.
 */
public class SortingHelper {
    public static <T> List<T> asSortedList(Collection<T> c, Comparator<T> comparator) {
        List<T> list = new ArrayList<T>(c);
        java.util.Collections.sort(list, comparator);
        return list;
    }
}
