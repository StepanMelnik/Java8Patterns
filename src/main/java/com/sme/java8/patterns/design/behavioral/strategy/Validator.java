package com.sme.java8.patterns.design.behavioral.strategy;

/**
 * Validator to work with different strategies.
 */
public class Validator
{
    private final IValidation validation;

    public Validator(IValidation validation)
    {
        this.validation = validation;
    }

    /**
     * Validate @param value using different strategies.
     * 
     * @param value The given value to be validated;
     * @return Returns true if valid otherwise false.
     */
    public boolean validate(String value)
    {
        return validation.isValid(value);
    }
}
