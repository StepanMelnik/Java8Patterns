package com.sme.java8.patterns.design.creational.builder;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.sme.java8.patterns.design.creational.builder.ListBuilder;

/**
 * Unit tests of {@link LinkBuilder}.
 */
public class ListBuilderTest
{
    @Test
    public void testListBuilder() throws Exception
    {
        List<String> list = new ListBuilder<>("One", "Two")
                .add("Three")
                .build();

        assertEquals(Arrays.asList("One", "Two", "Three"), list);
    }
}
