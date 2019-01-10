package uk.sponte.automation.seleniumpom.dependencies;

import com.google.inject.Provider;

/**
 * Created by nihanth on 08/01/19.
 */
public interface DependencyFactory<T> extends Provider<T> {
    T get();
}