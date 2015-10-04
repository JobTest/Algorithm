package com.algorithm;

/**
 * @date 15/09/2015
 */
public abstract class Algorithm {

    /**
     * Level #1
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     * @throws IllegalArgumentException
     */
    protected abstract double[] level1(final double a, final double b, final double c, final double d) throws IllegalArgumentException, RuntimeException;

    public final double getDescriminator(final double a, final double b, final double c){
        return Math.pow(b,2)-4*a*c;
    }

    public final double getX1(final double a, final double b, final double descriminator) throws IllegalArgumentException, RuntimeException {
        if (a==0)
            throw new IllegalArgumentException("Illegal Argument: a==0");
        if (descriminator<0)
            throw new RuntimeException("Descriminator < 0");
        return (-b+Math.sqrt(descriminator))/(2*a);
    }

    public final double getX2(final double a, final double b, final double descriminator) throws IllegalArgumentException, RuntimeException {
        if (a==0)
            throw new IllegalArgumentException("Illegal Argument: a==0");
        if (descriminator<0)
            throw new RuntimeException("Descriminator < 0");
        return a!=0 ? ((-b-Math.sqrt(descriminator))/(2*a)) : 0;
    }

}
