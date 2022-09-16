package com.gildedrose.item;

import com.gildedrose.Item;

/**
 * - "Conjured"（召唤物品）的品质`Quality`下降速度比正常物品快一倍
 */
public class ConjuredItem extends AbstractItem {

    public ConjuredItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        super.updateQuality();
        super.updateQuality();
    }
}
