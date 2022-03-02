package org.bouw7;

import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

/**
 * Voorbeeld robot.
 */
public class JavaSpinBotVoorbeeld extends Robot {
    /**
     * Deze run-methode wordt uitgevoerd zodra het spel start.
     * Zorg ervoor dat je het gedrag van je robot in een while-loop zet.
     */
    public void run() {
        setColors(Color.BLACK, Color.RED, Color.YELLOW);

        while (true) {
            turnGunRight(360);
        }
    }

    /**
     * Wanneer de radar een andere robot ziet, wordt deze methode uitgevoerd.
     */
    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fireBullet(1);
    }
}
