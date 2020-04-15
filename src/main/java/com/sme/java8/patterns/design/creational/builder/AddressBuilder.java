package com.sme.java8.patterns.design.creational.builder;

import com.sme.java8.patterns.model.Address;

/**
 * Builder to create {@link Address} instance.
 * <p>
 * Prefer to create the builder as static class inside of {@link Address} class.
 * </p>
 */
public class AddressBuilder
{
    private final Address address = new Address();

    public AddressBuilder()
    {
        this(0);
    }

    public AddressBuilder(int id)
    {
        address.setId(id);
    }

    public AddressBuilder street(String street)
    {
        address.setStreet(street);
        return this;
    }

    public AddressBuilder city(String city)
    {
        address.setCity(city);
        return this;
    }

    public AddressBuilder state(String state)
    {
        address.setState(state);
        return this;
    }

    public AddressBuilder zipCode(String zipCode)
    {
        address.setZipCode(zipCode);
        return this;
    }

    public Address build()
    {
        return address;
    }
}
