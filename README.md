# SonarLint vs jspecify/javax Nullable

See [Caller.java](./src/main/java/Caller.java) which calls two Immutable-generated builder methods with null-argument.

One is using `@java.annotation.Nullable` and it behaves as expected.

The one using `@org.jspecify.annotations.Nullable` (see [code](./ImmutableWithJspecify.java)) causes the call to be flagged as missing `@Nullable`:

    Annotate the parameter with @javax.annotation.Nullable in method 'appName' declaration, or make sure that null can not be passed as argument.


Reported [here](https://community.sonarsource.com/t/handling-of-jspecify-nullable-broken-i-think/102998)
