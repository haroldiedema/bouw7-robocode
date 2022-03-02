package org.bouw7;

import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class JavaVoorbeeldRobot extends Robot {

  /**
   *
   */
  public void run() {

    setColors(Color.red, Color.blue, Color.blue); // body,gun,radar

    while (true) {
      ahead(50);
      turnGunRight(360);
      back(100);
      turnGunRight(360); // Spin gun around
    }
  }

  /**
   * Fire when we see a robot
   */
  public void onScannedRobot(ScannedRobotEvent e) {
    fire(1);
  }

  /**
   * We were hit!  Turn perpendicular to the bullet,
   * so our seesaw might avoid a future shot.
   */
  public void onHitByBullet(HitByBulletEvent e) {
    turnLeft(90 - e.getBearing());
  }
}

