package com.gildedrose.item;

/**
 * 创建物品的工厂类
 */
public class ItemFactory {

    public static Item getItem(com.gildedrose.Item item){
        if ("Aged Brie".equals(item.name)){
            return new AgedItem(item);
        }else if ("Sulfuras, Hand of Ragnaros".equals(item.name)){
            return new SulfurasItem(item);
        }else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.name)){
            return new BackstageItem(item);
        }else if ("Conjured Mana Cake".equals(item.name)){
            return new ConjuredItem(item);
        }
        return new NormalItem(item);
    }
}
