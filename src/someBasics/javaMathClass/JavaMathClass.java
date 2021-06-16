package someBasics.javaMathClass;

public class JavaMathClass {

    double x;
    double y;
    double z;


    public JavaMathClass(double x, double y) {
        this.x = x;
        this.y = y;
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

    public double mathClass(){
        return Math.max(this.x, this.y);
    }

    public double getHypoten(){
        double z = 0;
        double zTo2 = Math.sqrt(z);

       return z = (int) Math.sqrt((x*x)+(y*y));

    }
}
