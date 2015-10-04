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
     * Test Level #l - Illegal Argument
     */
    @Test
    public void testLevel1IllegalArgument() {
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
     * Test Level #l - descriminator Exception
     */
    @Test
    public void testLevel1Exception() {
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
     * Test Level #l
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
            double[] level1 = linearAlgorithm.level1(a,b,c,d);
            assertEquals("Here is test Y1:",expectedY1,level1[0],0.001);
            assertEquals("Here is test Y2:",expectedY2,level1[1],0.001);
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
    }

    /**
     * Test Level #2 - Illegal Argument
     */
    @Test
    public void testLevel2IllegalArgument() {
        double a=0.78;
        double b=0;
        String expected="Illegal Argument: b<=0";

        try {
            linearAlgorithm.level2(a, b);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Here is test Illegal Argument:",expected,e.getMessage());
        }
    }

    /**
     * Test Level #2
     */
    @Test
    public void testLevel2() {
        double a=0.78;
        double b=0.5;
        double expected=1.016;

        try {
            double level2 = linearAlgorithm.level2(a,b);
            assertEquals("Here is test:",expected,level2,0.001);
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }

    /**
     * Test Level #3
     */
    @Test
    public void testLevel3() {
        double a=1.048;
        double d=1.57;
        double expected1=1.059;
        double expected2=1.001;

        double[] level3 = linearAlgorithm.level3(a,d);
        assertEquals("Here is test-1:",expected1,level3[0],0.001);
        assertEquals("Here is test-2:",expected2,level3[1],0.001);
    }

    private Algorithm linearAlgorithm;
}
