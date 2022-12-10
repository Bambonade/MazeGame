package edu.wctc;

public class StartRoom extends Room{
    public StartRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are in a bunker, surrounded by Russian guns and cans of food";
    }
}
