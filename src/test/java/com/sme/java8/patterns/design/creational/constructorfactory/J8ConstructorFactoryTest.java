package com.sme.java8.patterns.design.creational.constructorfactory;

import static org.junit.Assert.assertEquals;

import java.util.function.Supplier;

import org.junit.Test;

import com.sme.java8.patterns.model.Address;
import com.sme.java8.patterns.model.Person;

/**
 * Unit tests of {@link J8ConstructorFactory}.
 */
public class J8ConstructorFactoryTest
{
    @Test
    public void testConstructorWithOneParam() throws Exception
    {
        Supplier<Person> person = J8ConstructorFactory.create(Person::new, 10);
        assertEquals(new Person(10), person.get());
    }

    @Test
    public void testConstructorWithTwoParams() throws Exception
    {
        Supplier<Person> person = J8ConstructorFactory.create(Person::new, 10, "firstName");
        assertEquals(new Person(10, "firstName"), person.get());
    }

    @Test
    public void testConstructorWithThreeParams() throws Exception
    {
        Supplier<Person> person = J8ConstructorFactory.create(Person::new, 10, "firstName", "lastName");
        assertEquals(new Person(10, "firstName", "lastName"), person.get());
    }

    @Test
    public void testConstructorWithFourParams() throws Exception
    {
        Supplier<Person> person = J8ConstructorFactory.create(Person::new, 10, "firstName", "lastName", new Address());
        assertEquals(new Person(10, "firstName", "lastName", new Address()), person.get());
    }
}
