package BOX;

public class Runner {
    public static void main(String[] args){
        Box bob = new Box(2,6);
        double a = bob.getArea();
        System.out.println(a);

        Box ann = new Box(4,12);
        double p = ann.getPerimeter();
        System.out.println(p);

      
    }
}

