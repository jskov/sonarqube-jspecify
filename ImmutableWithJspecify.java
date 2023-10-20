package jspecify;

import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;
import org.jspecify.annotations.Nullable;

/**
 * Immutable implementation of {@link WithJspecify}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableWithJspecify.builder()}.
 */
@Generated(from = "WithJspecify", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutableWithJspecify implements WithJspecify {
  private final java.lang.@Nullable String appName;

  private ImmutableWithJspecify(java.lang.@Nullable String appName) {
    this.appName = appName;
  }

  /**
   * @return The value of the {@code appName} attribute
   */
  @Override
  public java.lang.@Nullable String appName() {
    return appName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WithJspecify#appName() appName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for appName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWithJspecify withAppName(java.lang.@Nullable String value) {
    if (Objects.equals(this.appName, value)) return this;
    return new ImmutableWithJspecify(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableWithJspecify} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableWithJspecify
        && equalTo(0, (ImmutableWithJspecify) another);
  }

  private boolean equalTo(int synthetic, ImmutableWithJspecify another) {
    return Objects.equals(appName, another.appName);
  }

  /**
   * Computes a hash code from attributes: {@code appName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(appName);
    return h;
  }

  /**
   * Prints the immutable value {@code WithJspecify} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "WithJspecify{"
        + "appName=" + appName
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link WithJspecify} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable WithJspecify instance
   */
  public static ImmutableWithJspecify copyOf(WithJspecify instance) {
    if (instance instanceof ImmutableWithJspecify) {
      return (ImmutableWithJspecify) instance;
    }
    return ImmutableWithJspecify.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableWithJspecify ImmutableWithJspecify}.
   * <pre>
   * ImmutableWithJspecify.builder()
   *    .appName(@org.jspecify.annotations.Nullable String | null) // nullable {@link WithJspecify#appName() appName}
   *    .build();
   * </pre>
   * @return A new ImmutableWithJspecify builder
   */
  public static ImmutableWithJspecify.Builder builder() {
    return new ImmutableWithJspecify.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableWithJspecify ImmutableWithJspecify}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "WithJspecify", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private @javax.annotation.Nullable java.lang.@Nullable String appName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code WithJspecify} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(WithJspecify instance) {
      Objects.requireNonNull(instance, "instance");
      java.lang.@Nullable String appNameValue = instance.appName();
      if (appNameValue != null) {
        appName(appNameValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link WithJspecify#appName() appName} attribute.
     * @param appName The value for appName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder appName(java.lang.@Nullable String appName) {
      this.appName = appName;
      return this;
    }

    /**
     * Builds a new {@link ImmutableWithJspecify ImmutableWithJspecify}.
     * @return An immutable instance of WithJspecify
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableWithJspecify build() {
      return new ImmutableWithJspecify(appName);
    }
  }
}
