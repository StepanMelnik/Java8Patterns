package com.sme.java8.patterns.design.creational.builder;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests of {@link MapBuilder}.
 */
public class MapBuilderTest
{
    @Test
    public void testMapBuilder() throws Exception
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        Map<Integer, String> map1 = new MapBuilder<Integer, String>(false)
                .put(1, "One")
                .put(2, "Two")
                .put(3, "Three")
                .build();

        assertEquals(map, map1);
    }
}
