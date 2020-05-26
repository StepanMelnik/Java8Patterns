package com.sme.java8.patterns.design.creational.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sme.java8.patterns.model.Person;
import com.sme.java8.patterns.td.PersonTD;

/**
 * Unit tests of {@link PersonBuilder}.
 */
public class PersonBuilderTest
{
    @Test
    public void testCreatePerson() throws Exception
    {
        Person person = new PersonBuilder(1)
                .firstName("firstName")
                .lastName("lastName")
                .address(new AddressBuilder(10)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipCode("zipCode")
                        .build())
                .build();

        assertEquals(PersonTD.createPerson(), person);
    }
}
