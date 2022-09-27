# WebFLux Assignment Project

Assignment about Spring Webflux for new comer

## `Tools:`

- IntelliJ IDEA Community Edition 2022.2.2
- Git/GitHub: store source code of the whole project.
- Programming language: Java
- MySQL Workbench 8.0 CE and MySQL Community Server.

## `Libraries`
- [Spring Webflux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html#webflux) <br/>
- [Project Reactor](https://projectreactor.io/) <br/>
- [Spring Data R2DBC](https://spring.io/projects/spring-data-r2dbc) <br/>
- [R2DBC-MySQL](https://github.com/mirromutth/r2dbc-mysql) <br/>
- [BlockHound](https://github.com/reactor/BlockHound) <br/>
- [Spring Security for Webflux](https://docs.spring.io/spring-security/reference/reactive/index.html) <br/>
- [JUnit](https://junit.org/junit5/) <br/>
- [Springdoc-OpenApi-3](https://springdoc.org/) <br/>
- [JJWT](https://github.com/jwtk/jjwt) <br/>

## `How to run`

### Step 1: Clone project from Github
- Use: git clone https://github.com/thinhpn2000/WebfluxAssignment (at folder that you want to contain).
### Step 2: Set up Database
- Click assignment_db.sql and open with MySQL Workbench 8.0 CE
- Excute script to create database.
### Step 3: Open project with IntelliJ IDEA
- Open IntelliJ IDEA, select open project.
- Waiting for IntelliJ IDEA load Maven Dependency.
### Step 4: Change file application.properties
- Open file application.properties with classpath: WebfluxAssignment/src/main/resources/
- Edit attribute "spring.r2dbc.password", write your MySQL Server password for create connection project with database.
### Step 5: Run project
- Click run project in IntelliJ IDEA.
- Accept lombok annotation (if required).

## `Contributors:`
- Pham Ngoc Thinh - KMSID: 2768 - email: thinhnpham@kms-technology.com
