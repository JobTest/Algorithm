package main.java.com.algorithm;

/**
 * @author Lazarchuk
 * @version 1.0
 * @date 29/09/2015
 * *****************************************************
 * The implements levels #1 / #2 / #3 'Linear Algorithm'
 */
public class LinearAlgorithm2 {

    public static void main(String[] args) {
        LinearAlgorithm2 version = new LinearAlgorithm2();

        /* Task: Version #1 & Level #1 */
        version.data = version.level1(new Data(1.047,2,1,2.718));
        System.out.println("Input data:"+"\n\tx = "+version.data.getX()+"\n\ty = "+version.data.getY()+"\n\ta = "+version.data.getA()+"\n\tb = "+version.data.getB()+"\n\tc = "+version.data.getC()+"\n\td = "+version.data.getD());
        System.out.println("Output data (Level #1):" + "\n\tlevel1 = " + version.data.getY());

        /* Task: Version #1 & Level #2 */
        version.data = version.level2(new Data(0.078,0.5));
        System.out.println("Input data:"+"\n\tx = "+version.data.getX()+"\n\ty = "+version.data.getY()+"\n\ta = "+version.data.getA()+"\n\tb = "+version.data.getB()+"\n\tc = "+version.data.getC()+"\n\td = "+version.data.getD());
        System.out.println("Output data (Level #1):" + "\n\tlevel1 = " + version.data.getY());
    }

    /**
     * Level #1
     *
     * @return
     */
    public synchronized Data level1(final Data data){
        Data getData = new Data(data.getA(), data.getB(), data.getC(), data.getD());
        getData.setY( Math.sqrt(Math.pow(data.getX(),2)+data.getB()*data.getX()+data.getC())/Math.cos(data.getA())-Math.log(data.getD()) );
        return getData;
    }

    /**
     * Level #2
     *
     * @return
     */
    public synchronized Data level2(final Data data){
        Data getData = new Data(data.getA(), data.getB(), data.getC(), data.getD());
        getData.setY( Math.sqrt(Math.pow(data.getX(),2)+Math.pow(data.getX(),2)+4)/data.getZ()+(Math.pow(data.getZ(),2)*2) );
        return getData;
    }

    /**
     * Level #3
     *
     * @return
     */
    public synchronized double level3(final Data data){
        return 0;
    }

    private volatile Data data;
}


class Data {
    /**
     * From task: Version #1 & Level #1
     *
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public Data(double a, double b, double c, double d){
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
    public Data(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    private double x;
    private double y;
    private double a;
    private double b;
    private double c;
    private double d;
    private double z;
}