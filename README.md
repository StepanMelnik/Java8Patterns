# Java8Patterns
Prepares a list of patterns and compares "old school" and java8 implementation.

## Creational Design Pattern
### Builder

"Old school" POJO builder:
> src\main\java\com\sme\java8\patterns\design\creational\builder\PersonBuilder.java and src\main\java\com\sme\java8\patterns\design\creational\builder\AddressBuilder.java.

> And tested by \src\test\java\com\sme\java8\patterns\design\creational\builder\PersonBuilderTest.java.

Java8 POJO builder:
> src\main\java\com\sme\java8\patterns\design\creational\builder\PojoGenericBuilder.java.

> And tested by \src\test\java\com\sme\java8\patterns\design\creational\builder\J8PojoGenericBuilderTest.java.

-------------------------------------------------------------------------------------------------------------

"Old school" list builder:
> src\main\java\com\sme\java8\patterns\design\creational\builder\ListBuilder.java.

> And tested by src\test\java\com\sme\java8\patterns\design\creational\builder\ListBuilderTest.java.

Java8 list builder:
> src\test\java\com\sme\java8\patterns\design\creational\builder\J8ListBuilderTest.java.

-------------------------------------------------------------------------------------------------------------
"Old school" map builder:
> src\main\java\com\sme\java8\patterns\design\creational\builder\MapBuilder.java..

> And tested by src\test\java\com\sme\java8\patterns\design\creational\builder\MapBuilderTest.java.

Java8 map builder:
> src\test\java\com\sme\java8\patterns\design\creational\builder\J8MapBuilderTest.java.



### Factory
"Old school" factory:
> src\main\java\com\sme\java8\patterns\design\creational\factory\ParserFactory.java.

> And tested by src\test\java\com\sme\java8\patterns\design\creational\factory\ParserFactoryTest.java.

Java8 factory:
> src\main\java\com\sme\java8\patterns\design\creational\factory\J8ParserFactory.java.

> And tested by src\test\java\com\sme\java8\patterns\design\creational\factory\J8ParserFactoryTest.java.


-------------------------------------------------------------------------------------------------------------
Java8 constructor factory:
> src\main\java\com\sme\java8\patterns\design\creational\constructorfactory\J8ConstructorFactory.java

> And tested by \src\test\java\com\sme\java8\patterns\design\creational\factory\J8ParserFactoryTest.java.

## Behavioral Design Pattern
### Strategy

"Old school" strategy:
> src\main\java\com\sme\java8\patterns\design\behavioral\strategy\Validator.java uses NumberValidationStrategy and IsoLocalDateValidationStrategy strategies.

> And tested by src\test\java\com\sme\java8\patterns\behavioral\strategy\ValidatorTest.java.

Java8 Strategy:
> src\test\java\com\sme\java8\patterns\behavioral\strategy\J8ValidatorTest.java uses functional interface implementation.

-------------------------------------------------------------------------------------------------------------

### Template method
"Old school" template method:
> src\main\java\com\sme\java8\patterns\design\behavioral\templatemethod\APersonHandler.java uses DuplicatePersonHandler and DeletePersonHandler handlers.

> And tested by src\test\java\com\sme\java8\patterns\behavioral\templatemethod\PersonHandlerTest.java.

Java8 template method:
> src\main\java\com\sme\java8\patterns\design\behavioral\templatemethod\J8PersonHandler.java.

> And tested by src\test\java\com\sme\java8\patterns\behavioral\templatemethod\J8PersonHandlerTest.java.


## Build

Clone and install <a href="https://github.com/StepanMelnik/Parent.git">Parent</a> project before building.

### Maven
> mvn clean install

### Gradle
> gradle --console verbose --rerun-tasks build

### Docker
Check Header in the Dockerfile how to create an image of the project.