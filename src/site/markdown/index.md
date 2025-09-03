# Introduction
The build-workflow is the parent-pom and the libraries module is a reactor to prepare all neccesary global dependencies (BOM) for the TP project.

## Prerequisites
* Java 21 SE adopt openJDK
* Jakarta EE 11
* Maven 3.9.x
* Docker.io (Testcontainers)
* NetBeans IDE (recommended) / JetBrains IntelliJ / Eclipse

## Installation
All released Artifacts will be available on Maven Central for usage.

## Usage
PARENT POM: build workflow
```XML
<parent>
    <groupId>io.github.together</groupId>
    <artifactId>build-workflow</artifactId>
    <version>1.6.0</version>
</parent>
```

For using the bundles in your project you can place the following configuration in your POM. If you already use the the build-workflow as your parent POM then you don't need to insert the &lt;dependency&gt; section.
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
            <type>pom</type>
        </dependency>
        <dependency>
            <groupId>io.github.together.libraries</groupId>
            <artifactId>bundle-jarkarta</artifactId>
            <version>${framework.jarkarta.version}</version>
            <type>pom</type>
        </dependency>
    </dependencies>
</dependencyManagement>

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