package edu.wctc;

import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Player {
    int score;
    List<String> inventory = new ArrayList<>();

    public void addToInventory(String str) {
        inventory.add(str);
    }

    public void addToScore(int num) {
        score += num;
    }

    public String getInventory() {
        return inventory.toString();
    }

    public int getScore() {
        return score;
    }
}
