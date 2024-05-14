package DICE;
import java.util.Random;
public class Dice2{
private int die1,die2;

public Dice2(){
    Random rand = new Random();
    die1 = rand.nextInt(6);
    die2 = rand.nextInt(6);
  
   
   
    
}

public void roll(){
    Random rand = new Random();
    die1 = rand.nextInt(6);
    die2 = rand.nextInt(6);
   
}

public int getTotal(){
    int sum = die1 + die2;
    return sum;
}
}
