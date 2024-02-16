# Overview

A follow up to this repo https://github.com/Particeep/java-interview as an answer to the coding challenge java-interview.

the following file was updated `~/project/build.properties`

```yaml
sbt.version=1.9.8
```

→ the **sbt** version was modified to `1.9.8` because the `1.5.5`  version had a bug which resulted in the following exception.

```xml
java.lang.ClassCastException: class java.lang.UnsupportedOperationException cannot be cast to class xsbti.FullReload (java.lang.UnsupportedOperationException is in module java.base of loader 'bootstrap'; xsbti.FullReload is in unnam
ed module of loader 'app')
```

a `pom.xml` file was added to compile and run tests in a maven project.

# Dependencies

the `vavr` dependency was added to the `pom.xml` file.

```xml
<dependencies>
        <dependency>
            <groupId>io.vavr</groupId>
            <artifactId>vavr</artifactId>
            <version>0.9.0</version>
        </dependency>
    </dependencies>
```

# Test

To test the project using `sbt` 

```xml
cd ~/java-scala
sbt clean update compile
sbt test
```

results after running the command `sbt test` 

```xml
[info] The Collection test
[info] - should compute some value for second method
[info] BasicTestSpec:
[info] AsyncTestSpec:
[info] The Basic test
[info] The Async test
[info] - should compute power
[info] - should compute ceo and enterprise
[info] Run completed in 442 milliseconds.
[info] Total number of tests run: 4
[info] Suites: completed 3, aborted 0
[info] Tests: succeeded 4, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 6 s, completed Feb 16, 2024, 3:49:10 PM
```