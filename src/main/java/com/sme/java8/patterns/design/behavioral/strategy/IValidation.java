package com.sme.java8.patterns.design.behavioral.strategy;

/**
 * Functional interface to validate string value.
 */
@FunctionalInterface
public interface IValidation
{
    /**
     * Check if value is valid.
     * 
     * @param value The given string parameter to be validated;
     * @return Returns true if valid otherwise false.
     */
    boolean isValid(String value);
}
