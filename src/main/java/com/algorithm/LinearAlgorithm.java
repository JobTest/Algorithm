package com.algorithm;

/**
 * @version 1.0
 * @date 15/09/2015
 * ***********************************************
 * The implements levels for 'Linear Algorithm'
 */
public class LinearAlgorithm extends Algorithm {

    @Override
    public synchronized double[] level1(final double a, final double b, final double c, final double d) throws IllegalArgumentException, RuntimeException {
        double x1 = getX1(a,b,getDescriminator(a,b,c));
        double x2 = getX2(a,b,getDescriminator(a,b,c));

        double a1 = 3;
        double b1 = x2+x1;
        double c1 = x1+x2+Math.log(d)+1;

        double[] level1 = {getX1(a1,b1,getDescriminator(a1,b1,c1)),getX2(a1,b1,getDescriminator(a1,b1,c1))};
        return level1;
    }

}
