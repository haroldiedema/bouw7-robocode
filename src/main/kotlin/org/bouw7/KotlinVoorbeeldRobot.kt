package org.bouw7

import robocode.HitByBulletEvent
import robocode.Robot
import robocode.ScannedRobotEvent
import java.awt.Color

class KotlinVoorbeeldRobot : Robot() {

    override fun run() {
        setColors(Color.red, Color.red, Color.green) // body,gun,radar

        while (true) {
            ahead(100.0)
            turnGunRight(360.0)
            back(100.0)
            turnGunRight(360.0)
        }
    }

    override fun onScannedRobot(event: ScannedRobotEvent) {
        fire(1.0)
    }

    override fun onHitByBullet(event: HitByBulletEvent) {
        turnLeft(90 - event.bearing)
    }
}