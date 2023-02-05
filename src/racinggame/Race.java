/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racinggame;

/**
 *
 * @author peter
 */
public class Race {

    private Athlete[] contestants;
    private Athlete winner;
    private int[] distances;

    public Race(Athlete[] contestants) {
        this.contestants = contestants;
    }

    public Athlete[] getContestants() {
        return contestants;
    }

    public Athlete getWinner() {
        return winner;
    }

    public void race() {
        int quarters = 4;
        System.out.println("Starting the race!");
        distances = new int[contestants.length];
        for (int i = 0; i < quarters; i++) {
            System.out.println("After quarter " + (i + 1) + ":");
            for (int j = 0; j < contestants.length; j++) {
                int distance = (int) (contestants[j].getSpeed() * Math.random());
                distances[j] += distance;
                System.out.println("\t" + contestants[j].getName() + " has travelled " + distance + " units");
            }
        }
        int maxDistance = Integer.MIN_VALUE;
        for (int i = 0; i < contestants.length; i++) {
            if (distances[i] > maxDistance) {
                maxDistance = distances[i];
                winner = contestants[i];
            }
        }
        System.out.println("Race is over! The winner is " + winner.getName() + " with a total distance of " + maxDistance + " units");
    }
}
