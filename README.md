# javatuples

[![Build Status](https://api.travis-ci.org/flipkart-incubator/javatuples.svg?branch=master)](https://travis-ci.org/github/flipkart-incubator/javatuples)
[![Maven Central](https://img.shields.io/badge/sonatype-2.0-blue.svg)](https://oss.sonatype.org/content/repositories/releases/com/flipkart/javatuples/2.0/)
[![License](https://img.shields.io/badge/License-Apache%202-blue.svg)](./LICENSE.txt)

This is a fork of [javatuples](https://github.com/javatuples/javatuples) with following improvements/fixes:

 1. Built on Java 8 using Maven 3 with latest plugins
 2. Serialization (with popular libraries such as Jackson etc.) working correctly
     * This has been tested for data types `boolean`, `int`, `String` and `double` 
 
Even with above improvements, this fork maintains: 

 1. No change from original in its interface (your existing code should compile just fine when you upgrade to this)
 2. Zero dependency on any library (needs only JDK)
