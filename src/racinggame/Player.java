/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racinggame;

/**
 *
 * @author peter
 */
public class Player {

    private String name;
    private Athlete guess;

    public Player(String name, Athlete guess) {
        this.name = name;
        this.guess = guess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Athlete getGuess() {
        return guess;
    }

    public void setGuess(Athlete guess) {
        this.guess = guess;
    }
}
