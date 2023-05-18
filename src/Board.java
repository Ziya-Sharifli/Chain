// Beginning of Board class
// Board Size: 10x16


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Board {

    static Random random = new Random();
    static Scanner keyboard = new Scanner(System.in);
    static int seedInput = 0;

    Board(){
        board();
    }

    void board() {

        String[][] boardArray = new String [10][16];

        random.setSeed(seedInput);


        for (int i = 0; i < boardArray.length; i++) { // outer for loop that iterates over all the rows in the 2D array
            for (int j = 0; j < boardArray[i].length; j++) { // inner for loop that iterates over the row that the previous for loop selected
                boardArray[i][j] = String.valueOf(random.nextInt(9)+1); // fills the row with random numbers,
                                                                                 // min value: 1, max value: 9
            }
        }

        System.out.println(Arrays.deepToString(boardArray).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println("Board seed: "+seedInput);

    }

    public static int setSeed() {

        System.out.println("Enter the seed for the board: ");
        seedInput = keyboard.nextInt();

        random.setSeed(seedInput);

        return seedInput;

    }


}
