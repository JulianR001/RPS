
/**
 * Write a description of class RPS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class RPS {
    static String Response = new String();
    static boolean validLength;
    static boolean validWeapon;
    static boolean validResponse;
    static boolean CompWins;
    static boolean PlayerWins;
    static boolean Draw;
    static int PlayerWeapon;
    static String CompResponse = new String();
    static int GameWeapon;
    public RPS() {
        /* Get Response function 
         * Evaluate Response
         * Print result
         */
    }

    public static void GetResponse() {
        Scanner in = new Scanner(System.in);
        System.out.println("Human, lets play a game of rock paper scissors");
        //print "your response"
        Response = in.nextLine();
        Response = Response.toLowerCase();
    }

    public static void EvalResponse() {
        // check # of characters
        if (Response.length() >= 10) 
            validLength = true;
        else 
            validLength = false;
        // check weapon

        if (Response.endsWith("rock") || Response.endsWith("scissors") || Response.endsWith("paper"))
            validWeapon = true;
        if(validWeapon && validLength) 
            validResponse = true;
        if (Response.endsWith("rock"))
            PlayerWeapon = 1;
        if (Response.endsWith("scissors"))
            PlayerWeapon = 2;
        if (Response.endsWith("paper"))
            PlayerWeapon = 3;
        if (validWeapon && validLength) 
        System.out.println(" ");
        System.out.print("Behold my legendary ");
        if (!(validWeapon))
            System.out.println("You have failed to adhere to the ancient" +
                " traditions of Rock, Paper, Crossblades!" 
                + " You have lost by disqualification! Disgraceful");
        if (!(validLength) && validWeapon) {
            System.out.println("Pathetic. You cannot hope to beat me without" + 
                " the passion of a thousand suns,");
            System.out.print("without the dedication of a Pleistocene glacier! I choose ");
        }
    }

    public static void ChooseWeapon() {
        if (validWeapon)
            GameWeapon = (int) (Math.random() * 3) + 1;

        if (!(validLength)) {
            GameWeapon = PlayerWeapon - 1;

            if (GameWeapon == 0) 
                GameWeapon = 3;
        }
        if (GameWeapon == 1)
            CompResponse = "Rock";

        if (GameWeapon == 2)
            CompResponse = "scissors";

        if (GameWeapon == 3)
            CompResponse = "paper";

        System.out.println(CompResponse);
        System.out.println(" ");
    }

    public static void DetermineOutCome() {
        if (validWeapon) {
            if (GameWeapon == PlayerWeapon)
                Draw = true;
            if ((GameWeapon == 1 && PlayerWeapon == 2) || (GameWeapon == 2 && PlayerWeapon == 3) || (GameWeapon == 3 && PlayerWeapon == 1))
                CompWins = true;
            if ((GameWeapon == 2 && PlayerWeapon == 1) || (GameWeapon == 3 && PlayerWeapon == 2) || (GameWeapon == 1 && PlayerWeapon == 3))
                PlayerWins = true;
        } 
    }

    public static void PrintResult() {
        if(CompWins)
            System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
        if(PlayerWins)
            System.out.println("Result: Unbelievable, you.. you beat ME?");
        if(Draw)
            System.out.println("Result: Unbelievable! We have tied! *Eye twitches*");

    }
}

