/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package racinggame;

/**
 *
 * @author peter
 */
public class RacingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Athlete athlete1 = new Athlete("bob");
        Athlete athlete2 = new Athlete("ted");
        Athlete athlete3 = new Athlete("fred");

        Athlete[] athletes = {athlete1, athlete2, athlete3};
        Race race = new Race(athletes);

        Athlete[] contestants = race.getContestants();
        for (Athlete contestant : contestants) {
            System.out.println("Contestant: " + contestant.getName());
        }

        Player player1 = new Player("Alice", athlete1);
        Player player2 = new Player("Ben", athlete2);
        Player player3 = new Player("Charlie", athlete3);

        Game game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);

        race.race();
        Athlete winner = race.getWinner();
        game.updateScore(winner);
        System.out.println("The winning betting player is: " + game.getWinner().getName() + " with " + game.getScores().get(game.getWinner()) + " correct guess");
    }
}
