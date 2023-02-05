/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racinggame;

/**
 * A
 *
 * @author peter
 */
import java.util.HashMap;
import java.util.Map;

public class Game {

    private Map<Player, Integer> scores;

    public Game() {
        this.scores = new HashMap<>();
    }

    public void addPlayer(Player player) {
        scores.put(player, 0);
    }

    public void updateScore(Athlete winner) {
        for (Player player : scores.keySet()) {
            if (player.getGuess().equals(winner)) {
                scores.put(player, scores.get(player) + 1);
            }
        }
    }

    public Map<Player, Integer> getScores() {
        return scores;
    }

    public Player getWinner() {
        int maxScore = Integer.MIN_VALUE;
        Player winner = null;
        for (Map.Entry<Player, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }
}
