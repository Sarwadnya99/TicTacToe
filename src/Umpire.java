package src;

import java.util.Random;

/**
 * Class for Umpire Type
 */
public class Umpire {
    /**
     * Constructor
     */
    public Umpire(){

    }
    /**
     * Method to Decide caller for Toss
     * @return random integer 0/1. 0 denoting Human, 1 denoting computer to call
     */
    public int decideCaller(){
        Random random = new Random();
        int caller = random.nextInt(2);
        return caller;
    }
    /**
     * Method to set called value
     */
    public void setCalled(char call){
        this.call = call;
    }
    /**
     * Method to make Toss
     * @return random integer denoting who won the toss. 0 = Human, 1 = Computer
     */
    public boolean makeToss(){
        Random random = new Random();
        int toss = random.nextInt(2);
        if(toss == call){
            return true;
        }else {
            return false;
        }
    }
    /**
     * method to check if a move is valid or not
     * @return the validity of the move as a boolean
     */
    public boolean isValidMove(int[] moveLoc, char[][] position){
        boolean validity = false;
        if(position[moveLoc[0]][moveLoc[1]] == ' ')
            validity = true;
        return validity;
    }
    /**
     * Method to decide if the game is won
     * @return true if the game is won and vice versa
     */
    public boolean checkGame(char[][] position){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(position[i][j] + "|");
            }
            if(i < 2){
                System.out.println();
                System.out.println("______");
            }
        
        }
        System.out.println();
        System.out.println("*********************************************");
        boolean gameOver = false;
        if(checkRows(position) || checkColumns(position) || checkDiagonals(position)){
            gameOver = true;
        }
        return gameOver;
    }
    private boolean checkRows(char[][] position){
        for(int i = 0; i < 3; i++){
            int c1 = 0, c2 = 0;
            for(int j = 0; j < 3; j++){
                if(position[i][j] == 'X'){
                    c1 ++;
                }
                else if(position[i][j] == 'O'){
                    c2 ++;
                }
            }
            if(c1 == 3 || c2 == 3){
                return true;
            }
        }
        return false;
    }
    private boolean checkColumns(char[][] position){
        for(int i = 0; i < 3; i++){
            int c1 = 0, c2 = 0;
            for(int j = 0; j < 3; j++){
                if(position[j][i] == 'X'){
                    c1 ++;
                }
                else if(position[j][i] == 'O'){
                    c2 ++;
                }
            }
            if(c1 == 3 || c2 == 3){
                return true;
            }
        }
        return false;
    }
    private boolean checkDiagonals(char [][] position){
        if(position[0][0] != ' ' && position[0][0] == position[1][1] && position[1][1] == position[2][2]){
            return true;
        }
        if(position[0][2] != ' ' && position [0][2] == position[1][1] && position[1][1] == position[2][0]){
            return true;
        }
        return false;
    }
    private char call;
}
