package com.sme.java8.patterns.behavioral.templatemethod;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sme.java8.patterns.design.behavioral.templatemethod.DeletePersonHandler;
import com.sme.java8.patterns.design.behavioral.templatemethod.DuplicatePersonHandler;
import com.sme.java8.patterns.design.behavioral.templatemethod.J8PersonHandler;
import com.sme.java8.patterns.model.Person;

/**
 * 
 */
public class J8PersonHandlerTest
{
    private static Logger LOGGER = LoggerFactory.getLogger(J8PersonHandler.class);

    /**
     * See {@link DuplicatePersonHandler#innerHandle} implementation.
     */
    @Test
    public void testDuplicate() throws Exception
    {
        boolean isPersonHandled = new J8PersonHandler().handle("firstName", "lastName", (Person p) ->
        {
            LOGGER.debug("Load and check if {} person already exists in database ", p);
            return true;
        });

        assertTrue("Expects duplicated person", isPersonHandled);
    }

    /**
     * See {@link DeletePersonHandler#innerHandle} implementation.
     */
    @Test
    public void testDeletePerson() throws Exception
    {
        boolean isPersonHandled = new J8PersonHandler().handle("firstName", "lastName", (Person p) ->
        {
            LOGGER.debug("Check if the {} person can be removed from database", p);
            return false;
        });

        assertFalse("Expects not deleted person", isPersonHandled);
    }
}
