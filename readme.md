# Java Spring Boot Sample csv file and strings using maven

Create Spring Boot project with maven, without dependencies:


Implements **CommandLineRunner** and add **run** method

```java
public class DemoApplication implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
```

Add logging using **slf4j**

```java
public class DemotransactionbdApplication implements CommandLineRunner {
    //Logger
	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
```

## Open CSV

Add dependencie **opencsv** in pom.xml

```xml
		<!-- opencsv -->
		<dependency>
			<groupId>com.opencsv</groupId>
			<artifactId>opencsv</artifactId>
			<version>4.1</version>
		</dependency>
```
