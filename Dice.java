import java.util.Random;

public class Dice {
    private int value;

// constructor
    public Dice(){
        value = 1;
    }    
// method to roll the dice
    public void roll(){
        Random rand = new Random();
        this.value = rand.nextInt(6)+1;
    }
// method to get current value of the dice
    public int getValue(){
        return this.value;
    }
}
