package com.sme.java8.patterns.design.creational.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sme.java8.patterns.model.Address;
import com.sme.java8.patterns.model.Person;
import com.sme.java8.patterns.td.PersonTD;

/**
 * Unit tests of {@link PojoGenericBuilder}.
 */
public class J8PojoGenericBuilderTest
{
    @Test
    public void testBuilder() throws Exception
    {
        Person person = PojoGenericBuilder.of(Person::new)
                .with(Person::setId, 1)
                .with(Person::setFirstName, "firstName")
                .with(Person::setLastName, "lastName")
                .with(Person::setAddress, PojoGenericBuilder.of(Address::new)
                        .with(Address::setId, 10)
                        .with(Address::setCity, "city")
                        .with(Address::setState, "state")
                        .with(Address::setStreet, "street")
                        .with(Address::setZipCode, "zipCode")
                        .build())
                .build();

        assertEquals(PersonTD.createPerson(), person);
    }
}
