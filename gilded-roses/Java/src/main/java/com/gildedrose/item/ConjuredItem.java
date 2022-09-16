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
        sellIn--;
        if (quality > 1) {
            quality = quality - 2;
        }else if (quality == 1){
            quality = 0;
        }
        // 判断是否过期,过期会加速降低品质
        if (sellIn < 0){
            if (quality > 3){
                quality = quality -4;
            }else {
                quality = 0;
            }
        }
    }
}
