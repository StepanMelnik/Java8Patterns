package com.sme.java8.patterns.design.behavioral.templatemethod;

import com.sme.java8.patterns.model.Person;

/**
 * Delete person handler.
 */
public class DeletePersonHandler extends APersonHandler
{
    @Override
    protected boolean innerHandle(Person person)
    {
        logger.debug("Check if the {} person can be removed from database", person);
        return false;
    }
}
