package edu.wctc;

public class Shorline extends Room implements Lootable  {

    public Shorline(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "A beautiful hillside resort with an ocean view surrounded by small towns";
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("Beach-ball");
        player.addToScore(50);
        return "There is an empty beach full of random beach toys in front of you";

    }
}
