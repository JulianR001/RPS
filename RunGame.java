
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RunGame {
    public static void main(String[] args) {
        RPS game = new RPS();
        RPS.GetResponse();
        RPS.EvalResponse();
        RPS.ChooseWeapon();
        RPS.DetermineOutCome();
        RPS.PrintResult();

    }
}

