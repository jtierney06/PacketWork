package CIRCLE;

public class CircleRunner {
    public static void main(String[] args){
        Circle bob = new Circle(3);
        double c = bob.getC();
        System.out.println(c);
        double a = bob.getArea();
        System.out.println(a);
        bob.changeR();
        double b = bob.getArea();
        System.out.println(b);
    }
    

}
