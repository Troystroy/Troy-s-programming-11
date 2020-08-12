import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String choices =""; // This is the user input and the choices are "r", "p", "s"
        String userPick = ""; // This depends on the "choices"
        String computerPick = ""; //This is what the computer will choose
        int userWins = 0; // variable userWins is an integer and they are set as 0 since no game has been played yet
        int computerWins = 0; //variable computerWins is an integer and they are set as 0 since no game has been played yet
        int ties = 0;      // variable ties is an integer and it is set as 0 since no game has been played yet.

        boolean keepPlaying = true; //sets the word keepPlaying as a true statement


        System.out.println("Lets play Rock, Paper, Scissors. Choose 'r' for Rock, 'p' for Paper, and 's' for Scissors.");
            //This will print out the sentence to announce the start of the game.


        while (keepPlaying) { //while keepPlaying is true, it will run the codes below


            int random = (int) ((Math.random() * 3) + 1); //This will pick a random number between 1 and 3 as an integer


            System.out.println("*************************************" + "\n" +
                    "User Wins: " + userWins + " Computer Wins: " + computerWins + " Ties: " + ties + "\n" + "User Pick:");
            //This will print out the score


            choices = scan.next();    //This will scan the user input


            if (choices.equals("r")) {    //This shows that if the user chooses is "r" it will mean "rock"
                userPick = "Rock";
            } else if (choices.equals("p")) {  //If the user chooses is "p" it will mean "paper"
                userPick = "Paper";
            } else if (choices.equals("s")) {  //If the user chooses is "s" it will mean "scissors"
                userPick = "Scissors";
            }


            if (random == 1) {           // If the random integer is 1, it will equal "rock"
                computerPick = "Rock";
            } else if (random == 2) {      //If the random integer is 2, it will equal "paper"
                computerPick = "Paper";
            } else if (random == 3) {      //If the random integer is 3, it will equal "scissors"
                computerPick = "Scissors";
            }


            if (computerPick.equals(userPick)) {
                System.out.println("Draw!");
                ties++; //if its a draw it will increase the number of ties by one
            }

            //If user pick is the same as the computer's random pick it will print out "Draw!"


            else if (userPick.equals("Rock")) {
                if (computerPick.equals("Paper")) {
                    System.out.println("You lose!");
                    computerWins++;//when computer wins this will increase the number of computerWins by one
                }
                if (computerPick.equals("Scissors")) {
                    System.out.println("You win!");
                    userWins++;//when user wins this will increase the number of userWins by one
                }
            }
        /*If user pick is Rock then it will print out that the user won if the computer picks Scissors or it will print
        out that the user lost if the computer picks Paper
         */

            else if (userPick.equals("Paper")) {
                if (computerPick.equals("Rock")) {
                    System.out.println("You win!");
                    userWins++;//when user wins this will increase the number of userWins by one
                }
                if (computerPick.equals("Scissors")) {
                    System.out.println("You lose!");
                    computerWins++;//when computer wins this will increase the number of computerWins by one
                }
            }
        /*If user pick is paper, it will print out that the user won if the computer picks rock or it will print out
        that the user lost if the computer pick is scissors
         */

            else if (userPick.equals("Scissors")) {
                if (computerPick.equals("Rock")) {
                    System.out.println("You lose!");
                    computerWins++;//when computer wins this will increase the number of computerWins by one
                }
                if (computerPick.equals("Paper")) {
                    System.out.println("You win!");
                    userWins++;//when the user wins this will increase the number of userWins by one
                }
            }
        /*If the user pick is scissors, it will print out that the user won if the computer picks paper or it will print
        out that the user lost if the computer pick is rock
         */
            if (choices.equals("x")) {
                System.out.println("Thank you for playing!");
                break;
                //If the user chooses "x" it will exit the game
            }


            if (choices.equals("r") || choices.equals("p") || choices.equals("s")) {
                System.out.println("User Pick: " + userPick + " " + "Computer Pick: " + computerPick + "\n" +
                        "*************************************");
            } else {
                System.out.println("Invalid selection please try again");

            }
        }

        /* This shows that if the user choice is equal to any of "r", "p", "s", it will print out what the user picked
        and what the computer picked. Else if user chooses any other letter that is not in the list above, it will print
        out "Invalid selection please try again."
         */




    }
}
