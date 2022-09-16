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
        // 这里有点理解上的问题，Aged Brie如果过期了会不会加速提高品质？，如果会加倍就需要这行代码。
        if (sellIn < 0 && quality < 50){
            quality++;
        }
    }
}
