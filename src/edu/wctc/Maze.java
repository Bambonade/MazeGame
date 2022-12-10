package edu.wctc;

//blank ally
public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;
    private FactoryCreate jewelFactory;

    public Maze(FactoryCreate jewelFactory) {
        player = new Player();
        currentRoom = new StartRoom("Russian Bunker");
        Shorline shorline = new Shorline("Shorline");
        Woods woods = new Woods("Woods");
        Factory factory = new Factory("Factory");
        currentRoom.setUp(shorline);
        shorline.setEast(woods);
        shorline.setDown(currentRoom);
        woods.setWest(shorline);
        woods.setNorth(factory);
        factory.setSouth(woods);
        this.jewelFactory = jewelFactory;
    }

    public void finish() {
        this.isFinished = true;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public FactoryCreate getJewelFactory() {
        return jewelFactory;
    }

    public String exitCurrentRoom() {
        if (currentRoom instanceof Exitable) {
            ((Exitable) currentRoom).exit(player);
            return ((Exitable) currentRoom).exit(player);
        } else
            return "Sorry there is no exit here";
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }

    public String getPlayerInventory() {
        return player.getInventory();
    }

    public int getPlayerScore() {
        return player.getScore();
    }

    public String interactWithCurrentRoom() {
        if (currentRoom instanceof Interactable) {
            return ((Interactable) currentRoom).interact(player);
        } else {
            return "No interactions are possible.";
        }
    }

    public boolean isFinshed() {

        return isFinished;
    }

    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable) {
            return ((Lootable) currentRoom).loot(player);
        } else return "There is nothing to loot here";
    }

    public boolean move(char ch) {
        if (currentRoom.isValidDirection(ch)) {
            switch (ch) {
                case 'n':
                    currentRoom = currentRoom.north;
                    break;
                case 's':
                    currentRoom = currentRoom.south;
                    break;
                case 'w':
                    currentRoom = currentRoom.west;
                    break;
                case 'e':
                    currentRoom = currentRoom.east;
                    break;
                case 'u':
                    currentRoom = currentRoom.up;
                    break;
                case 'd':
                    currentRoom = currentRoom.down;
                    break;
            }
            return true;
        } else return false;
    }

    public void addRandomJewel() {
        int randomNumber = (int)(Math.random() * (JewelColors.values().length));
        player.addToInventory(jewelFactory.getJewel(randomNumber));
    }
}
