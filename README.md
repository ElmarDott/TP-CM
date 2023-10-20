# together Platform :: Configuration Management

This repository includes all necessary files to build and compile atrifacts of the
project together platform (TP). All Artifacts of the together platform are build
Maven 3.5.x and developed with the NetBeans IDE.

## Getting Started

The directory build-workflow contains the parent-pom and all global dependencies
groupt by libraries. To make the POMs available for your project, run the pom.xml
in the root folder from the command line and type mvn. Thats all.

The initializations scripts for the DBMS you will find in the dbms/src/sql directory.

For additional services like database server and so on, docker containers are our
choice. in the folder docker you find a linux script to install docker on Ubuntu.
Depending on your OS and Docker version, some adaptions to install docker could
be needed. Please use check as first the official documentation to install and run
docker on your maschine.

We like to do the things simple. For that we decided to use community images from
docker hub. To make those images ready for production please check the documenation
page of the images. The README files inside of the docker sevice folders gives
detailed information how to run the image in the context of together platform.

### Prerequisites

* Java 8 SE JDK
* Maven 3.5.x
* Docker
* NetBeans IDE (recommended) / JetBrains IntelliJ / Eclipse

### Installation

All released Artifacts will be available on Maven Central for usage.

**Maven**
PARENT POM: build workflow
```
<parent>
    <groupId>io.github.together</groupId>
    <artifactId>build-workflow</artifactId>
    <version>1.1.0</version>
</parent>
```
For useing the Bundels in your project you can place the following connfiguration
in your POM. If you already use the the build-workflow as your parent POM then you
don't need to insert the <dependency> section.
...
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>io.github.together.libraries</groupId>
                <artifactId>bundle-logging</artifactId>
                <version>${framework.logging.version}</version>
                <type>pom</type>
            </dependency>
            <dependency>
                <groupId>io.github.together.libraries</groupId>
                <artifactId>bundle-spring</artifactId>
                <version>${framework.spring.version}</version>
                <type>pom</type>
            </dependency>
            <dependency>
                <groupId>io.github.together.libraries</groupId>
                <artifactId>bundle-hibernate</artifactId>
                <version>${framework.hibernate.version}</version>
                <type>pom</type>
            </dependency>
            <dependency>
                <groupId>io.github.together.libraries</groupId>
                <artifactId>bundle-jarkarta</artifactId>
                <version>${framework.jarkarta.version}</version>
                <type>pom</type>
            </dependency>
            <dependency>
                <groupId>io.github.together.libraries</groupId>
                <artifactId>bundle-spring-security</artifactId>
                <version>${framework.spring-security.version}</version>
                <type>pom</type>
            </dependency>
        </dependencies>
    </dependencyManagement>

</dependencies>
<dependency>
    <groupId>io.github.together.libraries</groupId>
    <artifactId>bundle-logging</artifactId>
    <type>pom</type>
</dependency>
<dependency>
    <groupId>io.github.together.libraries</groupId>
    <artifactId>bundle-hibernate</artifactId>
    <type>pom</type>
</dependency>
<dependency>
    <groupId>io.github.together.libraries</groupId>
    <artifactId>bundle-spring</artifactId>
    <type>pom</type>
</dependency>
<dependency>
    <groupId>io.github.together.libraries</groupId>
    <artifactId>bundle-jarkarta</artifactId>
</dependency>
<dependency>
    <groupId>io.github.together.libraries</groupId>
    <artifactId>bundle-spring-security</artifactId>
</dependency>
</dependencies>
...

## Usage

The build workflow (parent-pom) contains some useful features like distributed
dependency management and a well defined reporting. For report creation, it is only
neccesary to run the mvn site command. This will generate JavaDoc,
Cobertura test Coverrage, Checkytle, PMD, Findbugs, BDD JGiven documentation and
some other usful informations.

The release policy for all together Platform modules is based on this reports. The
rules for deployed (published) Releases are:
* fix all compiler warnings
* cobutura full project coverrage more than 80%
* all test have to pass (no skip)
* no SNAPSHOT artifacts as dependencies
* minimize all possible PMD, Findbugs & Checkstyle warnings. (sometimes they can't fixed)

The library POM is a reactor POM, to simplyfiy the deploy process. Library get only
in the case released, when bundles new added. Changes of existing bundels, like
udate a version of an dependency implies a new release of the bundle and the build-workflow.

## Authors

* **Elmar Dott** - *Concept, Architecture, Development* - [enRebaja](https://enRebaja.wordpress.com)

## License

This project is licensed under the Apache License 2.0 - For free private and
commerial usage.

## Contributors

Feel free to send a request by e-mail in the case you want to contribute the
project. Everyone is welcome, even beginners in programming. We also appreciate
help by optimizing our documentation and creating tutorials.

In the case you like this project, let me know it and rate it with a star.

## Release Notes

|Version | Comment
|--------|----------------------------------------------------------------------
| 1.1.0  | published: 5/2019 Maven Central (TP-CORE-1.2.0)
|        |  - change license to Apache 2.0
|        |  - extend bundle-jarkarta (JEE 7.0)
|        |  - extend bundle-spring-security 
|        |  - update dependencies
|--------|----------------------------------------------------------------------
| 1.0.8  | published: 10/2018 Maven Central (TP-CORE-1.1.0)
|        |  - update dependency Versions
|--------|----------------------------------------------------------------------
| 1.0.7  | published: 04/2018 Maven Central (TP-CORE-1.0.2)
|        | Libraries: 1.0
|        |  - dependencies: TP-BUNDLE Spring 5.0.2
|        |  - dependencies: TP-BUNDLE Hibernate 4.3.11
|        |  - dependencies: TP-BUNDLE Logback 1.2.3
|--------|----------------------------------------------------------------------
