package CIRCLE;
public class Circle {
    private double radius;
    public Circle(double r){
        radius = r;
    }
    public double getArea(){
        double a = Math.PI*radius*radius;
        return a;
    }

    public double getC(){
        double c = 2*(Math.PI*radius);
        return c;
    }

    
    public void changeR(){
        radius = 1;
    }
}
