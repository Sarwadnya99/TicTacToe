package src;

import java.util.Scanner;

/**
 * Class for Human Player
 */
public class Human extends Player{
    /**
     * Constructor
     */
    public Human(String name){
        this.name = name;
    }
    /**
     * method to get the name of the player
     * @return the player name
     */
    public String getName(){
        return this.name;
    }
    /**
     * Get call for the toss
     * @return char H/T denoting the call for the toss made by the human based on input
     */
    public char makeCall(){
        System.out.println("Please enter your call for the toss either Heads / Tails");
        Scanner sc = new Scanner(System.in);
        char call = sc.nextLine().charAt(0);
        return call;
    }
    /**
     * Method to make the move
     * @param Current position of the tic tac toe
     * @return Coordinates of the move
     */
    public int[] move(){
        System.out.println("Please enter your move");
        int [] moveLoc = new int[2];
        Scanner sc = new Scanner(System.in);
        moveLoc[0] = sc.nextInt();
        moveLoc[1] = sc.nextInt();
        sc.nextLine();
        return moveLoc;
    }
    private String name;
}
