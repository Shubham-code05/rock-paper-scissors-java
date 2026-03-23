import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"rock", "paper", "scissors"};

        System.out.println("🎮 Welcome to Rock Paper Scissors Game!");

        while (true) {

            // User input
            System.out.print("\nEnter your choice (rock, paper, scissors or exit): ");
            String userChoice = sc.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("👋 Thanks for playing!");
                break;
            }

            // Validate input
            if (!userChoice.equals("rock") && 
                !userChoice.equals("paper") && 
                !userChoice.equals("scissors")) {

                System.out.println("❌ Invalid choice! Try again.");
                continue;
            }

            // Computer choice
            String computerChoice = options[rand.nextInt(3)];

            System.out.println("💻 Computer chose: " + computerChoice);

            // Game logic
            if (userChoice.equals(computerChoice)) {
                System.out.println("🤝 It's a Tie!");
            }
            else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("🎉 You Win!");
            }
            else {
                System.out.println("😢 You Lose!");
            }
        }

        sc.close();
    }
}