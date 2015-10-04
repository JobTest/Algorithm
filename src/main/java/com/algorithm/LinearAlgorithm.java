package com.algorithm;

/**
 * @version 1.0
 * @date 15/09/2015
 * ********************************************
 * The implements levels for 'Linear Algorithm'
 */
public class LinearAlgorithm extends Algorithm {

    @Override
    public synchronized double[] level1(final double a, final double b, final double c, final double d) throws IllegalArgumentException {
        double x1 = getX1(a,b,getDescriminator(a,b,c));
        double x2 = getX2(a,b,getDescriminator(a,b,c));

        double a1 = 3;
        double b1 = x2+x1;
        double c1 = x1+x2+Math.log(d)+1;

        double[] level1 = {getX1(a1,b1,getDescriminator(a1,b1,c1)),getX2(a1,b1,getDescriminator(a1,b1,c1))};
        return level1;
    }

    @Override
    public synchronized double level2(final double a, final double b) throws IllegalArgumentException {
        if (b<=0)
            throw new IllegalArgumentException("Illegal Argument: b<=0");
        return (Math.sin(a)/Math.sqrt(b))-(2*Math.tan(a)-2);
    }

    @Override
    public synchronized double[] level3(final double a, final double b, final double d) {
        double[] level3 = {3.18/(4*Math.pow(Math.sin(a),2)),Math.cos(d)*Math.log10(b)+3};
        return level3;
    }

}
