package com.sme.java8.patterns.design.creational.builder;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

/**
 * Example of map builder.
 */
public class J8MapBuilderTest
{
    @Test
    public void testMapBuilder() throws Exception
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // CSOFF
        Map<Integer, String> map1 = Stream.<SimpleEntry<Integer, String>> builder()
                .add(new SimpleEntry<>(1, "One"))
                .add(new SimpleEntry<>(2, "Two"))
                .add(new SimpleEntry<>(3, "Three"))
                .build()
                .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue));

        // CSON

        // FIXME use guava Maps.difference(sourceRecords, targetRecords);
        // MatcherAssert does not have good solution to compare maps.
        Assert.assertEquals(map1, map);
    }
}
