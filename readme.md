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
Settings in **application.properties** file:

```properties
#Logger
logging.level.root=INFO
logging.level.pe=DEBUG
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1} - %m%n
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
