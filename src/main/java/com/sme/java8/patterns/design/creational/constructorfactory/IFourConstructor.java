package com.sme.java8.patterns.design.creational.constructorfactory;

/**
 * Represents a function that accepts a list of arguments and returns a result.
 * 
 * @param <P1> the type of the input to the function;
 * @param <P2> the type of the input to the function;
 * @param <P3> the type of the input to the function;
 * @param <P4> the type of the input to the function;
 * @param <R> the type of the result of the function.
 */
@FunctionalInterface
public interface IFourConstructor<R, P1, P2, P3, P4>
{
    /**
     * Applies the function for the given arguments.
     * 
     * @param p1 The parameter of function;
     * @param p2 The parameter of function;
     * @param p3 The parameter of function;
     * @param p4 The parameter of function;
     * @return Returns a result of function.
     */
    R apply(P1 p1, P2 p2, P3 p3, P4 p4);
}
