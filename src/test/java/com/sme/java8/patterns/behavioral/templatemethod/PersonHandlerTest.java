package com.sme.java8.patterns.behavioral.templatemethod;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sme.java8.patterns.design.behavioral.templatemethod.APersonHandler;
import com.sme.java8.patterns.design.behavioral.templatemethod.DeletePersonHandler;
import com.sme.java8.patterns.design.behavioral.templatemethod.DuplicatePersonHandler;

/**
 * Unit tests of {@link APersonHandler} implementations.
 */
public class PersonHandlerTest
{
    @Test
    public void testDeletePerson() throws Exception
    {
        assertFalse("Expects not deleted person", new DeletePersonHandler().handle("firstName", "lastName"));
    }

    @Test
    public void testDuplicatePerson() throws Exception
    {
        assertTrue("Expects duplicated person", new DuplicatePersonHandler().handle("firstName", "lastName"));
    }
}
