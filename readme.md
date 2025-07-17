# Let's Practice: Dice Rolling Adventure
# Interactive Exercise: Lucky Dice Adventure
## Objective
### <p>In this exercise, you will create a **Dice Rolling Game** in Java where:<p>
#### <p>✅ Players **roll two dice** and aim to reach a target score.<p>
#### <p>✅ The game **tracks the player’s total score**.<p>
#### <p>✅ **Bonus points** are awarded for rolling doubles (both dice showing the same number).<p>
#### <p>✅ The player can **decide to roll again or stop**.<p>
#### <p>✅ The game ends when the player **reaches the target score** or chooses to stop.<P>

### <p>By completing this exercise, you will strengthen your skills in **object-oriented programming, user input handling, and random number generation in Java**.<p>

## Problem Statement
### <p>Create a Java program that:<p>
#### <p>1️⃣ **Defines a Dice class** to simulate rolling a die.<p>
#### <p>2️⃣ **Defines a Game class** to manage the dice rolling and scoring.<p>
#### <p>3️⃣ **Defines a LuckyDiceAdventure class** with a main method to start the game.<P>
# Output
## Dice_class
```
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
```
## Game_class
```
public class Game {
    private Dice dice1;
    private Dice dice2;
    private int score;
    private int targetScore;
    
// constructor to initialize the game with a target score

    public Game (int targetScore){
        this.dice1 = new Dice();
        this.dice2 = new Dice();
        this.score = 0;
        this.targetScore = targetScore;
    }
// method to roll both dice and update the score
    public void rillDice(){
// both the dice have to roll have their own value
        dice1.roll();;
        dice2.roll();
        System.out.println("Dice 1: " + dice1.getValue());
        System.out.println("Dice 2: " + dice2.getValue());
        this.score = dice1.getValue() + dice2.getValue();
        if(dice1.getValue() == dice2.getValue()){
            System.out.println("Complete, You rolled double");
            this.score += 10;
        }
    }  
    
// method to display the current score

    public void displayScore(){
        System.out.println("Current Score: " + this.score);
        System.out.println("Target Score: " + this.targetScore);

    }
// method to check if the target score is reached
    public boolean isTargetReached(){
        return this.score >= this.targetScore;
    }
}
```
## LuckyDiceAdventure_main
```
import java.util.Objects;
import java.util.Scanner;

public class LuckyDiceAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Lucky Dice Adventure!");
        System.out.println("Enter the target score to win: ");
        int targetScore = sc.nextInt();
        sc.nextLine();

        Game game = new Game(targetScore);

        boolean playing = true;
        while ((playing)) {
            System.out.println("Press 'r' to roll the dice, 's' to stop: ");
            
            String choice = sc.nextLine();

        if (Objects.equals(choice, "r")){
            game.rillDice();
            game.displayScore();
            if(game.isTargetReached()){
                System.out.println("Congratulations! You've reached the target score!");

                playing = false;
            }
        }else if (Objects.equals(choice,"s")){
            System.out.println("You chose to stop. have a good day");
            game.displayScore();
            playing = false;
        }else{
            System.out.println("Invalid choice. Please try again");
        }
        }
        sc.close();
    }   
}
```
[githublink]()



