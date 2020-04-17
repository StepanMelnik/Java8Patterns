package com.sme.java8.patterns.design.behavioral.strategy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * ISO date validation strategy.
 */
public class IsoLocalDateValidationStrategy implements IValidation
{
    @Override
    public boolean isValid(String value)
    {
        try
        {
            LocalDate.parse(value, DateTimeFormatter.ISO_LOCAL_DATE);
            return true;
        }
        catch (RuntimeException e)
        {
            return false;
        }
    }
}
