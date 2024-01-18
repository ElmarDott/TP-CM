<img src="https://elmar-dott.com/wp-content/uploads/header-ElmarDott.jpg" style="float:left; height:50%; width:50%;" />

# together Platform :: Configuration Management

[![Maven Central](https://img.shields.io/maven-central/v/io.github.together/build-workflow.svg?label=Build%20Workflow)](https://search.maven.org/artifact/io.github.together/build-workflow)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.together/libraries.svg?label=Libraries)](https://search.maven.org/artifact/io.github.together/libraries)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.together.libraries/bundle-hibernate.svg?label=Bundle:%20Hibernate)](https://search.maven.org/artifact/io.github.together.libraries/bundle-hibernate)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.together.libraries/bundle-spring.svg?label=Bundle:%20Spring%20Framework)](https://search.maven.org/artifact/io.github.together.libraries/bundle-spring)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.together.libraries/bundle-jakarta.svg?label=Bundle:%20JakartaEE)](https://search.maven.org/artifact/io.github.together.libraries/bundle-jakarta)
[![License Apache 2](https://img.shields.io/github/license/ElmarDott/TP-CM)](https://www.apache.org/licenses/LICENSE-2.0)


**Homepage:** [together-platform.org](https://together-platform.com)
The GitHub Code Reposity contains just a backup branch of releases from https://git.elmar-dott.com.
This repository includes all necessary files to build and compile artifacts of the project together platform (TP).

## Getting Started

The build-workflow is the parent-pom and the libraries module is a reactor to prepare all neccesary global dependencies (BOM) for the TP project.

### Prerequisites

* Java 17 SE adopt openJDK
* Jakarta EE 10
* Maven 3.9.x
* Docker.io (Testcontainers)
* NetBeans IDE (recommended) / JetBrains IntelliJ / Eclipse

### Installation

All released Artifacts will be available on Maven Central for usage.

**Maven**
PARENT POM: build workflow
```XML
<parent>
    <groupId>io.github.together</groupId>
    <artifactId>build-workflow</artifactId>
    <version>1.5.0</version>
</parent>
```
For using the bundles in your project you can place the following configuration in your POM. If you already use the the build-workflow as your parent POM then you don't need to insert the <dependency> section.
```XML
<dependencyManagement>
    <dependencies>
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
            <type>pom</type>`
        </dependency>`
        <dependency>`
            <groupId>io.github.together.libraries</groupId>
            <artifactId>bundle-jarkarta</artifactId>
            <version>${framework.jarkarta.version}</version>
            <type>pom</type>
        </dependency>
    </dependencies>
</dependencyManagement>
```

```XML
</dependencies>
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
        <type>pom</type>
    </dependency>
</dependencies>
```

## Authors

* **Elmar Dott** - [*Concept, Architecture, Development*](https://elmar-dott.com)

## License

This project is licensed under the Apache 2.0 license.

## Contributors

Feel free open a pull request or to send a feature request by e-mail in the case you want to contribute the project. Everyone is welcome, even beginners in programming. I also appreciate help by optimizing the documentation and creating tutorials.

Mistakes happen. But we only able to fix them, when we you inform us you found a bug. Do not hesitate to send a report in the way you feel common. I try to give as much as possible fast & direct support.

In the case you like this project, let me know it and rate it with a star.

## Release Notes

| Version | Comment
|---------|--------------------------------------------------------------------|
| 1.5.0   | published: 01/2004
|         | Libraries: 1.4.0
|         |  - dependencies: TP-BUNDLE Spring 6.1.2
|         |  - dependencies: TP-BUNDLE Hibernate 6.4.1
|         |  - dependencies: TP-BUNDLE JavaEE 10.0.0
|         |  - migrate to Jakarta 10 EE
|         |  - migrate to Java 17 SE
|---------|--------------------------------------------------------------------|
| 1.4.1   | published: 10/2023: (TP-CORE 3.00)
|         | Libraries: 1.3.3
|         |  - dependencies: TP-BUNDLE Spring 5.3.30
|         |  - dependencies: TP-BUNDLE Hibernate 5.6.15
|         |  - dependencies: TP-BUNDLE JavaEE 8.0
|---------|--------------------------------------------------------------------|
| 1.4     | published: 10/2022: (TP-CORE 3.00)
|---------| -------------------------------------------------------------------|
| 1.3     | published: 11/2021 (TP-CORE-2.2.0)
|         |  - update dependencies
|---------|--------------------------------------------------------------------|
| 1.2     | published: 11/2019 (TP-CORE-2.1.0)
|         |  - update dependencies
|---------|--------------------------------------------------------------------|
| 1.1.1   | published: 11/2019 (TP-CORE-2.0.0)
|         |  - migrate from java 8 to java 11
|---------|--------------------------------------------------------------------|
| 1.1.0   | published: 5/2019 Maven Central (TP-CORE-1.2.0)
|         |  - change license to Apache 2.0
|         |  - extend bundle-jarkarta (JEE 7.0)
|         |  - extend bundle-spring-security
|         |  - update dependencies
|---------|--------------------------------------------------------------------|
| 1.0.8   | published: 10/2018 Maven Central (TP-CORE-1.1.0)
|         |  - update dependency Versions
|---------|--------------------------------------------------------------------|
| 1.0.7   | published: 04/2018 Maven Central (TP-CORE-1.0.2)
|         | Libraries: 1.0
|         |  - dependencies: TP-BUNDLE Spring 5.0.2
|         |  - dependencies: TP-BUNDLE Hibernate 4.3.11
|         |  - dependencies: TP-BUNDLE Logback 1.2.3
|---------|--------------------------------------------------------------------|
