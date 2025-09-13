package com.zertical.javaProject;

public class main {

    public static void main(String[] args) {
        int health = 100;
        double speed = 10.0;
        boolean isAlive = true;

        printStats("Isak", 100, 10.0, true);
        health = DamagePlayer(health, 10);

        if (health <= 0) {
            System.out.println("You died");
            isAlive = false;
        }
    }

    public static void printStats(String playerName, int health, double speed, boolean isAlive) {
        System.out.println("Player name is" + playerName);
        System.out.println("Health is" + health);
        System.out.println("Speed is" + speed);
        System.out.println("Is alive is" + isAlive);


// test
    }

    public static int DamagePlayer(int health, int damage) {
        return  health - damage;
    }
}
