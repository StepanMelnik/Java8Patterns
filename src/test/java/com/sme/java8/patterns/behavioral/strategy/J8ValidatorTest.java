package com.sme.java8.patterns.behavioral.strategy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

import com.sme.java8.patterns.design.behavioral.strategy.Validator;

/**
 * Unit tests of {@link Validator} using functional interface.
 */
public class J8ValidatorTest
{
    @Test
    public void testNumberStrategy() throws Exception
    {
        Validator validator = new Validator(NumberUtils::isCreatable);
        assertTrue("Expects valid number", validator.validate("123.1"));
        assertFalse("Expects not valid number", validator.validate("123WrongNumber.1"));
    }

    @Test
    public void testIsoDateStrategy() throws Exception
    {
        Validator validator = new Validator(value ->
        {
            try
            {
                DateTimeFormatter.ISO_DATE.parse(value);
                return true;
            }
            catch (RuntimeException e)
            {
                return false;
            }
        });
        assertTrue("Expects valid ISO date", validator.validate("2020-04-17"));
        assertFalse("Expects not valid ISO date", validator.validate("17-04-2020"));
    }
}
