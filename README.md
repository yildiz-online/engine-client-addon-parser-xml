# Yildiz-Engine engine-client-parser-xml

This is the official repository of The Engine Client Addon Parser XML library, part of the Yildiz-Engine project.
This library is an addon for the engine client, providing the ability to parse scripts written in XML to load resources like materials, lights...

## Features

* XML parser.
* Load many resources.
* ...

## Requirements

To build this module, you will need the latest Java JDK and Maven 3.

## Coding Style and other information

Project website:
http://engine.yildiz-games.be

Issue tracker:
https://yildiz.atlassian.net

Wiki:
https://yildiz.atlassian.net/wiki

Quality report:
https://sonarqube.com/overview?id=be.yildiz-games:engine-client-addon-parser-xml

## License

All source code files are licensed under the permissive MIT license
(http://opensource.org/licenses/MIT) unless marked differently in a particular folder/file.

## Build instructions

Go to your root directory, where you POM file is located.

Then invoke maven

	mvn clean install

This will compile the source code, then run the unit tests, and finally build a jar file.

## Usage

In your maven project, add the dependency

```xml
<dependency>
    <groupId>be.yildiz-games</groupId>
    <artifactId>engine-client-addon-parser-xml</artifactId>
    <version>${engine-client-parser-addon-xml.version}</version>
</dependency>
```

## Contact
Owner of this repository: Grégory Van den Borre
