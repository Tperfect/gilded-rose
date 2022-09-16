package com.gildedrose.item;

/**
 * - "Conjured"（召唤物品）的品质`Quality`下降速度比正常物品快一倍
 */
public class ConjuredItem extends AbstractItem {

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
