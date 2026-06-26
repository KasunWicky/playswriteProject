package groups;

import org.pracTest.App;

import java.util.Arrays;
import java.util.List;

public class Regression implements TestGroup {

    @Override
    public List<Class<?>> getTestClasses() {
        return Arrays.asList(
                App.class
        );
    }
}