magnolia-thymeleaf-renderer
================================

This is a working, fully functional integration of the thymeleaf template engine into magnolia cms

Now supports thymeleaf3
=======================

Thymeleaf3 required a complete rewrite. So if you want to use thymeleaf2 you should go for 0.2.1. The 0.3.0 Release is completely new and works only with thymeleaf3.
You still can find the thymeleaf2 version in the thymeleaf2 branch.

It supports blossom (spring-mvc) templates. MTK should work too, let me know if you tried it.


The custom dialect comes with cms:init, cms:area and cms:component


To see how the blossom-serlvet needs to be setup, and how to use the magnolia processors take a look at the example web app and the [wiki pages](https://github.com/eiswind/magnolia-thymeleaf-renderer/wiki).

Maven coordinates:
```xml
<repositories>
    <repository>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <id>bintray-eiswind</id>
        <name>bintray</name>
        <url>http://dl.bintray.com/eiswind/maven</url>
    </repository>
</repositories>

<dependency>
    <groupId>de.eiswind</groupId>
    <artifactId>magnolia-blossom-thymeleaf-module</artifactId>
    <version>0.3.2</version>
</dependency>
```
March 2017: thymeleaf 3.0.3 support, Magnolia 5.5.2, Blossom 3.1.3

March 2016: thymeleaf 3 support, Magnolia 5.4.x, Blossom 3.1.x

April 2015: Magnolia 5.3.8, Blossom 3.0.6
March 2015: Magnolia 5.3.7

December 2014: Update to Magnolia 5.3.6 and Spring4. Added basic testing.

Oktober 2014: Updated the dependencies and the example to magnolia 5.3.4 and blossom 3.0.4, now depending on bundled wepapp artifact


