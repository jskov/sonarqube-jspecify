import javax.ImmutableWithJavax;

import jspecify.ImmutableWithJspecify;

public class Caller {
    public static void main(String[] args) {
        // This works as expected
        ImmutableWithJavax.builder()
            .appName(null)
            .build();

        // This shows warning:
        // Annotate the parameter with @javax.annotation.Nullable in method 'appName' declaration, or make sure that null can not be passed as argument.
        ImmutableWithJspecify.builder()
            .appName(null)
            .build();
    }
}
