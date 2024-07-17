package src;
/**
 * Class for arbitrer
 */
public class Arbitrer {
     /**
      * Constructor
      */
    public Arbitrer(){

    }
    /**
     * Mehtod which plays the actual game
     * @param user the user player
     * @param computer the computer that plays against the player
     * @param umpire the umpire to assist and decide in the game
     * @return the winner of the game
     */
    public Player game(Human user, Computer computer, Umpire umpire){
        Player winner;
        int caller = umpire.decideCaller();
        char call;
        if(caller == 0){
            call = user.makeCall();
        } else{
            call = computer.getCall();
        }
        umpire.setCalled(call);
        boolean toss = umpire.makeToss();
        char[][] position = new char[][]{
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        boolean moveMaker = toss ? (caller == 0 ? true : false) : (caller == 0 ? false : true);
        while(!umpire.checkGame(position)){
            int [] move = moveMaker ? user.move() : computer.move(position);
            char symbol = moveMaker ? 'X' : 'O';
            if(!moveMaker){
                System.out.println("Computer Played :");
            }
            if(umpire.isValidMove(move, position)){
                position[move[0]][move[1]] = symbol;
            }
            moveMaker = !moveMaker;
        }
        winner = !moveMaker ? user : computer;
        if(!moveMaker){
            user.setWinner();
        } else{
            computer.setWinner();
        }
        return winner;
    }
}
