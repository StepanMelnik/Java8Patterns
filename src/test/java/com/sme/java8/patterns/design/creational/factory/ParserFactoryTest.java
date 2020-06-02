package com.sme.java8.patterns.design.creational.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sme.java8.patterns.parser.DocParser;
import com.sme.java8.patterns.parser.PdfParser;
import com.sme.java8.patterns.parser.TextParser;

/**
 * Unit tests of {@link ParserFactory}.
 */
public class ParserFactoryTest
{
    @Test
    public void testFactory() throws Exception
    {
        assertTrue("Expect TextParser instance", ParserFactory.createParser("text") instanceof TextParser);
        assertEquals("TextParser#parse", ParserFactory.createParser("text").parse());

        assertTrue("Expect DocParser instance", ParserFactory.createParser("doc") instanceof DocParser);
        assertEquals("DocParser#parse", ParserFactory.createParser("doc").parse());

        assertTrue("Expect PdfParser instance", ParserFactory.createParser("pdf") instanceof PdfParser);
        assertEquals("PdfParser#parse", ParserFactory.createParser("pdf").parse());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalParserType() throws Exception
    {
        ParserFactory.createParser("wrong type");
    }
}
