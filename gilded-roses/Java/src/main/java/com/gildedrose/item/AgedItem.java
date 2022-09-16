package com.gildedrose.item;

/**
 * "Aged Brie"（陈年布利奶酪）的品质`Quality`会随着时间推移而提高
 */
public class AgedItem extends AbstractItem {

    @Override
    public void updateQuality() {
        if (quality < 50) {
            quality++;
        }
    }
}
