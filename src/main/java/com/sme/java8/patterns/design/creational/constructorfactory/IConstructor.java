package com.sme.java8.patterns.design.creational.constructorfactory;

/**
 * Represents a function that accepts an argument and returns a result.
 * 
 * @param <P> the type of the input to the function;
 * @param <R> the type of the result of the function.
 */
@FunctionalInterface
public interface IConstructor<R, P>
{
    /**
     * Applies the function to the given arguments.
     * 
     * @param p The function argument;
     * @return Returns the result of function.
     */
    R apply(P p);
}
