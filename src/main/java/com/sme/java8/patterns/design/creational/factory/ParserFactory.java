package com.sme.java8.patterns.design.creational.factory;

import com.sme.java8.patterns.model.ParserType;
import com.sme.java8.patterns.parser.DocParser;
import com.sme.java8.patterns.parser.IParser;
import com.sme.java8.patterns.parser.PdfParser;
import com.sme.java8.patterns.parser.TextParser;

/**
 * Factory to create a parser by type.
 */
public final class ParserFactory
{
    // private
    private ParserFactory()
    {
    }

    /**
     * Creates {@link IParser} instance.
     * 
     * @param type The type of parser as a string value;
     * @return Returns {@link IParser} instance.
     */
    public static IParser createParser(String type)
    {
        switch (ParserType.fromName(type))
        {
            case TEXT:
                return new TextParser();

            case DOC:
                return new DocParser();

            case PDF:
                return new PdfParser();

            default:
                throw new IllegalArgumentException(type + " type has not implemented yet");
        }
    }
}
