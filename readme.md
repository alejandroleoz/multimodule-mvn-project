# Multi-module Maven project (demo)

This repository contains a very simple demo about the structure for a 
multi-module Maven project.

## How to  test it
- Clone the repository
- CD into the parent module directory
- `mvn clean install`
- The generated output will be `warcreator/target/warcreator.war`
- Copy the generated war into a webapp server (e.g. Tomcat)
- Access `http://localhost:8080/warcreator/test` and verify the dummy output