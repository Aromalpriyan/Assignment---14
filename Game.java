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

