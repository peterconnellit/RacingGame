/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racinggame;

import java.util.Random;

/**
 *
 * @author peter
 */
public class Athlete {

    private String name;
    private int speed;
    private int odds;

    public Athlete(String name) {
        this.name = name;
        Random random = new Random();
        this.speed = random.nextInt(100) + 1;
        setOddsBasedOnSpeed();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setRandomSpeed() {
        Random random = new Random();
        this.speed = random.nextInt(100) + 1;
    }

    public int getOdds() {
        return odds;
    }

    public void setOddsBasedOnSpeed() {
        if (speed >= 80) {
            this.odds = 3;
        } else if (speed >= 60) {
            this.odds = 2;
        } else {
            this.odds = 1;
        }
    }

}
