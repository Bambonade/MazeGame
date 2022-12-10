package edu.wctc;

public class JewelFactory implements FactoryCreate{
    @Override
    public String getJewel(int index){
        return JewelColors.values()[index].getJewelValue();
    }
}
