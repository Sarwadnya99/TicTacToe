package src;

import java.util.Random;

/**
 * Class for computer Player
 */
public class Computer extends Player {
    /**
     * constructor
     */
    public Computer(){

    }
    /**
     * method to return the call for the toss
     * @return randomly returns Heads or Tails for the toss
     */
    public char getCall(){
        Random random = new Random();
        char[] array = new char[] {'H', 'T'};
        return array[random.nextInt(2)];
    }
    /**
     * Method to make move
     * @param current position of tic tac toe
     * @return returns the coordinates of the move
     */
    public int[] move(char[][] position){
        int [] moveLoc = new int[2];
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j ++){
                if(position[i][j] == ' '){
                    moveLoc[0] = i;
                    moveLoc[1] = j;
                    return moveLoc;
                }
            }
        }
        return moveLoc;
    }
}
