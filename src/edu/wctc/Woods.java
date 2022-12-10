package edu.wctc;

public class Woods extends Room implements Lootable,Interactable  {
    public Woods(String name) {
        super(name);
    }

    @Override
    public String interact(Player player) {
        player.addToScore(-80);
        player.addToInventory("Bottle of vodka water");
        return "A Russian man offers you a water bottle that is hydrating for coins, but it also has vodka in it...";
    }

    @Override
    public String loot(Player player) {
        player.addToScore(50);
        player.addToInventory("Iskra ration pack");
        return "A very nutritional but dense package of crackers issued to Russian army";
    }

    @Override
    public String getDescription() {
        return "You are surrounded by a field of trees surrounding a lumber yard with small cabins";
    }
}
