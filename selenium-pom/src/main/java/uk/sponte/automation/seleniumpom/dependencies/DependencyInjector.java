package uk.sponte.automation.seleniumpom.dependencies;

/**
 * Created by nihanth on 08/01/19.
 */
public interface DependencyInjector {
    <T> T get(Class<T> klass) throws InjectionError;
}
