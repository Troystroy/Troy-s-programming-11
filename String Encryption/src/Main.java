import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userWord ="";
        String computerWord="dsy";

        System.out.println("Please type in a word");


            userWord = scan.next();


            System.out.println(userWord + " -> " + userWord.substring(userWord.length() - 1) +
                    (userWord.substring(0,userWord.length()-1)) + computerWord + " -> " + userWord);





















    }
}
