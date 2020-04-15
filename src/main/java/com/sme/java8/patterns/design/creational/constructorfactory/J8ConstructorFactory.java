package com.sme.java8.patterns.design.creational.constructorfactory;

import java.util.function.Supplier;

/**
 * Factory to create POJO instances by different constructors.
 */
public final class J8ConstructorFactory
{
    // private
    private J8ConstructorFactory()
    {
    }

    /**
     * Create instance with one argument of constructor.
     * 
     * @param <R> The result;
     * @param <P> The argument in constructor;
     * @param constructor The functional interface represents a constructor with one argument;
     * @param p The parameter of constructor;
     * @return Returns supplier of created instance.
     */
    public static <R, P> Supplier<R> create(IConstructor<R, P> constructor, P p)
    {
        return () -> constructor.apply(p);
    }

    /**
     * Create instance with two arguments of constructor.
     * 
     * @param <R> The result;
     * @param <P1> The argument in constructor;
     * @param <P2> The argument in constructor;
     * @param constructor The functional interface represents a constructor with two arguments;
     * @param p1 The parameter of constructor;
     * @param p2 The parameter of constructor;
     * @return Returns supplier of created instance.
     */
    public static <R, P1, P2> Supplier<R> create(IBiConstructor<R, P1, P2> constructor, P1 p1, P2 p2)
    {
        return () -> constructor.apply(p1, p2);
    }

    /**
     * Create instance with three arguments of constructor.
     * 
     * @param <R> The result;
     * @param <P1> The argument in constructor;
     * @param <P2> The argument in constructor;
     * @param <P3> The argument in constructor;
     * @param constructor The functional interface represents a constructor with two arguments;
     * @param p1 The parameter of constructor;
     * @param p2 The parameter of constructor;
     * @param p3 The parameter of constructor;
     * @return Returns supplier of created instance.
     */
    public static <R, P1, P2, P3> Supplier<R> create(ITriConstructor<R, P1, P2, P3> constructor, P1 p1, P2 p2, P3 p3)
    {
        return () -> constructor.apply(p1, p2, p3);
    }

    /**
     * Create instance with four arguments of constructor.
     * 
     * @param <R> The result;
     * @param <P1> The argument in constructor;
     * @param <P2> The argument in constructor;
     * @param <P3> The argument in constructor;
     * @param <P4> The argument in constructor;
     * @param constructor The functional interface represents a constructor with two arguments;
     * @param p1 The parameter of constructor;
     * @param p2 The parameter of constructor;
     * @param p3 The parameter of constructor;
     * @param p4 The parameter of constructor;
     * @return Returns supplier of created instance.
     */
    public static <R, P1, P2, P3, P4> Supplier<R> create(IFourConstructor<R, P1, P2, P3, P4> constructor, P1 p1, P2 p2, P3 p3, P4 p4)
    {
        return () -> constructor.apply(p1, p2, p3, p4);
    }
}
