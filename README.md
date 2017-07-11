# spring-JPA-angular
TaskManagerApplication: Spring Boot Data JPA and AngularJS demo project 

# CRUD using Spring Data Rest and AngularJS using Spring Boot

There are four dependencies I have included,

- thymeleaf (html templating)
- spring data jpa
- spring data rest
- mysql connector for java

Apart from the dependencies, the start class is also mentioned for the maven to identify where to start from. Finally spring boot maven plugin ensures packaging of your application into an executable jar.

# Spring Data REST

The difference between simple Spring MVC RESTFul Web Services and Spring Data REST is that it combines the RESTFul architecture with Spring Data JPA (Java Persistence)/Gemfire/MongoDB/Neo4j to provide an easy way to implement database operations.

# Java Persistence API (JPA)

Unlike writing a plain DAO that consists of plain JDBC code everywhere, full of PreparedStatements and SqlConnections etc, we just map the original fields in the database table to Java classes called Entities, provide SQL queries and let the persistence api handle the connections, query execution etc without writing much boilerplate code.

# Annotation 

@Entity : 


@Table :


@Column :


@RepositoryRestResource : This annotation is responsible for exposing this repository interface as a RESTFul resource. This is pretty much similar to @RestController which we used in plain Spring MVC REST to expose a controller as RESTFul resource.

@EnableJpaRepositories : The @EnableJpaRepositories annotation activates Spring Data JPA. Spring Data JPA will create a concrete implementation of the TaskRepository and configure it to talk to a back end in-memory database using JPA.

@Import(RepositoryRestMvcConfiguration.class) : The @Import(RepositoryRestMvcConfiguration.class) annotation imports a collection of Spring MVC controllers, JSON converters, and other beans needed to provide a RESTful front end. These components link up to the Spring Data JPA backend.

@EnableAutoConfiguration : The @EnableAutoConfiguration annotation switches on reasonable default behaviors based on the content of your classpath. For example, because the application depends on the embeddable version of Tomcat (tomcat-embed-core.jar), a Tomcat server is set up and configured with reasonable defaults on your behalf. And because the application also depends on Spring MVC (spring-webmvc.jar), a Spring MVC DispatcherServlet is configured and registered for you — no web.xml necessary.

# Templating

We have loaded thymeleaf as a dependency which is nothing but an html templating engine. Initially when the application class is run, all classes in the package in which the application class resides will be scanned. Hence let us write a controller that redirects the control to front end template.


# Property File

By default Spring Boot will look for a property file in the package root directory called 'application.properties', this is a good place to customize your application. For example, as we have placed mysql connector jar in the pom.xml file, Spring Boot will look for mysql specific properties in this file. By Maven conventions, place this file into the src/main/resources directory so your build artefacts will be generated correctly. 



















