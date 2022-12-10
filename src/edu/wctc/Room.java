package edu.wctc;

public abstract class Room {
    String name;
    Room north;
    Room east;
    Room south;
    Room west;
    Room up;
    Room down;

    public Room(String name) {
        this.name = name;
    }

    public Room getAdjoiningRoom(char roomCode) {
        switch (roomCode) {
            case 'n':
                return north;
            case 'e':
                return east;
            case 's':
                return west;
            case 'w':
                return south;
            case 'u':
                return up;
            case 'd':
                return down;
            default:
                return null;
        }
    }

    public abstract String getDescription();

    public String getExits() {
        String openDirection = "";
        if (north != null) {
            openDirection += "North ";
        }
        if (east != null) {
            openDirection += "East ";
        }
        if (south != null) {
            openDirection += "South ";
        }
        if (west != null) {
            openDirection += "West ";
        }
        if (up != null) {
            openDirection += "Up ";
        }
        if (down != null) {
            openDirection += "Down ";
        }
        return openDirection;
    }

    public String getName() {
        return name;
    }

    public boolean isValidDirection(char ch) {
        if (getAdjoiningRoom(ch) != null)
            return true;
        else return false;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }
}

