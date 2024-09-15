package src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Lets Play Tic Tac Toe!!! But Dont hurt your Toe :)");
        Arbitrer arbitrer = new Arbitrer();
        System.out.print("Plese state your name for the Game : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Human user = new Human(name);
        Computer computer = new Computer();
        Umpire umpire = new Umpire();
        Player winner = arbitrer.game(user, computer, umpire);
        if(Human.class == winner.getClass()){
            System.out.println("Congratulations " + name + "! You Won!!!");
        } else{
            System.out.println("Better Luck Next Time :(");
        }
    }
}
