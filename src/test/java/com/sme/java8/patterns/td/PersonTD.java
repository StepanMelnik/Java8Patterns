package com.sme.java8.patterns.td;

import com.sme.java8.patterns.model.Address;
import com.sme.java8.patterns.model.Person;

/**
 * Person
 */
public class PersonTD
{
    /**
     * Create {@link Person}.
     * 
     * @return Returns {@link Person} instance.
     */
    public static Person createPerson()
    {
        final Address address = new Address();
        address.setId(10);
        address.setCity("city");
        address.setState("state");
        address.setStreet("street");
        address.setZipCode("zipCode");

        final Person person = new Person();
        person.setId(1);
        person.setFirstName("firstName");
        person.setLastName("lastName");
        person.setAddress(address);

        return person;
    }
}
