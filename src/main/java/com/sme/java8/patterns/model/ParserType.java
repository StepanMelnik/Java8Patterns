package com.sme.java8.patterns.model;

import org.apache.commons.lang3.StringUtils;

/**
 * Represents parser types.
 */
public enum ParserType
{
    /**
     * The type to parse a text file.
     */
    TEXT,

    /**
     * The type to parse a doc file.
     */
    DOC,

    /**
     * The type to parse pdf file.
     */
    PDF;

    /**
     * Gets an {@link ParserType} by its name.
     *
     * @param name The name to get a type for.
     * @return Returns the type specified by name.
     */
    public static ParserType fromName(String name)
    {
        for (ParserType type : ParserType.values())
        {
            if (StringUtils.equalsIgnoreCase(type.name(), name))
            {
                return type;
            }
        }
        throw new IllegalArgumentException("'" + name + "' is not a valid type");
    }
}
