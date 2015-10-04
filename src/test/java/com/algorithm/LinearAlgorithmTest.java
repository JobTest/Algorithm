package com.algorithm;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @date 15/09/2015
 */
public class LinearAlgorithmTest {

    @Before
    public void setUp() {
        linearAlgorithm = new LinearAlgorithm();
    }

    /**
     * Test descriminator Illegal Argument
     */
    @Test
    public void testLevel1isIllegalArgument() {
        double a=0;
        double b=2;
        double c=1;
        double d=2.718;
        String expected="Illegal Argument: a==0";

        try {
            linearAlgorithm.level1(a,b,c,d);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Here is test Illegal Argument:",expected,e.getMessage());
        }
    }

    /**
     * Test descriminator Exception
     */
    @Test
    public void testLevel1isException() {
        double a=1.047;
        double b=2;
        double c=1;
        double d=2.718;
        String expected="Descriminator < 0";

        try {
            linearAlgorithm.level1(a,b,c,d);
            fail();
        } catch (RuntimeException e){
            assertEquals("Here is test descriminator Exception:",expected,e.getMessage());
        }
    }

    /**
     * Test ...
     */
    @Test
    public void testLevel1() {
        double a=1.047;
        double b=12;
        double c=1;
        double d=2.718;
        double expectedY1=4.518;
        double expectedY2=-0.697;

        try {
//            System.out.println("A="+a+"\nB="+b+"\nC="+c+"\nD="+d);
            double[] level1 = linearAlgorithm.level1(a,b,c,d);
//            System.out.println("Y: Y1=" + level1[0] + "; Y2=" + level1[1] + ";");
            assertEquals("Here is test ...:",expectedY1,level1[0],0.001);
            assertEquals("Here is test ...:",expectedY2,level1[1],0.001);
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
    }

    private Algorithm linearAlgorithm;
}
