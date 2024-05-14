package DICE;

public class DiceRunner {
    public static void main(String[] args){
       Dice2 d = new Dice2();
       d.roll();
       int n = d.getTotal();
       System.out.println(n);

           d.roll();
           n = d.getTotal();
           System.out.println(n);
        
    }
}
