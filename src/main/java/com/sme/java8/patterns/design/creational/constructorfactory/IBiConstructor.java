package com.sme.java8.patterns.design.creational.constructorfactory;

/**
 * Represents a function that accepts a list of arguments and returns a result.
 * 
 * @param <P1> the type of the input to the function;
 * @param <P2> the type of the input to the function;
 * @param <R> the type of the result of the function.
 */
@FunctionalInterface
public interface IBiConstructor<R, P1, P2>
{
    /**
     * Applies the function to the given arguments.
     * 
     * @param p1 The parameter;
     * @param p2 The parameter
     * @return Returns a result of function.
     */
    R apply(P1 p1, P2 p2);
}
