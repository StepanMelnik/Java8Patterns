package com.sme.java8.patterns.design.behavioral.templatemethod;

import java.util.function.Function;

import com.sme.java8.patterns.design.creational.builder.PojoGenericBuilder;
import com.sme.java8.patterns.model.Person;

/**
 * Person handler to handle {@link Person} by first and last name.
 */
public class J8PersonHandler
{
    /**
     * Handle person.
     * 
     * @param firstName The given first name;
     * @param lastName The given last name;
     * @param function The given function to handle person;
     * @return Returns true if {@link Person} was handled properly otherwise true.
     */
    public boolean handle(String firstName, String lastName, Function<Person, Boolean> function)
    {
        Person person = PojoGenericBuilder.of(Person::new)
                .with(Person::setId, 0)
                .with(Person::setFirstName, firstName)
                .with(Person::setLastName, lastName)
                .build();

        return function.apply(person);
    }
}
