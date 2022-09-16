package com.gildedrose;

public class Item {

    public String name;

    //销售期限：表示我们要在多少天之前把物品卖出去
    public int sellIn;

    // 表示物品的品质
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
