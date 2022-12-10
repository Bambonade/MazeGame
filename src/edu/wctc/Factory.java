package edu.wctc;

public class Factory extends Room implements Exitable {
    public Factory(String name) { super(name); }

    @Override
    public String exit(Player player) {
        return "You have reached gate 03, now is your time to escape.";
    }

    @Override
    public String getDescription() {
        return "You enter an old Russian factory filled with many gates. Raiders surround the area";
    }
}
