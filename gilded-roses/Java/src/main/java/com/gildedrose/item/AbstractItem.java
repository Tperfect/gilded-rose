package com.gildedrose.item;

public abstract class AbstractItem implements Item {

    public String name;

    //销售期限：表示我们要在多少天之前把物品卖出去
    public int sellIn;

    // 表示物品的品质
    public int quality;

    public AbstractItem(com.gildedrose.Item item) {
        this.name = item.name;
        this.sellIn = item.sellIn;
        this.quality = item.quality;
    }

    @Override
    public void updateQuality() {
        if (quality > 0) {
            quality--;
        }
        // 判断是否过期,过期会加速降低品质
        if (quality > 0 && sellIn < 0) {
            quality--;
        }
    }

    @Override
    public void updateSellIn() {
        sellIn--;
    }

    @Override
    public void update() {
        updateSellIn();
        updateQuality();
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
