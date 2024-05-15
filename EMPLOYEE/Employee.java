package EMPLOYEE;

public class Employee {
    private double salary;
    private double increase;
    public Employee(double s){
        salary = s;
    }

    public void increase(double i){
        if(i > 0){
            salary += i;
        }
       
    }

    public double getPay(){
        double p = salary + increase;
        return p;
    }
}
