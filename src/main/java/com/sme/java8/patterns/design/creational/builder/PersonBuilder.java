package com.sme.java8.patterns.design.creational.builder;

import com.sme.java8.patterns.model.Address;
import com.sme.java8.patterns.model.Person;

/**
 * Builder to create {@link Person} instance.
 * <p>
 * Prefer to create the builder as static class inside of {@link Person} class.
 * </p>
 */
public class PersonBuilder
{
    private final Person person = new Person();

    public PersonBuilder()
    {
        this(0);
    }

    public PersonBuilder(int id)
    {
        person.setId(id);
    }

    public PersonBuilder firstName(String firstName)
    {
        person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder lastName(String lastName)
    {
        person.setLastName(lastName);
        return this;
    }

    public PersonBuilder address(Address address)
    {
        person.setAddress(address);
        return this;
    }

    public Person build()
    {
        return person;
    }
}
