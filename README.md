# JavaTest
This repo is from Platzi's course ["Testing en Java"](https://platzi.com/clases/testing-java/)

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info

In this class we learn about TDD and implement this using Java, some of the concepts seen in the course are:

### Profits
* Check the requirements of our application.
* Documentation and examples of our classes.
* Through Test Driven Development (TDD) you can help us in class design.
* Confidence when developing.
* Confidence to refactor our code.

* There are automatic and manual tests, the automatic ones will require development time and sometimes they will not be as viable, but if possible always try to do automatic tests since:

* They are faster.
* They are more reliable.
* They are incremental.

### Test types

| Type | Description |
| ---- | ----------- |
| Unitary | They perform tests on a very specific function or class of our project. |
| Integration | They test how different components of our project are connected. |
| Functional | They test a functionality of our project, several classes can be involved. |
| Start to finish | Test an entire project process. |
| Stress | Useful to test if our application can support large amounts of processes and requests at the same time. |

### The TDD cycle

| Phase | Description |
| ----- | ----------- |
| Red | write a test that fails. |
| Green | write the code necessary for it to pass the test. |
| Refactor | improve the code. |

### Rules
- You will only write test code until it fails.
- You will only write production code to pass the test.
- You will not write more production code than necessary.
- You can combine the TDD rules with its loop just like the teacher did:

* -- Red: You will write the minimum test code that fails.
* -- Green: You will write the minimum production code that passes the test.
* -- Refactor: only when tests are passing.

### General division of applications
An application is generally divided into:

| Division | Description |
| -------- | ----------- |
| Interface | It is responsible for communication with the outside or a user. |
| Business | It is the logic of our application. |
| Data | It is responsible for saving the data of our application. |

*Each layer can communicate with another, but does not know the implementation details.*

### Test Scenarios
There are different scenarios:

| Typical | Extremes | Incorrect | Unexpected |
| ------- | -------- | --------- | ---------- |

## Technologies

This project was created using:
* Java
* IntelliJ IDEA
* OpenJDK 8
* OpenJDK 11
* JUnit
* h2database
* Mockito
* SpringJDBC


## Setup

To work in this project, install it locally:
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download)
* [OpenJDK 8](https://adoptopenjdk.net/?variant=openjdk8&jvmVariant=hotspot)
* [OpenJDK 11](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot)
* [Java](https://www.java.com/es/download/manual.jsp) 11 or higher
