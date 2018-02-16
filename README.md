# together Platform :: Configuration Management

This repository includes all necessary files to build and compile the project together platform. All Artifacts of the together platform are build by Java 8 SE (JDK), Maven 3.5.x and developed with the NetBeans IDE.

## Getting Started

The directory build-workflow contains the parent-pom and all general uses dependencies. To make the POMs available for your project, run the pom.xml in the root folder from the command line and type  mvn. Thats all. The initializations scripts for the DBMS you will find in the dbms directory. 
For additional Services like database server and so on, are docker containers our choice. For local development you will find in the sub folder docker the commands to install Docker, get containers and run them. 

### Prerequisites

* Java 8 SE JDK
* Maven 3.5.0
* Docker
* NetBeans IDE (recommended) / JetBrains IntelliJ / Eclipse   

## Authors

* **Elmar Dott** - *Concept, Architecture, Development* - [enRebaja](https://enRebaja.wordpress.com)

## License

This project is licensed under the General Public License GPL-3.0

## Contributors

Feel free to send a request by e-mail to contribute the project.
