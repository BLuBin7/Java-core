package com.syntax.jmasterCoBan.Java43;

/**
 * The type Superclass.
 */
public class Superclass {
    /**
     * Tinhtong int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int tinhtong(int a,int b)
    {
        return a+b;
    }

    /**
     * Tinhtong long.
     *
     * @param a the a
     * @param b the b
     * @return the long
     */
//  Overload
    public long tinhtong(int a, long b)
    {
        return a+b;
    }

    /**
     * Tinhtong long.
     *
     * @param a the a
     * @param b the b
     * @param c the c
     * @return the long
     */
//    Overload
    public long tinhtong(long a,long b,long c)
    {
        return a+b+c;
    }
}
