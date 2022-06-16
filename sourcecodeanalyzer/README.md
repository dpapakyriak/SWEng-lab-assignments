# Source Code Analyzer
A maven project that reads input files and calculates the following metrics:

- LOC (Lines Of Code)
- NOM (Number Of Methods)
- NOC (Number Of Classes)

## Getting Started

### Prerequisites

- Java
- Maven

### Installation
- #### Clone this repository

- #### Change Directory
 
- #### Build the project
  ```mvn package jacoco:report```


- #### Run
  ```
  java –jar ./target/sourcecodeanalyzer-1.0-SNAPSHOT-jar-with-dependencies.jar arg0 arg1 arg2 arg3 arg4
  ```    
  - arg0 = “JavaSrcCodeInputFile” (e.g. src/test/resources/TestClass.java)  
  - arg1 = “srcCodeAnalyzerType” [regex|strcomp]  
  - arg2 = “SrcCodeLocationType” [local|web]  
  - arg3 = “OutputFilePath” (e.g. ../metrics_file)  
  - arg4 = “OutputFileType” [csv|json]


# Module's Architecture
## UML Diagram
![uml_diagram](./UML_diagram.pdf)


## Built with
- [Maven](https://maven.apache.org/)


## Authors
- Dimitrios Papakyriakopoulos

## Patterns
- ### Facade Pattern  
- ### Factory Pattern
- ### Strategy Pattern 
- ### Bridge Pattern