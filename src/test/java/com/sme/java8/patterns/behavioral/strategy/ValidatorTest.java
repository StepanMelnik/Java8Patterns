package com.sme.java8.patterns.behavioral.strategy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sme.java8.patterns.design.behavioral.strategy.IsoLocalDateValidationStrategy;
import com.sme.java8.patterns.design.behavioral.strategy.NumberValidationStrategy;
import com.sme.java8.patterns.design.behavioral.strategy.Validator;

/**
 * Unit tests of {@link Validator}.
 */
public class ValidatorTest
{
    @Test
    public void testNumberStrategy() throws Exception
    {
        Validator validator = new Validator(new NumberValidationStrategy());
        assertTrue("Expects valid number", validator.validate("123.1"));
        assertFalse("Expects not valid number", validator.validate("123WrongNumber.1"));
    }

    @Test
    public void testIsoDateStrategy() throws Exception
    {
        Validator validator = new Validator(new IsoLocalDateValidationStrategy());
        assertTrue("Expects valid ISO date", validator.validate("2020-04-17"));
        assertFalse("Expects not valid ISO date", validator.validate("17-04-2020"));
    }
}
