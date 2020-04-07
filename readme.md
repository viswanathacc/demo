# 1. setup
spring-boot-starter-parent
spring-boot-starter-web
spring-boot-starter-data-jpa
h2
# 2. App config
@SpringBootApplication
application.properties
# 3. mvc 
spring-boot-starter-thymeleaf
# 4. controller 
# 5. Security
spring-boot-starter-security
starter on the class path and extend WebSecurityConfigurerAdapter for custom security impl
# 6. persistence
# 7. web and controller
@RestController
# 8. Error handling
@ControllerAdvice

# 9. How to run the build and test
To build and execute unit tests --> mvn clean install
To build and execute integration tests --> mvn clean verify -Pit