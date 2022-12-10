package edu.wctc;

public class ItemStrategy implements ObtainabilityStrategy{
    Player player;
    String item;

    public ItemStrategy(Player player, String item){
        this.player = player;
        this.item = item;
    }

    @Override
    public boolean obtain(boolean initialObtainability) {
        if(player.getInventory().contains(item)) return true;
        else return false;
    }
}
