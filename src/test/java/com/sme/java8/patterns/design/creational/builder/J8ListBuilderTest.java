package com.sme.java8.patterns.design.creational.builder;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * Example of list builder using stream.
 */
public class J8ListBuilderTest
{
    @Test
    public void testListBuilderUsingStream() throws Exception
    {
        List<String> list = Arrays.asList("One", "Two", "Three");

        List<String> list1 = Stream.of("One", "Two", "Three").collect(Collectors.toList());
        assertEquals(list, list1);

        // CSOFF
        List<String> list2 = Stream.<String> builder()
                .add("One")
                .add("Two")
                .add("Three")
                .build()
                .collect(Collectors.toList());
        // CSON

        assertEquals(list, list2);
    }
}
