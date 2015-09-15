package main.java.com.algorithm.level1;

/**
 * @author Lazarchuk
 * @version 1.0
 * @date 15/09/2015
 * *****************************************
 * The implements level-1 'Linear Algorithm'
 */
public class LinearAlgorithm {

    /**
     * From task: Version #1 & Level #1
     *
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public LinearAlgorithm(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * From task: Version #1 & Level #2
     *
     * @param a
     * @param b
     */
    public LinearAlgorithm(double a, double b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        LinearAlgorithm version1;

        /* Task: Version #1 & Level #1 */
        version1      = new LinearAlgorithm(1.047,2,1,2.718);
        double level1 = version1.level1();
        System.out.println("Input data:"+"\n\tx = "+version1.x+"\n\ty = "+version1.y+"\n\ta = "+version1.a+"\n\tb = "+version1.b+"\n\tc = "+version1.c+"\n\td = "+version1.d);
        System.out.println("Output data (Level #1):" + "\n\tlevel1 = " + level1);

        /* Task: Version #1 & Level #2 (Y) */
        version1      = new LinearAlgorithm(0.078,0.5);
        double level2_y = version1.level2_y();
        System.out.println("\nInput data:"+"\n\tx = "+version1.x+"\n\ty = "+version1.y+"\n\ta = "+version1.a+"\n\tb = "+version1.b+"\n\tz = "+version1.z);
        System.out.println("Output data (Level #1 (Y)):" + "\n\tlevel1 = " + level2_y);

        /* Task: Version #1 & Level #2 (2) */
        version1      = new LinearAlgorithm(0.078,0.5);
        double level2_2 = version1.level2_1();
        System.out.println("\nInput data:"+"\n\tx = "+version1.x+"\n\ty = "+version1.y+"\n\ta = "+version1.a+"\n\tb = "+version1.b+"\n\tz = "+version1.z);
        System.out.println("Output data (Level #1 (1)):" + "\n\tlevel1 = " + level2_1);
    }

    /**
     * Level #1
     *
     * @return
     */
    public double level1(){
        y = level1();
        x = y/2-1;

        return Math.sqrt(Math.pow(x,2)+b*x+c)/Math.cos(a)-Math.log(d);
    }

    /**
     * Level #2 (Y)
     *
     * @return
     */
    public double level2_y(){
        y = level2_y();
        z = Math.sqrt(y)/2-1;



        z = level2_z();
        x = z-2;

        return Math.sqrt(Math.pow(x,2)+Math.pow(x,2)+4)/z+(Math.pow(z,2)*2);
    }

    /**
     * Level #2 (Z)
     *
     * @return
     */
    public double level2_z(){
        z = level2_z();
        return Math.sin(a)*x/Math.sqrt(b)+(Math.tan(a)*2);
    }


    private double x;
    private double y;
    private double a;
    private double b;
    private double c;
    private double d;
    private double z;
}
