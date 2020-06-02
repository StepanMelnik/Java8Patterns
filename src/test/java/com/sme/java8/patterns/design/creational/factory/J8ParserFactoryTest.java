package com.sme.java8.patterns.design.creational.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sme.java8.patterns.parser.DocParser;
import com.sme.java8.patterns.parser.PdfParser;
import com.sme.java8.patterns.parser.TextParser;

/**
 * Unit tests of {@link J8ParserFactory}.
 */
public class J8ParserFactoryTest
{
    @Test
    public void testFactory() throws Exception
    {
        assertTrue("Expect TextParser instance", J8ParserFactory.createParser("text") instanceof TextParser);
        assertEquals("TextParser#parse", J8ParserFactory.createParser("text").parse());

        assertTrue("Expect DocParser instance", J8ParserFactory.createParser("doc") instanceof DocParser);
        assertEquals("DocParser#parse", J8ParserFactory.createParser("doc").parse());

        assertTrue("Expect PdfParser instance", J8ParserFactory.createParser("pdf") instanceof PdfParser);
        assertEquals("PdfParser#parse", J8ParserFactory.createParser("pdf").parse());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalParserType() throws Exception
    {
        J8ParserFactory.createParser("wrong type");
    }
}
