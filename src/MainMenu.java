// MainMenu class for the Chain project!


import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

    Scanner keyboard = new Scanner(System.in);

    String menuChoice;

    public final String ANSI_RESET = "\u001B[0m";
    public final String ANSI_BLACK = "\u001B[30m";
    public final String ANSI_RED = "\u001B[31m";
    public final String ANSI_GREEN = "\u001B[32m";
    public final String ANSI_YELLOW = "\u001B[33m";
    public final String ANSI_BLUE = "\u001B[34m";
    public final String ANSI_PURPLE = "\u001B[35m";
    public final String ANSI_CYAN = "\u001B[36m";
    public final String ANSI_WHITE = "\u001B[37m";

    MainMenu(){
        mainMenu();
    }

    void mainMenu() {

        while (true) {

            System.out.println(ANSI_YELLOW + "== Chain Game BETA ==" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "\nWhat would you like to do?" + ANSI_RESET);
            System.out.println(ANSI_BLUE+"1. Set a seed for the board (Default :0)" + ANSI_RESET);
            System.out.println(ANSI_PURPLE+"2. Start the game"+ANSI_RESET);
            System.out.println(ANSI_RED+"Q. Quit the program"+ANSI_RESET);
            System.out.println(ANSI_WHITE+"Enter your command: \n"+"-> "+ANSI_RESET);

            menuChoice = keyboard.next();

            switch (menuChoice) {
                case "1" -> {
                    Board.setSeed();
                    menuSkip();
                }
                case "2" -> {
                    new Board();
                    menuSkip();
                }
                case "q","Q" -> {
                    System.out.println(ANSI_RED+"Stopped the program successfully"+ANSI_RESET);
                    System.exit(0);
                }
            }
        }
    }

    void menuSkip() {

        try {
            System.out.print("Press ENTER to go back to the Main Menu -> ");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Error 1: Java IOEXCEPTION");
        }
    }

}
