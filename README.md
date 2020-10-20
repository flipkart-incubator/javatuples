# javatuples

This is a fork of [javatuples](https://github.com/javatuples/javatuples) with following improvements/fixes:

 1. Built on Java 8 using Maven 3 with latest plugins
 2. Serialization (with popular libraries such as Jackson etc.) working correctly
     * Tested for tuples containing data types `boolean`, `int`, `String` and `double`  
 
Even with above improvements, this fork maintains: 

 1. No change from original in its interface (your existing code should compile just fine when you upgrade to this)
 2. Zero dependency on any library (needs only JDK)

## Usage
If you are using Maven, add below entry within the `dependencies` section of your `pom.xml`:

```xml
<dependency>
  <groupId>com.flipkart.utils</groupId>
  <artifactId>javatuples</artifactId>
  <version>3.0</version>
</dependency>
```

See artifact details: [com.flipkart.utils:javatuples on **Maven Central**](https://search.maven.org/search?q=g:com.flipkart.utils%20AND%20a:javatuples&core=gav).

If you're using Gradle or Ivy or SBT, see how to include this library in your build:
[com.flipkart.utils:javatuples:3.0](https://mvnrepository.com/artifact/com.flipkart.utils/javatuples/3.0).

## How to build?
To build this project, follow below simple steps:

 1. Do a `git clone` of this repository
 2. Checkout latest stable version `git checkout v3.0`
 3. Execute `mvn clean install` from shell

