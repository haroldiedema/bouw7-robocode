package org.bouw7

import robocode.AdvancedRobot
import robocode.BulletHitBulletEvent
import robocode.BulletHitEvent
import robocode.HitByBulletEvent
import robocode.HitRobotEvent
import robocode.HitWallEvent
import robocode.RoundEndedEvent
import robocode.ScannedRobotEvent
import robocode.StatusEvent

class KotlinAdvancedVoorbeeldRobot : AdvancedRobot() {

    override fun run() {
        while (true) {
            turnGunRight(10.0)
        }
    }

    override fun onHitWall(event: HitWallEvent) {
        println("Hit Wall: $event")
    }

    override fun onBulletHit(event: BulletHitEvent) {
        println("Bullet Hit: $event")
    }

    override fun onBulletHitBullet(event: BulletHitBulletEvent) {
        println("Bullet Hit Bullet: $event")
    }

    override fun onRoundEnded(event: RoundEndedEvent) {
        println("Round Ended: $event")
    }

    override fun onScannedRobot(event: ScannedRobotEvent) {
        println("Scanned Robot: $event")
    }

    override fun onHitByBullet(event: HitByBulletEvent) {
        println("Hit By Bullet: $event")
    }

    override fun onHitRobot(event: HitRobotEvent) {
        println("Hit Robot: $event")
    }

    override fun onStatus(event: StatusEvent) {
        //println("Status: $e")
    }
}