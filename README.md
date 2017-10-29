# convention-over-configuration strategy
# How Spring-boot Works #
	- Create Project from STS-->Spring Boot Starter Project and select relevant packages
	- pom.xml: Bill of Material- Pick the Version of Parent and Spring/Maven pulls the right versions of JAR having Spring MVC, Tomcat etc
	- parent: spring-boot-starter-parent: Defines all the versions of jars to be pulled for Spring MVC
	- one dependency manages all spring MVC dependencies: spring-boot-starter-web
	
# Embedded Tomcat Servlet Container
	- Convenience
	- Standalone application
	- Servlet container config(web.xml) is now application config
	- Useful for microservices architecture from deployment perspective	

# SpringBootApplication
	- Define a class and annotate with @SpringBootApplication
	- Write main() method and invoke
	- SpringApplication.run(x.class, args)
# Run as Java Application
	- Run Above class having main method
	- It does all the bootstrping
	- Loads Configs, Scans classpaths, starts Tomcat etc
# Spring MVC Controller / RESTController
	- @RestController: Class Level Spring MVC Annotation
	- Maps URI & HTTP method to Java Method/functionality
	- Annotate(Spring MVC annotation) Java-method with URI & HTTP Method
	
# Java object to JSON conversion & Vice-Versa
	- Spring MVC detects that its RESTController and converts Java object to Json & vice versa
	
# Business Service: Singleton
	- @Service : Class Level Spring MVC Annotation
	
# HTTP Methods
	- GET, POST, PUT, DELETE
	
# Customizing Spring Boot
	- Spring boot complies to "Convention over configuration" philosophy
	- But sometimes we need configuration, this is done by application.properties file
	- src/main/resources/application.properties
	- Know the key/value and store it
	- e.g: server.port=8081
	
# Spring Data JPA(Java Persistence API - ORM): The Data Tier
	- Object-Relational Mapping means "Class <-> Table" mapping
	- We will use: Spring Data JPA
	- Frameworks available in Spring Data: Cassandra, Solr, ElasticSearch, Couchbase, JPA etc
	- H2 DBMS: IN-memory database, Written in Java, It can be embedded in Java Application or run in client-server mode
	
# Actuator
	- Gets added to classpath and enables few features
	- provides health check through REST API(GET): localhost:8080/health
	- You can define a new port for Actuator

	
	
	
	
	
	