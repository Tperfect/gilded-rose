package com.gildedrose.item;


class ReGildedRose {
    Item[] items;

    public ReGildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.update();
        }
    }
}
