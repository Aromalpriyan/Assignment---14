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
