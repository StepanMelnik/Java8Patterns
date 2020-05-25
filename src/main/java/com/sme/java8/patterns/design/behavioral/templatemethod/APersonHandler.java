package com.sme.java8.patterns.design.behavioral.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sme.java8.patterns.design.creational.builder.PojoGenericBuilder;
import com.sme.java8.patterns.model.Person;

/**
 * Abstraction to handle person by first and last name.
 */
public abstract class APersonHandler
{
    protected Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Handle person.
     * 
     * @param firstName The first name of person;
     * @param lastName The last name of person;
     * @return Returns if {@link Person} is handled otherwise false.
     */
    public final boolean handle(String firstName, String lastName)
    {
        Person person = PojoGenericBuilder.of(Person::new)
                .with(Person::setId, 0)
                .with(Person::setFirstName, firstName)
                .with(Person::setLastName, lastName)
                .build();

        return innerHandle(person);
    }

    /**
     * Inner handling by concrete implementation.
     * 
     * @param person The given person to be handled;
     * @return Returns if {@link Person} is handled by inner implementation otherwise false.
     */
    protected abstract boolean innerHandle(Person person);
}
