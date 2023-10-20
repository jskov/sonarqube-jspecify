package jspecify;

import org.immutables.value.Value.Immutable;
import org.jspecify.annotations.Nullable;

@Immutable
public interface WithJspecify {
    @Nullable String appName();
}
