package com.gildedrose.item;

import com.gildedrose.Item;

/**
 * "Backstage passes"（后台通行证）与"Aged Brie"（陈年布利奶酪）类似，其品质`Quality`会随着时间推移而提高；
 */
public class BackstageItem extends AbstractItem {

    public BackstageItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        sellIn--;
        if (sellIn < 0) {
            quality = 0;
            return;
        }
        if (quality < 50) {
            quality++;
        }
        if (sellIn < 11) {
            if (quality < 50) {
                quality++;
            }
        }
        // 当还剩5天或更少的时候，品质`Quality`每天提高3；
        if (sellIn < 6) {
            if (quality < 50) {
                quality++;
            }
        }
    }
}
