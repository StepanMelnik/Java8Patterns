package com.sme.java8.patterns.design.behavioral.templatemethod;

import com.sme.java8.patterns.model.Person;

/**
 * Duplicate person handler.
 */
public class DuplicatePersonHandler extends APersonHandler
{
    @Override
    protected boolean innerHandle(Person person)
    {
        logger.debug("Load and check if {} person already exists in database ", person);
        return true;
    }
}
