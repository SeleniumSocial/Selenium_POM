package uk.sponte.automation.seleniumpom.helpers;

import java.util.Collection;

/**
 * Edited by nihanth on 08/01/19.
 */
public class ArrayHelper {
    public static <T> String join(Iterable<T> aArr, String sSep) {
        StringBuilder sbStr = new StringBuilder();

        boolean first = true;
        for (Object o : aArr) {
            if(!first) sbStr.append(sSep);
            first = false;
            sbStr.append(o.toString());
        }

        return sbStr.toString();
    }
}
