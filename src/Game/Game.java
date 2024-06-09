package Game;

import Game.Objects.GameObjects;
import Game.Objects.Paper;
import Game.Objects.Rock;
import Game.Objects.Scisorrs;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private GameObjects[] objects = {new Rock(), new Paper(), new Scisorrs()};

    public void run() {
        String[] status = {"You lose", "Its a draw", "You win"}; //-1, 0, 1

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int wins = 0;
        for (int i = 0; i < 3; i++) {

            GameObjects obj1 = objects[random.nextInt(objects.length)];

            System.out.println("Choose between: ");
            System.out.println("1.Rock");
            System.out.println("2.Paper");
            System.out.println("3.Scissors");
            System.out.println("> ");

            int objectIndex = scanner.nextInt();
            GameObjects obj2 = objects[objectIndex - 1];


            System.out.println("You chose: " + obj2);
            System.out.println("The computer chose: " + obj1);

            int comparison = obj2.compareTo(obj1);
            System.out.println(status[comparison + 1]);
            wins += comparison;

            System.out.println("\n");
        }
        scanner.close();

        if (wins > 0) {
            System.out.println("You have won the game!");
        } else if (wins < 0) {
            System.out.println("You have lost the game! :(");
        } else {
            System.out.println("It is a draw, try again!");
        }
    }
}
