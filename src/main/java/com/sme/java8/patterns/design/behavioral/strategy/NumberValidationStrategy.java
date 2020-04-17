package com.sme.java8.patterns.design.behavioral.strategy;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Number validation strategy.
 */
public class NumberValidationStrategy implements IValidation
{
    @Override
    public boolean isValid(String value)
    {
        return NumberUtils.isCreatable(value);
    }
}
