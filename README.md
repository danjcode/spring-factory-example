# spring-factory-example

This is a example implementation of a factory pattern using
spring to allow for additional classes to be implemented without
modifying the factory class itself.

It relies on 2 properties of spring

1) @PostContstruct annotation - Methods annotated with this annotation
are run as soon as the application context has finished initialises
2) Autowiring a list of type will add one of every instance of that type
to the list