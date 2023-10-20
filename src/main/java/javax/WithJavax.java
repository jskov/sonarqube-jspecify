package javax;

import javax.annotation.Nullable;

import org.immutables.value.Value.Immutable;

@Immutable
public interface WithJavax {
    @Nullable String appName();
}
