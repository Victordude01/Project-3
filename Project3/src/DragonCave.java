import java.util.InputMismatchException;
import java.util.Scanner;

public class DragonCave {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            try {
                System.out.print("You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon"
                        + " is friendly and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight."
                        + "\nWhich cave will you go into? (1 or 2): ");
                int selection = keyboard.nextInt();
                if (selection == 1){
                    System.out.println("\nYou approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front"+
                            "of you! He opens his jaws and...\nGobbles you down in one bite!");
                    break;
                }else if(selection == 2) {
                    System.out.println("\nYou approach the cave...\nIt is dark and mysterious...\nA large dragon appears in front of you" +
                            " and allows you to access he's treasures");
                    break;
                }else{
                    System.out.println("\nPlease pick 1 or 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid character, please select 1 or 2");
                keyboard.nextLine();
            }
        }
    }
}
