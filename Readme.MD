Spring Boot Web application with REST, thymeleaf and bootstrap JS

technologies : java 8, Gradle, Spring boot, JPA, H2 inline DB,  thymeleaf, bootstrap JS

--Navigate to application location on command prompt: Run "gradle clean idea"

--Run the application and access on browser. home page : http://localhost:9091/SpringBootThymeleafBootstrapApp/students

-- H2 DB : application.properties jdbc:h2:mem:local here local is the DB name .

-- After starting the application, login to H2 DB from browser

      http://localhost:9091/SpringBootThymeleafBootstrapApp/h2-console
      JDBC URL : jdbc:h2:mem:local
      UserName : sa

do not change username and password (no password needed) and connect
   

