package com.sme.java8.patterns.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Person POJO.
 */
public class Person
{
    private int id;
    private String firstName;
    private String lastName;
    private Address address;

    public Person()
    {
        id = 0;
    }

    public Person(int id)
    {
        this();
        this.id = id;
    }

    public Person(int id, String firstName)
    {
        this(id);
        this.firstName = firstName;
    }

    public Person(int id, String firstName, String lastName)
    {
        this(id, firstName);
        this.lastName = lastName;
    }

    public Person(int id, String firstName, String lastName, Address address)
    {
        this(id, firstName, lastName);
        this.address = address;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    public int hashCode()
    {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        Person that = (Person) obj;
        return new EqualsBuilder()
                .append(this.id, that.id)
                .append(this.firstName, that.firstName)
                .append(this.lastName, that.lastName)
                .append(this.address, that.address)
                .isEquals();
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
