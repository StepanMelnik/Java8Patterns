package com.sme.java8.patterns.design.creational.factory;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.tuple.ImmutablePair;

import com.sme.java8.patterns.model.ParserType;
import com.sme.java8.patterns.parser.DocParser;
import com.sme.java8.patterns.parser.IParser;
import com.sme.java8.patterns.parser.PdfParser;
import com.sme.java8.patterns.parser.TextParser;

/**
 * Parser factory using java8 lambda.
 */
public final class J8ParserFactory
{
    private static final Map<ParserType, Supplier<IParser>> SUPPLIERS = Stream.of(
            new ImmutablePair<ParserType, Supplier<IParser>>(ParserType.TEXT, TextParser::new),
            new ImmutablePair<ParserType, Supplier<IParser>>(ParserType.DOC, DocParser::new),
            new ImmutablePair<ParserType, Supplier<IParser>>(ParserType.PDF, PdfParser::new))
            .collect(Collectors.toMap(ImmutablePair::getLeft, ImmutablePair::getRight));

    // private
    private J8ParserFactory()
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
        return Optional.ofNullable(SUPPLIERS.get(ParserType.fromName(type)).get()).orElseThrow(() -> new IllegalArgumentException(type + " has not supported yet"));
    }
}
