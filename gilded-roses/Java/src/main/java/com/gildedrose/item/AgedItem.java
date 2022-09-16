package com.gildedrose.item;

import com.gildedrose.Item;

/**
 * "Aged Brie"（陈年布利奶酪）的品质`Quality`会随着时间推移而提高
 */
public class AgedItem extends AbstractItem {

    public AgedItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            quality++;
        }
    }
}
