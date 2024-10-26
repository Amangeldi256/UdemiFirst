package org.company.UdemiUrok.OOP.Inheritance;

public class GameRunner {
    public static void main(String[] args) {
        GamingConsole[] games = {new MarioGame(), new ChessGame()};
        for (GamingConsole game : games) {
            game.up();
            game.down();
            game.right();
            game.left();
        }

    
    }

}
