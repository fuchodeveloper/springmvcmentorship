## Spring boot MVC Application

#### Playing around with the Java Spring framework


## prerequisites
Maven is configure properly on your machine. Visit the Maven download site to setup - `https://maven.apache.org/download.cgi` 

## Build Project
To build the project, open the project in your terminal and run the following command `mvn clean package`

## Run project
After building the project, enter the following command to run the project ` java -jar target/spring-mvc-mentorship-1.0-SNAPSHOT.jar
`

Launch your browser and navigate to the URL: `http://localhost:8080/greeting`

##### NB: Hot reloading is enabled on this project. This means that after making changes, you do not need to restart the server, proceed to browser and reload the page to see latest updates 

To enable hot reloading in Intellij IDEA, follow the instructions below:
* Open Preferences --> Build-Execution-Deployment --> Compiler
  and enable the Build Project Automatically —> OK
* Then press `ctrl+shift+A` or `cmd+shift+A` on Mac and search for the registry. In the registry, make sure the following configuration is enabled.
    `compiler.automake.allow.when.app.running`
* Restart your IDE.  
