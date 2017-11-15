# PocoSpringBootFreemarker #
A starter app originally modeled on [this Spring tutorial](https://spring.io/guides/gs/handling-form-submission/) but converted to Freemarker templates.

## Build and run ##

If you are using Maven, you can run the application using:

    mvn spring-boot:run

Or you can build the JAR file with...

    mvn clean package

... and run the JAR by typing:

    java -jar target/poco-spring-boot-freemarker-0.1.0.jar

Then, in your browser, go to:

    http://localhost:8080/greeting

## TODO ##

* Convert the form templates into working Freemarker syntax.
