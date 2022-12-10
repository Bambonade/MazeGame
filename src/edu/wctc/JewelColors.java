package edu.wctc;

public enum JewelColors implements Jewel{
    RED("Red"),ORANGE("Orange"),YELLOW("Yellow"),GREEN("Green"),BLUE("Blue"),PURPLE("Purple"),PINK("Pink"),CYAN("Cyan"),MAGENTA("Magenta"),WHITE("White"),BLACK("Black");
    private final String textValue;
    JewelColors (String t) {this.textValue = t;}

    @Override
    public String getJewelValue() {
        return textValue + " Jewel";
    }

}
